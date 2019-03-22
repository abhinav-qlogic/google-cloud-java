// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1/cloud_redis.proto

package com.google.cloud.redis.v1;

public final class CloudRedisServiceV1Proto {
  private CloudRedisServiceV1Proto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_FailoverInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_LocationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_LocationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1_ZoneMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ZoneMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/redis/v1/cloud_redis.prot"
          + "o\022\025google.cloud.redis.v1\032\034google/api/ann"
          + "otations.proto\032\031google/api/resource.prot"
          + "o\032#google/longrunning/operations.proto\032 "
          + "google/protobuf/field_mask.proto\032\037google"
          + "/protobuf/timestamp.proto\"\343\006\n\010Instance\022\014"
          + "\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022;\n\006la"
          + "bels\030\003 \003(\0132+.google.cloud.redis.v1.Insta"
          + "nce.LabelsEntry\022\023\n\013location_id\030\004 \001(\t\022\037\n\027"
          + "alternative_location_id\030\005 \001(\t\022\025\n\rredis_v"
          + "ersion\030\007 \001(\t\022\031\n\021reserved_ip_range\030\t \001(\t\022"
          + "\014\n\004host\030\n \001(\t\022\014\n\004port\030\013 \001(\005\022\033\n\023current_l"
          + "ocation_id\030\014 \001(\t\022/\n\013create_time\030\r \001(\0132\032."
          + "google.protobuf.Timestamp\0224\n\005state\030\016 \001(\016"
          + "2%.google.cloud.redis.v1.Instance.State\022"
          + "\026\n\016status_message\030\017 \001(\t\022H\n\rredis_configs"
          + "\030\020 \003(\01321.google.cloud.redis.v1.Instance."
          + "RedisConfigsEntry\0222\n\004tier\030\021 \001(\0162$.google"
          + ".cloud.redis.v1.Instance.Tier\022\026\n\016memory_"
          + "size_gb\030\022 \001(\005\022\032\n\022authorized_network\030\024 \001("
          + "\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\0323\n\021RedisConfigsEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\205\001\n\005State\022\025\n\021STATE"
          + "_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\t\n\005READY\020\002\022"
          + "\014\n\010UPDATING\020\003\022\014\n\010DELETING\020\004\022\r\n\tREPAIRING"
          + "\020\005\022\017\n\013MAINTENANCE\020\006\022\020\n\014FAILING_OVER\020\t\"8\n"
          + "\004Tier\022\024\n\020TIER_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\017"
          + "\n\013STANDARD_HA\020\003\"M\n\024ListInstancesRequest\022"
          + "\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npa"
          + "ge_token\030\003 \001(\t\"y\n\025ListInstancesResponse\022"
          + "2\n\tinstances\030\001 \003(\0132\037.google.cloud.redis."
          + "v1.Instance\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013"
          + "unreachable\030\003 \003(\t\"\"\n\022GetInstanceRequest\022"
          + "\014\n\004name\030\001 \001(\t\"o\n\025CreateInstanceRequest\022\016"
          + "\n\006parent\030\001 \001(\t\022\023\n\013instance_id\030\002 \001(\t\0221\n\010i"
          + "nstance\030\003 \001(\0132\037.google.cloud.redis.v1.In"
          + "stance\"{\n\025UpdateInstanceRequest\022/\n\013updat"
          + "e_mask\030\001 \001(\0132\032.google.protobuf.FieldMask"
          + "\0221\n\010instance\030\002 \001(\0132\037.google.cloud.redis."
          + "v1.Instance\"%\n\025DeleteInstanceRequest\022\014\n\004"
          + "name\030\001 \001(\t\"\360\001\n\027FailoverInstanceRequest\022\014"
          + "\n\004name\030\001 \001(\t\022_\n\024data_protection_mode\030\002 \001"
          + "(\0162A.google.cloud.redis.v1.FailoverInsta"
          + "nceRequest.DataProtectionMode\"f\n\022DataPro"
          + "tectionMode\022$\n DATA_PROTECTION_MODE_UNSP"
          + "ECIFIED\020\000\022\025\n\021LIMITED_DATA_LOSS\020\001\022\023\n\017FORC"
          + "E_DATA_LOSS\020\002\"\326\001\n\021OperationMetadata\022/\n\013c"
          + "reate_time\030\001 \001(\0132\032.google.protobuf.Times"
          + "tamp\022,\n\010end_time\030\002 \001(\0132\032.google.protobuf"
          + ".Timestamp\022\016\n\006target\030\003 \001(\t\022\014\n\004verb\030\004 \001(\t"
          + "\022\025\n\rstatus_detail\030\005 \001(\t\022\030\n\020cancel_reques"
          + "ted\030\006 \001(\010\022\023\n\013api_version\030\007 \001(\t\"\304\001\n\020Locat"
          + "ionMetadata\022T\n\017available_zones\030\001 \003(\0132;.g"
          + "oogle.cloud.redis.v1.LocationMetadata.Av"
          + "ailableZonesEntry\032Z\n\023AvailableZonesEntry"
          + "\022\013\n\003key\030\001 \001(\t\0222\n\005value\030\002 \001(\0132#.google.cl"
          + "oud.redis.v1.ZoneMetadata:\0028\001\"\016\n\014ZoneMet"
          + "adata2\314\007\n\nCloudRedis\022\241\001\n\rListInstances\022+"
          + ".google.cloud.redis.v1.ListInstancesRequ"
          + "est\032,.google.cloud.redis.v1.ListInstance"
          + "sResponse\"5\202\323\344\223\002/\022-/v1/{parent=projects/"
          + "*/locations/*}/instances\022\220\001\n\013GetInstance"
          + "\022).google.cloud.redis.v1.GetInstanceRequ"
          + "est\032\037.google.cloud.redis.v1.Instance\"5\202\323"
          + "\344\223\002/\022-/v1/{name=projects/*/locations/*/i"
          + "nstances/*}\022\236\001\n\016CreateInstance\022,.google."
          + "cloud.redis.v1.CreateInstanceRequest\032\035.g"
          + "oogle.longrunning.Operation\"?\202\323\344\223\0029\"-/v1"
          + "/{parent=projects/*/locations/*}/instanc"
          + "es:\010instance\022\247\001\n\016UpdateInstance\022,.google"
          + ".cloud.redis.v1.UpdateInstanceRequest\032\035."
          + "google.longrunning.Operation\"H\202\323\344\223\002B26/v"
          + "1/{instance.name=projects/*/locations/*/"
          + "instances/*}:\010instance\022\244\001\n\020FailoverInsta"
          + "nce\022..google.cloud.redis.v1.FailoverInst"
          + "anceRequest\032\035.google.longrunning.Operati"
          + "on\"A\202\323\344\223\002;\"6/v1/{name=projects/*/locatio"
          + "ns/*/instances/*}:failover:\001*\022\224\001\n\016Delete"
          + "Instance\022,.google.cloud.redis.v1.DeleteI"
          + "nstanceRequest\032\035.google.longrunning.Oper"
          + "ation\"5\202\323\344\223\002/*-/v1/{name=projects/*/loca"
          + "tions/*/instances/*}Bs\n\031com.google.cloud"
          + ".redis.v1B\030CloudRedisServiceV1ProtoP\001Z:g"
          + "oogle.golang.org/genproto/googleapis/clo"
          + "ud/redis/v1;redisb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_redis_v1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_redis_v1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Labels",
              "LocationId",
              "AlternativeLocationId",
              "RedisVersion",
              "ReservedIpRange",
              "Host",
              "Port",
              "CurrentLocationId",
              "CreateTime",
              "State",
              "StatusMessage",
              "RedisConfigs",
              "Tier",
              "MemorySizeGb",
              "AuthorizedNetwork",
            });
    internal_static_google_cloud_redis_v1_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_redis_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_redis_v1_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_descriptor =
        internal_static_google_cloud_redis_v1_Instance_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_redis_v1_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_redis_v1_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_redis_v1_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_redis_v1_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_redis_v1_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_redis_v1_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_redis_v1_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance",
            });
    internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_redis_v1_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Instance",
            });
    internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_redis_v1_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_redis_v1_FailoverInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_FailoverInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "DataProtectionMode",
            });
    internal_static_google_cloud_redis_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_redis_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
    internal_static_google_cloud_redis_v1_LocationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_redis_v1_LocationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_LocationMetadata_descriptor,
            new java.lang.String[] {
              "AvailableZones",
            });
    internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_descriptor =
        internal_static_google_cloud_redis_v1_LocationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_redis_v1_ZoneMetadata_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_redis_v1_ZoneMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1_ZoneMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
