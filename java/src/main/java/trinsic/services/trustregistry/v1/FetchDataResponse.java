// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/trust-registry/v1/trust-registry.proto

package trinsic.services.trustregistry.v1;

/**
 *
 *
 * <pre>
 * Not implemented.
 * </pre>
 *
 * Protobuf type {@code services.trustregistry.v1.FetchDataResponse}
 */
public final class FetchDataResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.trustregistry.v1.FetchDataResponse)
    FetchDataResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FetchDataResponse.newBuilder() to construct.
  private FetchDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FetchDataResponse() {
    responseJson_ = "";
    continuationToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FetchDataResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
        .internal_static_services_trustregistry_v1_FetchDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
        .internal_static_services_trustregistry_v1_FetchDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.trustregistry.v1.FetchDataResponse.class,
            trinsic.services.trustregistry.v1.FetchDataResponse.Builder.class);
  }

  public static final int RESPONSE_JSON_FIELD_NUMBER = 1;
  private volatile java.lang.Object responseJson_;
  /**
   * <code>string response_json = 1;</code>
   *
   * @return The responseJson.
   */
  @java.lang.Override
  public java.lang.String getResponseJson() {
    java.lang.Object ref = responseJson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseJson_ = s;
      return s;
    }
  }
  /**
   * <code>string response_json = 1;</code>
   *
   * @return The bytes for responseJson.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResponseJsonBytes() {
    java.lang.Object ref = responseJson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      responseJson_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HAS_MORE_RESULTS_FIELD_NUMBER = 2;
  private boolean hasMoreResults_;
  /**
   * <code>bool has_more_results = 2;</code>
   *
   * @return The hasMoreResults.
   */
  @java.lang.Override
  public boolean getHasMoreResults() {
    return hasMoreResults_;
  }

  public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object continuationToken_;
  /**
   * <code>string continuation_token = 3;</code>
   *
   * @return The continuationToken.
   */
  @java.lang.Override
  public java.lang.String getContinuationToken() {
    java.lang.Object ref = continuationToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      continuationToken_ = s;
      return s;
    }
  }
  /**
   * <code>string continuation_token = 3;</code>
   *
   * @return The bytes for continuationToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContinuationTokenBytes() {
    java.lang.Object ref = continuationToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      continuationToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(responseJson_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, responseJson_);
    }
    if (hasMoreResults_ != false) {
      output.writeBool(2, hasMoreResults_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(continuationToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, continuationToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(responseJson_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, responseJson_);
    }
    if (hasMoreResults_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, hasMoreResults_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(continuationToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, continuationToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof trinsic.services.trustregistry.v1.FetchDataResponse)) {
      return super.equals(obj);
    }
    trinsic.services.trustregistry.v1.FetchDataResponse other =
        (trinsic.services.trustregistry.v1.FetchDataResponse) obj;

    if (!getResponseJson().equals(other.getResponseJson())) return false;
    if (getHasMoreResults() != other.getHasMoreResults()) return false;
    if (!getContinuationToken().equals(other.getContinuationToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESPONSE_JSON_FIELD_NUMBER;
    hash = (53 * hash) + getResponseJson().hashCode();
    hash = (37 * hash) + HAS_MORE_RESULTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHasMoreResults());
    hash = (37 * hash) + CONTINUATION_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getContinuationToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse parseFrom(
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

  public static Builder newBuilder(trinsic.services.trustregistry.v1.FetchDataResponse prototype) {
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
   * Not implemented.
   * </pre>
   *
   * Protobuf type {@code services.trustregistry.v1.FetchDataResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.trustregistry.v1.FetchDataResponse)
      trinsic.services.trustregistry.v1.FetchDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
          .internal_static_services_trustregistry_v1_FetchDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
          .internal_static_services_trustregistry_v1_FetchDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.trustregistry.v1.FetchDataResponse.class,
              trinsic.services.trustregistry.v1.FetchDataResponse.Builder.class);
    }

    // Construct using trinsic.services.trustregistry.v1.FetchDataResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      responseJson_ = "";

      hasMoreResults_ = false;

      continuationToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.trustregistry.v1.TrustRegistryOuterClass
          .internal_static_services_trustregistry_v1_FetchDataResponse_descriptor;
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.FetchDataResponse getDefaultInstanceForType() {
      return trinsic.services.trustregistry.v1.FetchDataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.FetchDataResponse build() {
      trinsic.services.trustregistry.v1.FetchDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.trustregistry.v1.FetchDataResponse buildPartial() {
      trinsic.services.trustregistry.v1.FetchDataResponse result =
          new trinsic.services.trustregistry.v1.FetchDataResponse(this);
      result.responseJson_ = responseJson_;
      result.hasMoreResults_ = hasMoreResults_;
      result.continuationToken_ = continuationToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof trinsic.services.trustregistry.v1.FetchDataResponse) {
        return mergeFrom((trinsic.services.trustregistry.v1.FetchDataResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.trustregistry.v1.FetchDataResponse other) {
      if (other == trinsic.services.trustregistry.v1.FetchDataResponse.getDefaultInstance())
        return this;
      if (!other.getResponseJson().isEmpty()) {
        responseJson_ = other.responseJson_;
        onChanged();
      }
      if (other.getHasMoreResults() != false) {
        setHasMoreResults(other.getHasMoreResults());
      }
      if (!other.getContinuationToken().isEmpty()) {
        continuationToken_ = other.continuationToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                responseJson_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 16:
              {
                hasMoreResults_ = input.readBool();

                break;
              } // case 16
            case 26:
              {
                continuationToken_ = input.readStringRequireUtf8();

                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object responseJson_ = "";
    /**
     * <code>string response_json = 1;</code>
     *
     * @return The responseJson.
     */
    public java.lang.String getResponseJson() {
      java.lang.Object ref = responseJson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseJson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string response_json = 1;</code>
     *
     * @return The bytes for responseJson.
     */
    public com.google.protobuf.ByteString getResponseJsonBytes() {
      java.lang.Object ref = responseJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        responseJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string response_json = 1;</code>
     *
     * @param value The responseJson to set.
     * @return This builder for chaining.
     */
    public Builder setResponseJson(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      responseJson_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string response_json = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResponseJson() {

      responseJson_ = getDefaultInstance().getResponseJson();
      onChanged();
      return this;
    }
    /**
     * <code>string response_json = 1;</code>
     *
     * @param value The bytes for responseJson to set.
     * @return This builder for chaining.
     */
    public Builder setResponseJsonBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      responseJson_ = value;
      onChanged();
      return this;
    }

    private boolean hasMoreResults_;
    /**
     * <code>bool has_more_results = 2;</code>
     *
     * @return The hasMoreResults.
     */
    @java.lang.Override
    public boolean getHasMoreResults() {
      return hasMoreResults_;
    }
    /**
     * <code>bool has_more_results = 2;</code>
     *
     * @param value The hasMoreResults to set.
     * @return This builder for chaining.
     */
    public Builder setHasMoreResults(boolean value) {

      hasMoreResults_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool has_more_results = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHasMoreResults() {

      hasMoreResults_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object continuationToken_ = "";
    /**
     * <code>string continuation_token = 3;</code>
     *
     * @return The continuationToken.
     */
    public java.lang.String getContinuationToken() {
      java.lang.Object ref = continuationToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        continuationToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string continuation_token = 3;</code>
     *
     * @return The bytes for continuationToken.
     */
    public com.google.protobuf.ByteString getContinuationTokenBytes() {
      java.lang.Object ref = continuationToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        continuationToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string continuation_token = 3;</code>
     *
     * @param value The continuationToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuationToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      continuationToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string continuation_token = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContinuationToken() {

      continuationToken_ = getDefaultInstance().getContinuationToken();
      onChanged();
      return this;
    }
    /**
     * <code>string continuation_token = 3;</code>
     *
     * @param value The bytes for continuationToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuationTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      continuationToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:services.trustregistry.v1.FetchDataResponse)
  }

  // @@protoc_insertion_point(class_scope:services.trustregistry.v1.FetchDataResponse)
  private static final trinsic.services.trustregistry.v1.FetchDataResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.trustregistry.v1.FetchDataResponse();
  }

  public static trinsic.services.trustregistry.v1.FetchDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchDataResponse> PARSER =
      new com.google.protobuf.AbstractParser<FetchDataResponse>() {
        @java.lang.Override
        public FetchDataResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<FetchDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.trustregistry.v1.FetchDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
