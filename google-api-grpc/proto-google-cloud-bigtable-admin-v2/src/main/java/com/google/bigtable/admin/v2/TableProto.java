// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

public final class TableProto {
  private TableProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Table_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Table_ClusterState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_ClusterState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Table_ClusterStatesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_ClusterStatesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_ColumnFamily_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_GcRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_GcRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_GcRule_Intersection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_GcRule_Intersection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_GcRule_Union_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_GcRule_Union_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Snapshot_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Snapshot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/bigtable/admin/v2/table.proto\022\030"
          + "google.bigtable.admin.v2\032\034google/api/ann"
          + "otations.proto\032\036google/protobuf/duration"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "\313\006\n\005Table\022\014\n\004name\030\001 \001(\t\022J\n\016cluster_state"
          + "s\030\002 \003(\01322.google.bigtable.admin.v2.Table"
          + ".ClusterStatesEntry\022L\n\017column_families\030\003"
          + " \003(\01323.google.bigtable.admin.v2.Table.Co"
          + "lumnFamiliesEntry\022I\n\013granularity\030\004 \001(\01624"
          + ".google.bigtable.admin.v2.Table.Timestam"
          + "pGranularity\032\342\001\n\014ClusterState\022X\n\021replica"
          + "tion_state\030\001 \001(\0162=.google.bigtable.admin"
          + ".v2.Table.ClusterState.ReplicationState\""
          + "x\n\020ReplicationState\022\023\n\017STATE_NOT_KNOWN\020\000"
          + "\022\020\n\014INITIALIZING\020\001\022\027\n\023PLANNED_MAINTENANC"
          + "E\020\002\022\031\n\025UNPLANNED_MAINTENANCE\020\003\022\t\n\005READY\020"
          + "\004\032b\n\022ClusterStatesEntry\022\013\n\003key\030\001 \001(\t\022;\n\005"
          + "value\030\002 \001(\0132,.google.bigtable.admin.v2.T"
          + "able.ClusterState:\0028\001\032]\n\023ColumnFamiliesE"
          + "ntry\022\013\n\003key\030\001 \001(\t\0225\n\005value\030\002 \001(\0132&.googl"
          + "e.bigtable.admin.v2.ColumnFamily:\0028\001\"I\n\024"
          + "TimestampGranularity\022%\n!TIMESTAMP_GRANUL"
          + "ARITY_UNSPECIFIED\020\000\022\n\n\006MILLIS\020\001\"\\\n\004View\022"
          + "\024\n\020VIEW_UNSPECIFIED\020\000\022\r\n\tNAME_ONLY\020\001\022\017\n\013"
          + "SCHEMA_VIEW\020\002\022\024\n\020REPLICATION_VIEW\020\003\022\010\n\004F"
          + "ULL\020\004\"A\n\014ColumnFamily\0221\n\007gc_rule\030\001 \001(\0132 "
          + ".google.bigtable.admin.v2.GcRule\"\325\002\n\006GcR"
          + "ule\022\032\n\020max_num_versions\030\001 \001(\005H\000\022,\n\007max_a"
          + "ge\030\002 \001(\0132\031.google.protobuf.DurationH\000\022E\n"
          + "\014intersection\030\003 \001(\0132-.google.bigtable.ad"
          + "min.v2.GcRule.IntersectionH\000\0227\n\005union\030\004 "
          + "\001(\0132&.google.bigtable.admin.v2.GcRule.Un"
          + "ionH\000\032?\n\014Intersection\022/\n\005rules\030\001 \003(\0132 .g"
          + "oogle.bigtable.admin.v2.GcRule\0328\n\005Union\022"
          + "/\n\005rules\030\001 \003(\0132 .google.bigtable.admin.v"
          + "2.GcRuleB\006\n\004rule\"\317\002\n\010Snapshot\022\014\n\004name\030\001 "
          + "\001(\t\0225\n\014source_table\030\002 \001(\0132\037.google.bigta"
          + "ble.admin.v2.Table\022\027\n\017data_size_bytes\030\003 "
          + "\001(\003\022/\n\013create_time\030\004 \001(\0132\032.google.protob"
          + "uf.Timestamp\022/\n\013delete_time\030\005 \001(\0132\032.goog"
          + "le.protobuf.Timestamp\0227\n\005state\030\006 \001(\0162(.g"
          + "oogle.bigtable.admin.v2.Snapshot.State\022\023"
          + "\n\013description\030\007 \001(\t\"5\n\005State\022\023\n\017STATE_NO"
          + "T_KNOWN\020\000\022\t\n\005READY\020\001\022\014\n\010CREATING\020\002B\255\001\n\034c"
          + "om.google.bigtable.admin.v2B\nTableProtoP"
          + "\001Z=google.golang.org/genproto/googleapis"
          + "/bigtable/admin/v2;admin\252\002\036Google.Cloud."
          + "Bigtable.Admin.V2\312\002\036Google\\Cloud\\Bigtabl"
          + "e\\Admin\\V2b\006proto3"
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
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_bigtable_admin_v2_Table_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_admin_v2_Table_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Table_descriptor,
            new java.lang.String[] {
              "Name", "ClusterStates", "ColumnFamilies", "Granularity",
            });
    internal_static_google_bigtable_admin_v2_Table_ClusterState_descriptor =
        internal_static_google_bigtable_admin_v2_Table_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Table_ClusterState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Table_ClusterState_descriptor,
            new java.lang.String[] {
              "ReplicationState",
            });
    internal_static_google_bigtable_admin_v2_Table_ClusterStatesEntry_descriptor =
        internal_static_google_bigtable_admin_v2_Table_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_admin_v2_Table_ClusterStatesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Table_ClusterStatesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_descriptor =
        internal_static_google_bigtable_admin_v2_Table_descriptor.getNestedTypes().get(2);
    internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_admin_v2_ColumnFamily_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor,
            new java.lang.String[] {
              "GcRule",
            });
    internal_static_google_bigtable_admin_v2_GcRule_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_bigtable_admin_v2_GcRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_GcRule_descriptor,
            new java.lang.String[] {
              "MaxNumVersions", "MaxAge", "Intersection", "Union", "Rule",
            });
    internal_static_google_bigtable_admin_v2_GcRule_Intersection_descriptor =
        internal_static_google_bigtable_admin_v2_GcRule_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_GcRule_Intersection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_GcRule_Intersection_descriptor,
            new java.lang.String[] {
              "Rules",
            });
    internal_static_google_bigtable_admin_v2_GcRule_Union_descriptor =
        internal_static_google_bigtable_admin_v2_GcRule_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_admin_v2_GcRule_Union_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_GcRule_Union_descriptor,
            new java.lang.String[] {
              "Rules",
            });
    internal_static_google_bigtable_admin_v2_Snapshot_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_bigtable_admin_v2_Snapshot_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Snapshot_descriptor,
            new java.lang.String[] {
              "Name",
              "SourceTable",
              "DataSizeBytes",
              "CreateTime",
              "DeleteTime",
              "State",
              "Description",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}