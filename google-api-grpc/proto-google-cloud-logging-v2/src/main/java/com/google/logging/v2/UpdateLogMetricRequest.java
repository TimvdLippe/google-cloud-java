// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_metrics.proto

package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * The parameters to UpdateLogMetric.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.UpdateLogMetricRequest}
 */
public final class UpdateLogMetricRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.UpdateLogMetricRequest)
    UpdateLogMetricRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateLogMetricRequest.newBuilder() to construct.
  private UpdateLogMetricRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateLogMetricRequest() {
    metricName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateLogMetricRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              metricName_ = s;
              break;
            }
          case 18:
            {
              com.google.logging.v2.LogMetric.Builder subBuilder = null;
              if (metric_ != null) {
                subBuilder = metric_.toBuilder();
              }
              metric_ =
                  input.readMessage(com.google.logging.v2.LogMetric.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(metric_);
                metric_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingMetricsProto
        .internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingMetricsProto
        .internal_static_google_logging_v2_UpdateLogMetricRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.UpdateLogMetricRequest.class,
            com.google.logging.v2.UpdateLogMetricRequest.Builder.class);
  }

  public static final int METRIC_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object metricName_;
  /**
   *
   *
   * <pre>
   * The resource name of the metric to update:
   *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
   * The updated metric must be provided in the request and it's
   * `name` field must be the same as `[METRIC_ID]` If the metric
   * does not exist in `[PROJECT_ID]`, then a new metric is created.
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   */
  public java.lang.String getMetricName() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metricName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name of the metric to update:
   *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
   * The updated metric must be provided in the request and it's
   * `name` field must be the same as `[METRIC_ID]` If the metric
   * does not exist in `[PROJECT_ID]`, then a new metric is created.
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   */
  public com.google.protobuf.ByteString getMetricNameBytes() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      metricName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METRIC_FIELD_NUMBER = 2;
  private com.google.logging.v2.LogMetric metric_;
  /**
   *
   *
   * <pre>
   * The updated metric.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric metric = 2;</code>
   */
  public boolean hasMetric() {
    return metric_ != null;
  }
  /**
   *
   *
   * <pre>
   * The updated metric.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric metric = 2;</code>
   */
  public com.google.logging.v2.LogMetric getMetric() {
    return metric_ == null ? com.google.logging.v2.LogMetric.getDefaultInstance() : metric_;
  }
  /**
   *
   *
   * <pre>
   * The updated metric.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric metric = 2;</code>
   */
  public com.google.logging.v2.LogMetricOrBuilder getMetricOrBuilder() {
    return getMetric();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getMetricNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
    }
    if (metric_ != null) {
      output.writeMessage(2, getMetric());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMetricNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
    }
    if (metric_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetric());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.logging.v2.UpdateLogMetricRequest)) {
      return super.equals(obj);
    }
    com.google.logging.v2.UpdateLogMetricRequest other =
        (com.google.logging.v2.UpdateLogMetricRequest) obj;

    boolean result = true;
    result = result && getMetricName().equals(other.getMetricName());
    result = result && (hasMetric() == other.hasMetric());
    if (hasMetric()) {
      result = result && getMetric().equals(other.getMetric());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + METRIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMetricName().hashCode();
    if (hasMetric()) {
      hash = (37 * hash) + METRIC_FIELD_NUMBER;
      hash = (53 * hash) + getMetric().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.UpdateLogMetricRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.logging.v2.UpdateLogMetricRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The parameters to UpdateLogMetric.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.UpdateLogMetricRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.UpdateLogMetricRequest)
      com.google.logging.v2.UpdateLogMetricRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingMetricsProto
          .internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingMetricsProto
          .internal_static_google_logging_v2_UpdateLogMetricRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.UpdateLogMetricRequest.class,
              com.google.logging.v2.UpdateLogMetricRequest.Builder.class);
    }

    // Construct using com.google.logging.v2.UpdateLogMetricRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      metricName_ = "";

      if (metricBuilder_ == null) {
        metric_ = null;
      } else {
        metric_ = null;
        metricBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingMetricsProto
          .internal_static_google_logging_v2_UpdateLogMetricRequest_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.UpdateLogMetricRequest getDefaultInstanceForType() {
      return com.google.logging.v2.UpdateLogMetricRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.UpdateLogMetricRequest build() {
      com.google.logging.v2.UpdateLogMetricRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.UpdateLogMetricRequest buildPartial() {
      com.google.logging.v2.UpdateLogMetricRequest result =
          new com.google.logging.v2.UpdateLogMetricRequest(this);
      result.metricName_ = metricName_;
      if (metricBuilder_ == null) {
        result.metric_ = metric_;
      } else {
        result.metric_ = metricBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.UpdateLogMetricRequest) {
        return mergeFrom((com.google.logging.v2.UpdateLogMetricRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.UpdateLogMetricRequest other) {
      if (other == com.google.logging.v2.UpdateLogMetricRequest.getDefaultInstance()) return this;
      if (!other.getMetricName().isEmpty()) {
        metricName_ = other.metricName_;
        onChanged();
      }
      if (other.hasMetric()) {
        mergeMetric(other.getMetric());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.logging.v2.UpdateLogMetricRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.UpdateLogMetricRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object metricName_ = "";
    /**
     *
     *
     * <pre>
     * The resource name of the metric to update:
     *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
     * The updated metric must be provided in the request and it's
     * `name` field must be the same as `[METRIC_ID]` If the metric
     * does not exist in `[PROJECT_ID]`, then a new metric is created.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metricName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the metric to update:
     *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
     * The updated metric must be provided in the request and it's
     * `name` field must be the same as `[METRIC_ID]` If the metric
     * does not exist in `[PROJECT_ID]`, then a new metric is created.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     */
    public com.google.protobuf.ByteString getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the metric to update:
     *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
     * The updated metric must be provided in the request and it's
     * `name` field must be the same as `[METRIC_ID]` If the metric
     * does not exist in `[PROJECT_ID]`, then a new metric is created.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     */
    public Builder setMetricName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      metricName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the metric to update:
     *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
     * The updated metric must be provided in the request and it's
     * `name` field must be the same as `[METRIC_ID]` If the metric
     * does not exist in `[PROJECT_ID]`, then a new metric is created.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     */
    public Builder clearMetricName() {

      metricName_ = getDefaultInstance().getMetricName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the metric to update:
     *     "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
     * The updated metric must be provided in the request and it's
     * `name` field must be the same as `[METRIC_ID]` If the metric
     * does not exist in `[PROJECT_ID]`, then a new metric is created.
     * </pre>
     *
     * <code>string metric_name = 1;</code>
     */
    public Builder setMetricNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      metricName_ = value;
      onChanged();
      return this;
    }

    private com.google.logging.v2.LogMetric metric_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.logging.v2.LogMetric,
            com.google.logging.v2.LogMetric.Builder,
            com.google.logging.v2.LogMetricOrBuilder>
        metricBuilder_;
    /**
     *
     *
     * <pre>
     * The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2;</code>
     */
    public boolean hasMetric() {
      return metricBuilder_ != null || metric_ != null;
    }
    /**
     *
     *
     * <pre>
     * The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2;</code>
     */
    public com.google.logging.v2.LogMetric getMetric() {
      if (metricBuilder_ == null) {
        return metric_ == null ? com.google.logging.v2.LogMetric.getDefaultInstance() : metric_;
      } else {
        return metricBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2;</code>
     */
    public Builder setMetric(com.google.logging.v2.LogMetric value) {
      if (metricBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metric_ = value;
        onChanged();
      } else {
        metricBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2;</code>
     */
    public Builder setMetric(com.google.logging.v2.LogMetric.Builder builderForValue) {
      if (metricBuilder_ == null) {
        metric_ = builderForValue.build();
        onChanged();
      } else {
        metricBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2;</code>
     */
    public Builder mergeMetric(com.google.logging.v2.LogMetric value) {
      if (metricBuilder_ == null) {
        if (metric_ != null) {
          metric_ =
              com.google.logging.v2.LogMetric.newBuilder(metric_).mergeFrom(value).buildPartial();
        } else {
          metric_ = value;
        }
        onChanged();
      } else {
        metricBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2;</code>
     */
    public Builder clearMetric() {
      if (metricBuilder_ == null) {
        metric_ = null;
        onChanged();
      } else {
        metric_ = null;
        metricBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2;</code>
     */
    public com.google.logging.v2.LogMetric.Builder getMetricBuilder() {

      onChanged();
      return getMetricFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2;</code>
     */
    public com.google.logging.v2.LogMetricOrBuilder getMetricOrBuilder() {
      if (metricBuilder_ != null) {
        return metricBuilder_.getMessageOrBuilder();
      } else {
        return metric_ == null ? com.google.logging.v2.LogMetric.getDefaultInstance() : metric_;
      }
    }
    /**
     *
     *
     * <pre>
     * The updated metric.
     * </pre>
     *
     * <code>.google.logging.v2.LogMetric metric = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.logging.v2.LogMetric,
            com.google.logging.v2.LogMetric.Builder,
            com.google.logging.v2.LogMetricOrBuilder>
        getMetricFieldBuilder() {
      if (metricBuilder_ == null) {
        metricBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.logging.v2.LogMetric,
                com.google.logging.v2.LogMetric.Builder,
                com.google.logging.v2.LogMetricOrBuilder>(
                getMetric(), getParentForChildren(), isClean());
        metric_ = null;
      }
      return metricBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.logging.v2.UpdateLogMetricRequest)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.UpdateLogMetricRequest)
  private static final com.google.logging.v2.UpdateLogMetricRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.UpdateLogMetricRequest();
  }

  public static com.google.logging.v2.UpdateLogMetricRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateLogMetricRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateLogMetricRequest>() {
        @java.lang.Override
        public UpdateLogMetricRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateLogMetricRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateLogMetricRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateLogMetricRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.UpdateLogMetricRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}