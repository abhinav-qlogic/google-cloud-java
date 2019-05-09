/*
 * Copyright 2015 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.datastore;

import com.google.cloud.datastore.Query.ResultType;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.datastore.v1.QueryResultBatch;
import com.google.datastore.v1.QueryResultBatch.MoreResultsType;
import com.google.protobuf.ByteString;
import java.util.Iterator;
import java.util.Objects;

class QueryResultsImpl<T> extends AbstractIterator<T> implements QueryResults<T> {

  private final DatastoreImpl datastore;
  private final com.google.datastore.v1.ReadOptions readOptionsPb;
  private final com.google.datastore.v1.PartitionId partitionIdPb;
  private final ResultType<T> queryResultType;
  private Query<T> query;
  private ResultType<?> actualResultType;
  private com.google.datastore.v1.RunQueryResponse runQueryResponsePb;
  private com.google.datastore.v1.Query mostRecentQueryPb;
  private boolean lastBatch;
  private Iterator<com.google.datastore.v1.EntityResult> entityResultPbIter;
  private ByteString cursor;
  private MoreResultsType moreResults;

  QueryResultsImpl(
      DatastoreImpl datastore, com.google.datastore.v1.ReadOptions readOptionsPb, Query<T> query) {
    this.datastore = datastore;
    this.readOptionsPb = readOptionsPb;
    this.query = query;
    queryResultType = query.getType();
    com.google.datastore.v1.PartitionId.Builder pbBuilder =
        com.google.datastore.v1.PartitionId.newBuilder();
    pbBuilder.setProjectId(datastore.getOptions().getProjectId());
    if (query.getNamespace() != null) {
      pbBuilder.setNamespaceId(query.getNamespace());
    } else if (datastore.getOptions().getNamespace() != null) {
      pbBuilder.setNamespaceId(datastore.getOptions().getNamespace());
    }
    partitionIdPb = pbBuilder.build();
    sendRequest();
    if (runQueryResponsePb.getBatch().getSkippedResults() > 0) {
      cursor = runQueryResponsePb.getBatch().getSkippedCursor();
    } else {
      cursor = mostRecentQueryPb.getStartCursor();
    }
  }

  private void sendRequest() {
    com.google.datastore.v1.RunQueryRequest.Builder requestPb =
        com.google.datastore.v1.RunQueryRequest.newBuilder();
    if (readOptionsPb != null) {
      requestPb.setReadOptions(readOptionsPb);
    }
    requestPb.setPartitionId(partitionIdPb);
    query.populatePb(requestPb);
    runQueryResponsePb = datastore.runQuery(requestPb.build());
    mostRecentQueryPb = runQueryResponsePb.getQuery();
    if (mostRecentQueryPb == null) {
      mostRecentQueryPb = requestPb.getQuery();
    }
    moreResults = runQueryResponsePb.getBatch().getMoreResults();
    lastBatch = moreResults != MoreResultsType.NOT_FINISHED;
    entityResultPbIter = runQueryResponsePb.getBatch().getEntityResultsList().iterator();
    actualResultType = ResultType.fromPb(runQueryResponsePb.getBatch().getEntityResultType());
    if (Objects.equals(queryResultType, ResultType.PROJECTION_ENTITY)) {
      // projection entity can represent all type of results
      actualResultType = ResultType.PROJECTION_ENTITY;
    }
    Preconditions.checkState(
        queryResultType.isAssignableFrom(actualResultType),
        "Unexpected result type " + actualResultType + " vs " + queryResultType);
  }

  @Override
  protected T computeNext() {
    while (!entityResultPbIter.hasNext() && !lastBatch) {
      query = query.nextQuery(runQueryResponsePb);
      sendRequest();
    }
    if (!entityResultPbIter.hasNext()) {
      cursor = runQueryResponsePb.getBatch().getEndCursor();
      return endOfData();
    }
    com.google.datastore.v1.EntityResult entityResultPb = entityResultPbIter.next();
    cursor = entityResultPb.getCursor();
    @SuppressWarnings("unchecked")
    T result = (T) actualResultType.convert(entityResultPb.getEntity());
    return result;
  }

  @Override
  public Class<?> getResultClass() {
    return actualResultType.resultClass();
  }

  @Override
  public Cursor getCursorAfter() {
    return new Cursor(cursor);
  }

  @Override
  public int getSkippedResults() {
    return runQueryResponsePb.getBatch().getSkippedResults();
  }

  @Override
  public MoreResultsType getMoreResults() {
    return moreResults;
  }

  @Override
  public int countEntities() {
    return count();
  }

  private int count() {
    int count = 0;
    Integer limit = ((KeyQuery) this.query).getLimit();
    if (null != limit && limit == 0) {
      QueryResultBatch queryResultBatch = runQueryResponsePb.getBatch();
      count = queryResultBatch.getSkippedResults();
      while (queryResultBatch.getMoreResults()
          != QueryResultBatch.MoreResultsType.NO_MORE_RESULTS) {
        count += queryResultBatch.getSkippedResults();
      }
    }
    return count;
  }
}
