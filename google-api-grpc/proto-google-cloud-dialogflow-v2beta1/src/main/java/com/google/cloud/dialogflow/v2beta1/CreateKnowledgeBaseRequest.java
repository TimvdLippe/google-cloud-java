// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * Request message for [KnowledgeBases.CreateKnowledgeBase][google.cloud.dialogflow.v2beta1.KnowledgeBases.CreateKnowledgeBase].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest}
 */
public final class CreateKnowledgeBaseRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)
    CreateKnowledgeBaseRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateKnowledgeBaseRequest.newBuilder() to construct.
  private CreateKnowledgeBaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateKnowledgeBaseRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateKnowledgeBaseRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder subBuilder = null;
              if (knowledgeBase_ != null) {
                subBuilder = knowledgeBase_.toBuilder();
              }
              knowledgeBase_ =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2beta1.KnowledgeBase.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(knowledgeBase_);
                knowledgeBase_ = subBuilder.buildPartial();
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
    return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto
        .internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto
        .internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.class,
            com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The agent to create a knowledge base for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The agent to create a knowledge base for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KNOWLEDGE_BASE_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledgeBase_;
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
   */
  public boolean hasKnowledgeBase() {
    return knowledgeBase_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBase() {
    return knowledgeBase_ == null
        ? com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance()
        : knowledgeBase_;
  }
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBaseOrBuilder() {
    return getKnowledgeBase();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (knowledgeBase_ != null) {
      output.writeMessage(2, getKnowledgeBase());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (knowledgeBase_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getKnowledgeBase());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest other =
        (com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest) obj;

    boolean result = true;
    result = result && getParent().equals(other.getParent());
    result = result && (hasKnowledgeBase() == other.hasKnowledgeBase());
    if (hasKnowledgeBase()) {
      result = result && getKnowledgeBase().equals(other.getKnowledgeBase());
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasKnowledgeBase()) {
      hash = (37 * hash) + KNOWLEDGE_BASE_FIELD_NUMBER;
      hash = (53 * hash) + getKnowledgeBase().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest prototype) {
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
   * Request message for [KnowledgeBases.CreateKnowledgeBase][google.cloud.dialogflow.v2beta1.KnowledgeBases.CreateKnowledgeBase].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)
      com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto
          .internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto
          .internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.class,
              com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.newBuilder()
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
      parent_ = "";

      if (knowledgeBaseBuilder_ == null) {
        knowledgeBase_ = null;
      } else {
        knowledgeBase_ = null;
        knowledgeBaseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto
          .internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest build() {
      com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest result =
          new com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest(this);
      result.parent_ = parent_;
      if (knowledgeBaseBuilder_ == null) {
        result.knowledgeBase_ = knowledgeBase_;
      } else {
        result.knowledgeBase_ = knowledgeBaseBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest other) {
      if (other
          == com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasKnowledgeBase()) {
        mergeKnowledgeBase(other.getKnowledgeBase());
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
      com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The agent to create a knowledge base for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create a knowledge base for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create a knowledge base for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create a knowledge base for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create a knowledge base for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledgeBase_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase,
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder,
            com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder>
        knowledgeBaseBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
     */
    public boolean hasKnowledgeBase() {
      return knowledgeBaseBuilder_ != null || knowledgeBase_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBase() {
      if (knowledgeBaseBuilder_ == null) {
        return knowledgeBase_ == null
            ? com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance()
            : knowledgeBase_;
      } else {
        return knowledgeBaseBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
     */
    public Builder setKnowledgeBase(com.google.cloud.dialogflow.v2beta1.KnowledgeBase value) {
      if (knowledgeBaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        knowledgeBase_ = value;
        onChanged();
      } else {
        knowledgeBaseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
     */
    public Builder setKnowledgeBase(
        com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder builderForValue) {
      if (knowledgeBaseBuilder_ == null) {
        knowledgeBase_ = builderForValue.build();
        onChanged();
      } else {
        knowledgeBaseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
     */
    public Builder mergeKnowledgeBase(com.google.cloud.dialogflow.v2beta1.KnowledgeBase value) {
      if (knowledgeBaseBuilder_ == null) {
        if (knowledgeBase_ != null) {
          knowledgeBase_ =
              com.google.cloud.dialogflow.v2beta1.KnowledgeBase.newBuilder(knowledgeBase_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          knowledgeBase_ = value;
        }
        onChanged();
      } else {
        knowledgeBaseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
     */
    public Builder clearKnowledgeBase() {
      if (knowledgeBaseBuilder_ == null) {
        knowledgeBase_ = null;
        onChanged();
      } else {
        knowledgeBase_ = null;
        knowledgeBaseBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder getKnowledgeBaseBuilder() {

      onChanged();
      return getKnowledgeBaseFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBaseOrBuilder() {
      if (knowledgeBaseBuilder_ != null) {
        return knowledgeBaseBuilder_.getMessageOrBuilder();
      } else {
        return knowledgeBase_ == null
            ? com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance()
            : knowledgeBase_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase,
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder,
            com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder>
        getKnowledgeBaseFieldBuilder() {
      if (knowledgeBaseBuilder_ == null) {
        knowledgeBaseBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2beta1.KnowledgeBase,
                com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder,
                com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder>(
                getKnowledgeBase(), getParentForChildren(), isClean());
        knowledgeBase_ = null;
      }
      return knowledgeBaseBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)
  private static final com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateKnowledgeBaseRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateKnowledgeBaseRequest>() {
        @java.lang.Override
        public CreateKnowledgeBaseRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateKnowledgeBaseRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateKnowledgeBaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateKnowledgeBaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}