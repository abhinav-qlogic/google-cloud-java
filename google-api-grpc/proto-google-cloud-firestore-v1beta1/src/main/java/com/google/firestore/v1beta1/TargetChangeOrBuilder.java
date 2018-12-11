// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/firestore.proto

package com.google.firestore.v1beta1;

public interface TargetChangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1beta1.TargetChange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of change that occurred.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.TargetChange.TargetChangeType target_change_type = 1;</code>
   */
  int getTargetChangeTypeValue();
  /**
   *
   *
   * <pre>
   * The type of change that occurred.
   * </pre>
   *
   * <code>.google.firestore.v1beta1.TargetChange.TargetChangeType target_change_type = 1;</code>
   */
  com.google.firestore.v1beta1.TargetChange.TargetChangeType getTargetChangeType();

  /**
   *
   *
   * <pre>
   * The target IDs of targets that have changed.
   * If empty, the change applies to all targets.
   * For `target_change_type=ADD`, the order of the target IDs matches the order
   * of the requests to add the targets. This allows clients to unambiguously
   * associate server-assigned target IDs with added targets.
   * For other states, the order of the target IDs is not defined.
   * </pre>
   *
   * <code>repeated int32 target_ids = 2;</code>
   */
  java.util.List<java.lang.Integer> getTargetIdsList();
  /**
   *
   *
   * <pre>
   * The target IDs of targets that have changed.
   * If empty, the change applies to all targets.
   * For `target_change_type=ADD`, the order of the target IDs matches the order
   * of the requests to add the targets. This allows clients to unambiguously
   * associate server-assigned target IDs with added targets.
   * For other states, the order of the target IDs is not defined.
   * </pre>
   *
   * <code>repeated int32 target_ids = 2;</code>
   */
  int getTargetIdsCount();
  /**
   *
   *
   * <pre>
   * The target IDs of targets that have changed.
   * If empty, the change applies to all targets.
   * For `target_change_type=ADD`, the order of the target IDs matches the order
   * of the requests to add the targets. This allows clients to unambiguously
   * associate server-assigned target IDs with added targets.
   * For other states, the order of the target IDs is not defined.
   * </pre>
   *
   * <code>repeated int32 target_ids = 2;</code>
   */
  int getTargetIds(int index);

  /**
   *
   *
   * <pre>
   * The error that resulted in this change, if applicable.
   * </pre>
   *
   * <code>.google.rpc.Status cause = 3;</code>
   */
  boolean hasCause();
  /**
   *
   *
   * <pre>
   * The error that resulted in this change, if applicable.
   * </pre>
   *
   * <code>.google.rpc.Status cause = 3;</code>
   */
  com.google.rpc.Status getCause();
  /**
   *
   *
   * <pre>
   * The error that resulted in this change, if applicable.
   * </pre>
   *
   * <code>.google.rpc.Status cause = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getCauseOrBuilder();

  /**
   *
   *
   * <pre>
   * A token that can be used to resume the stream for the given `target_ids`,
   * or all targets if `target_ids` is empty.
   * Not set on every target change.
   * </pre>
   *
   * <code>bytes resume_token = 4;</code>
   */
  com.google.protobuf.ByteString getResumeToken();

  /**
   *
   *
   * <pre>
   * The consistent `read_time` for the given `target_ids` (omitted when the
   * target_ids are not at a consistent snapshot).
   * The stream is guaranteed to send a `read_time` with `target_ids` empty
   * whenever the entire stream reaches a new consistent snapshot. ADD,
   * CURRENT, and RESET messages are guaranteed to (eventually) result in a
   * new consistent snapshot (while NO_CHANGE and REMOVE messages are not).
   * For a given stream, `read_time` is guaranteed to be monotonically
   * increasing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 6;</code>
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * The consistent `read_time` for the given `target_ids` (omitted when the
   * target_ids are not at a consistent snapshot).
   * The stream is guaranteed to send a `read_time` with `target_ids` empty
   * whenever the entire stream reaches a new consistent snapshot. ADD,
   * CURRENT, and RESET messages are guaranteed to (eventually) result in a
   * new consistent snapshot (while NO_CHANGE and REMOVE messages are not).
   * For a given stream, `read_time` is guaranteed to be monotonically
   * increasing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 6;</code>
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * The consistent `read_time` for the given `target_ids` (omitted when the
   * target_ids are not at a consistent snapshot).
   * The stream is guaranteed to send a `read_time` with `target_ids` empty
   * whenever the entire stream reaches a new consistent snapshot. ADD,
   * CURRENT, and RESET messages are guaranteed to (eventually) result in a
   * new consistent snapshot (while NO_CHANGE and REMOVE messages are not).
   * For a given stream, `read_time` is guaranteed to be monotonically
   * increasing.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();
}