// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

/**
 * Protobuf type {@code google.logging.v2.LogSink}
 *
 * <pre>
 * Describes a sink used to export log entries outside Cloud Logging.
 * </pre>
 */
public  final class LogSink extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.LogSink)
    LogSinkOrBuilder {
  // Use LogSink.newBuilder() to construct.
  private LogSink(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LogSink() {
    name_ = "";
    destination_ = "";
    filter_ = "";
    outputVersionFormat_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LogSink(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            destination_ = s;
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            filter_ = s;
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            outputVersionFormat_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.logging.v2.LoggingConfig.internal_static_google_logging_v2_LogSink_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfig.internal_static_google_logging_v2_LogSink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.LogSink.class, com.google.logging.v2.LogSink.Builder.class);
  }

  /**
   * Protobuf enum {@code google.logging.v2.LogSink.VersionFormat}
   *
   * <pre>
   * Available log entry formats. Log entries can be written to Cloud
   * Logging in either format and can be exported in either format.
   * Version 2 is the preferred format.
   * </pre>
   */
  public enum VersionFormat
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>VERSION_FORMAT_UNSPECIFIED = 0;</code>
     *
     * <pre>
     * An unspecified version format will default to V2.
     * </pre>
     */
    VERSION_FORMAT_UNSPECIFIED(0, 0),
    /**
     * <code>V2 = 1;</code>
     *
     * <pre>
     * `LogEntry` version 2 format.
     * </pre>
     */
    V2(1, 1),
    /**
     * <code>V1 = 2;</code>
     *
     * <pre>
     * `LogEntry` version 1 format.
     * </pre>
     */
    V1(2, 2),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>VERSION_FORMAT_UNSPECIFIED = 0;</code>
     *
     * <pre>
     * An unspecified version format will default to V2.
     * </pre>
     */
    public static final int VERSION_FORMAT_UNSPECIFIED_VALUE = 0;
    /**
     * <code>V2 = 1;</code>
     *
     * <pre>
     * `LogEntry` version 2 format.
     * </pre>
     */
    public static final int V2_VALUE = 1;
    /**
     * <code>V1 = 2;</code>
     *
     * <pre>
     * `LogEntry` version 1 format.
     * </pre>
     */
    public static final int V1_VALUE = 2;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static VersionFormat valueOf(int value) {
      switch (value) {
        case 0: return VERSION_FORMAT_UNSPECIFIED;
        case 1: return V2;
        case 2: return V1;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VersionFormat>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VersionFormat> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VersionFormat>() {
            public VersionFormat findValueByNumber(int number) {
              return VersionFormat.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.logging.v2.LogSink.getDescriptor().getEnumTypes().get(0);
    }

    private static final VersionFormat[] VALUES = values();

    public static VersionFormat valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private VersionFormat(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.logging.v2.LogSink.VersionFormat)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * Required. The client-assigned sink identifier. Example:
   * `"my-severe-errors-to-pubsub"`.
   * Sink identifiers are limited to 1000 characters
   * and can include only the following characters: `A-Z`, `a-z`,
   * `0-9`, and the special characters `_-.`.
   * </pre>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * Required. The client-assigned sink identifier. Example:
   * `"my-severe-errors-to-pubsub"`.
   * Sink identifiers are limited to 1000 characters
   * and can include only the following characters: `A-Z`, `a-z`,
   * `0-9`, and the special characters `_-.`.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_FIELD_NUMBER = 3;
  private volatile java.lang.Object destination_;
  /**
   * <code>optional string destination = 3;</code>
   *
   * <pre>
   * The export destination. See
   * [Exporting Logs With Sinks](/logging/docs/api/tasks/exporting-logs).
   * Examples: `"storage.googleapis.com/a-bucket"`,
   * `"bigquery.googleapis.com/projects/a-project-id/datasets/a-dataset"`.
   * </pre>
   */
  public java.lang.String getDestination() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destination_ = s;
      return s;
    }
  }
  /**
   * <code>optional string destination = 3;</code>
   *
   * <pre>
   * The export destination. See
   * [Exporting Logs With Sinks](/logging/docs/api/tasks/exporting-logs).
   * Examples: `"storage.googleapis.com/a-bucket"`,
   * `"bigquery.googleapis.com/projects/a-project-id/datasets/a-dataset"`.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getDestinationBytes() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destination_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 5;
  private volatile java.lang.Object filter_;
  /**
   * <code>optional string filter = 5;</code>
   *
   * <pre>
   * An [advanced logs filter](/logging/docs/view/advanced_filters)
   * that defines the log entries to be exported.  The filter must be
   * consistent with the log entry format designed by the
   * `outputVersionFormat` parameter, regardless of the format of the
   * log entry that was originally written to Cloud Logging.
   * Example: `"logName:syslog AND severity&gt;=ERROR"`.
   * </pre>
   */
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <code>optional string filter = 5;</code>
   *
   * <pre>
   * An [advanced logs filter](/logging/docs/view/advanced_filters)
   * that defines the log entries to be exported.  The filter must be
   * consistent with the log entry format designed by the
   * `outputVersionFormat` parameter, regardless of the format of the
   * log entry that was originally written to Cloud Logging.
   * Example: `"logName:syslog AND severity&gt;=ERROR"`.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUT_VERSION_FORMAT_FIELD_NUMBER = 6;
  private int outputVersionFormat_;
  /**
   * <code>optional .google.logging.v2.LogSink.VersionFormat output_version_format = 6;</code>
   *
   * <pre>
   * The log entry version used when exporting log entries from this
   * sink.  This version does not have to correspond to the version of
   * the log entry when it was written to Cloud Logging.
   * </pre>
   */
  public int getOutputVersionFormatValue() {
    return outputVersionFormat_;
  }
  /**
   * <code>optional .google.logging.v2.LogSink.VersionFormat output_version_format = 6;</code>
   *
   * <pre>
   * The log entry version used when exporting log entries from this
   * sink.  This version does not have to correspond to the version of
   * the log entry when it was written to Cloud Logging.
   * </pre>
   */
  public com.google.logging.v2.LogSink.VersionFormat getOutputVersionFormat() {
    com.google.logging.v2.LogSink.VersionFormat result = com.google.logging.v2.LogSink.VersionFormat.valueOf(outputVersionFormat_);
    return result == null ? com.google.logging.v2.LogSink.VersionFormat.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
    }
    if (!getDestinationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, destination_);
    }
    if (!getFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, filter_);
    }
    if (outputVersionFormat_ != com.google.logging.v2.LogSink.VersionFormat.VERSION_FORMAT_UNSPECIFIED.getNumber()) {
      output.writeEnum(6, outputVersionFormat_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
    }
    if (!getDestinationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, destination_);
    }
    if (!getFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, filter_);
    }
    if (outputVersionFormat_ != com.google.logging.v2.LogSink.VersionFormat.VERSION_FORMAT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, outputVersionFormat_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.logging.v2.LogSink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.LogSink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.LogSink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.LogSink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.LogSink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.logging.v2.LogSink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.logging.v2.LogSink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.logging.v2.LogSink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.logging.v2.LogSink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.logging.v2.LogSink parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.logging.v2.LogSink prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.logging.v2.LogSink}
   *
   * <pre>
   * Describes a sink used to export log entries outside Cloud Logging.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.LogSink)
      com.google.logging.v2.LogSinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.logging.v2.LoggingConfig.internal_static_google_logging_v2_LogSink_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfig.internal_static_google_logging_v2_LogSink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.LogSink.class, com.google.logging.v2.LogSink.Builder.class);
    }

    // Construct using com.google.logging.v2.LogSink.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      destination_ = "";

      filter_ = "";

      outputVersionFormat_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.logging.v2.LoggingConfig.internal_static_google_logging_v2_LogSink_descriptor;
    }

    public com.google.logging.v2.LogSink getDefaultInstanceForType() {
      return com.google.logging.v2.LogSink.getDefaultInstance();
    }

    public com.google.logging.v2.LogSink build() {
      com.google.logging.v2.LogSink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.logging.v2.LogSink buildPartial() {
      com.google.logging.v2.LogSink result = new com.google.logging.v2.LogSink(this);
      result.name_ = name_;
      result.destination_ = destination_;
      result.filter_ = filter_;
      result.outputVersionFormat_ = outputVersionFormat_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.LogSink) {
        return mergeFrom((com.google.logging.v2.LogSink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.LogSink other) {
      if (other == com.google.logging.v2.LogSink.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDestination().isEmpty()) {
        destination_ = other.destination_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      if (other.outputVersionFormat_ != 0) {
        setOutputVersionFormatValue(other.getOutputVersionFormatValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.logging.v2.LogSink parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.LogSink) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * Required. The client-assigned sink identifier. Example:
     * `"my-severe-errors-to-pubsub"`.
     * Sink identifiers are limited to 1000 characters
     * and can include only the following characters: `A-Z`, `a-z`,
     * `0-9`, and the special characters `_-.`.
     * </pre>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * Required. The client-assigned sink identifier. Example:
     * `"my-severe-errors-to-pubsub"`.
     * Sink identifiers are limited to 1000 characters
     * and can include only the following characters: `A-Z`, `a-z`,
     * `0-9`, and the special characters `_-.`.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * Required. The client-assigned sink identifier. Example:
     * `"my-severe-errors-to-pubsub"`.
     * Sink identifiers are limited to 1000 characters
     * and can include only the following characters: `A-Z`, `a-z`,
     * `0-9`, and the special characters `_-.`.
     * </pre>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * Required. The client-assigned sink identifier. Example:
     * `"my-severe-errors-to-pubsub"`.
     * Sink identifiers are limited to 1000 characters
     * and can include only the following characters: `A-Z`, `a-z`,
     * `0-9`, and the special characters `_-.`.
     * </pre>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * Required. The client-assigned sink identifier. Example:
     * `"my-severe-errors-to-pubsub"`.
     * Sink identifiers are limited to 1000 characters
     * and can include only the following characters: `A-Z`, `a-z`,
     * `0-9`, and the special characters `_-.`.
     * </pre>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object destination_ = "";
    /**
     * <code>optional string destination = 3;</code>
     *
     * <pre>
     * The export destination. See
     * [Exporting Logs With Sinks](/logging/docs/api/tasks/exporting-logs).
     * Examples: `"storage.googleapis.com/a-bucket"`,
     * `"bigquery.googleapis.com/projects/a-project-id/datasets/a-dataset"`.
     * </pre>
     */
    public java.lang.String getDestination() {
      java.lang.Object ref = destination_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destination_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string destination = 3;</code>
     *
     * <pre>
     * The export destination. See
     * [Exporting Logs With Sinks](/logging/docs/api/tasks/exporting-logs).
     * Examples: `"storage.googleapis.com/a-bucket"`,
     * `"bigquery.googleapis.com/projects/a-project-id/datasets/a-dataset"`.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDestinationBytes() {
      java.lang.Object ref = destination_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destination_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string destination = 3;</code>
     *
     * <pre>
     * The export destination. See
     * [Exporting Logs With Sinks](/logging/docs/api/tasks/exporting-logs).
     * Examples: `"storage.googleapis.com/a-bucket"`,
     * `"bigquery.googleapis.com/projects/a-project-id/datasets/a-dataset"`.
     * </pre>
     */
    public Builder setDestination(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destination_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string destination = 3;</code>
     *
     * <pre>
     * The export destination. See
     * [Exporting Logs With Sinks](/logging/docs/api/tasks/exporting-logs).
     * Examples: `"storage.googleapis.com/a-bucket"`,
     * `"bigquery.googleapis.com/projects/a-project-id/datasets/a-dataset"`.
     * </pre>
     */
    public Builder clearDestination() {
      
      destination_ = getDefaultInstance().getDestination();
      onChanged();
      return this;
    }
    /**
     * <code>optional string destination = 3;</code>
     *
     * <pre>
     * The export destination. See
     * [Exporting Logs With Sinks](/logging/docs/api/tasks/exporting-logs).
     * Examples: `"storage.googleapis.com/a-bucket"`,
     * `"bigquery.googleapis.com/projects/a-project-id/datasets/a-dataset"`.
     * </pre>
     */
    public Builder setDestinationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destination_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <code>optional string filter = 5;</code>
     *
     * <pre>
     * An [advanced logs filter](/logging/docs/view/advanced_filters)
     * that defines the log entries to be exported.  The filter must be
     * consistent with the log entry format designed by the
     * `outputVersionFormat` parameter, regardless of the format of the
     * log entry that was originally written to Cloud Logging.
     * Example: `"logName:syslog AND severity&gt;=ERROR"`.
     * </pre>
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string filter = 5;</code>
     *
     * <pre>
     * An [advanced logs filter](/logging/docs/view/advanced_filters)
     * that defines the log entries to be exported.  The filter must be
     * consistent with the log entry format designed by the
     * `outputVersionFormat` parameter, regardless of the format of the
     * log entry that was originally written to Cloud Logging.
     * Example: `"logName:syslog AND severity&gt;=ERROR"`.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string filter = 5;</code>
     *
     * <pre>
     * An [advanced logs filter](/logging/docs/view/advanced_filters)
     * that defines the log entries to be exported.  The filter must be
     * consistent with the log entry format designed by the
     * `outputVersionFormat` parameter, regardless of the format of the
     * log entry that was originally written to Cloud Logging.
     * Example: `"logName:syslog AND severity&gt;=ERROR"`.
     * </pre>
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string filter = 5;</code>
     *
     * <pre>
     * An [advanced logs filter](/logging/docs/view/advanced_filters)
     * that defines the log entries to be exported.  The filter must be
     * consistent with the log entry format designed by the
     * `outputVersionFormat` parameter, regardless of the format of the
     * log entry that was originally written to Cloud Logging.
     * Example: `"logName:syslog AND severity&gt;=ERROR"`.
     * </pre>
     */
    public Builder clearFilter() {
      
      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     * <code>optional string filter = 5;</code>
     *
     * <pre>
     * An [advanced logs filter](/logging/docs/view/advanced_filters)
     * that defines the log entries to be exported.  The filter must be
     * consistent with the log entry format designed by the
     * `outputVersionFormat` parameter, regardless of the format of the
     * log entry that was originally written to Cloud Logging.
     * Example: `"logName:syslog AND severity&gt;=ERROR"`.
     * </pre>
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filter_ = value;
      onChanged();
      return this;
    }

    private int outputVersionFormat_ = 0;
    /**
     * <code>optional .google.logging.v2.LogSink.VersionFormat output_version_format = 6;</code>
     *
     * <pre>
     * The log entry version used when exporting log entries from this
     * sink.  This version does not have to correspond to the version of
     * the log entry when it was written to Cloud Logging.
     * </pre>
     */
    public int getOutputVersionFormatValue() {
      return outputVersionFormat_;
    }
    /**
     * <code>optional .google.logging.v2.LogSink.VersionFormat output_version_format = 6;</code>
     *
     * <pre>
     * The log entry version used when exporting log entries from this
     * sink.  This version does not have to correspond to the version of
     * the log entry when it was written to Cloud Logging.
     * </pre>
     */
    public Builder setOutputVersionFormatValue(int value) {
      outputVersionFormat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.logging.v2.LogSink.VersionFormat output_version_format = 6;</code>
     *
     * <pre>
     * The log entry version used when exporting log entries from this
     * sink.  This version does not have to correspond to the version of
     * the log entry when it was written to Cloud Logging.
     * </pre>
     */
    public com.google.logging.v2.LogSink.VersionFormat getOutputVersionFormat() {
      com.google.logging.v2.LogSink.VersionFormat result = com.google.logging.v2.LogSink.VersionFormat.valueOf(outputVersionFormat_);
      return result == null ? com.google.logging.v2.LogSink.VersionFormat.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .google.logging.v2.LogSink.VersionFormat output_version_format = 6;</code>
     *
     * <pre>
     * The log entry version used when exporting log entries from this
     * sink.  This version does not have to correspond to the version of
     * the log entry when it was written to Cloud Logging.
     * </pre>
     */
    public Builder setOutputVersionFormat(com.google.logging.v2.LogSink.VersionFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      outputVersionFormat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.logging.v2.LogSink.VersionFormat output_version_format = 6;</code>
     *
     * <pre>
     * The log entry version used when exporting log entries from this
     * sink.  This version does not have to correspond to the version of
     * the log entry when it was written to Cloud Logging.
     * </pre>
     */
    public Builder clearOutputVersionFormat() {
      
      outputVersionFormat_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.logging.v2.LogSink)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.LogSink)
  private static final com.google.logging.v2.LogSink DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.LogSink();
  }

  public static com.google.logging.v2.LogSink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogSink>
      PARSER = new com.google.protobuf.AbstractParser<LogSink>() {
    public LogSink parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new LogSink(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<LogSink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogSink> getParserForType() {
    return PARSER;
  }

  public com.google.logging.v2.LogSink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

