// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/account/v1/account.proto

package trinsic.services.account.v1;

/**
 *
 *
 * <pre>
 * Request for creating or signing into an account
 * </pre>
 *
 * Protobuf type {@code services.account.v1.SignInRequest}
 */
public final class SignInRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.account.v1.SignInRequest)
    SignInRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SignInRequest.newBuilder() to construct.
  private SignInRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SignInRequest() {
    invitationCode_ = "";
    ecosystemId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SignInRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.account.v1.AccountOuterClass
        .internal_static_services_account_v1_SignInRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.account.v1.AccountOuterClass
        .internal_static_services_account_v1_SignInRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.account.v1.SignInRequest.class,
            trinsic.services.account.v1.SignInRequest.Builder.class);
  }

  public static final int DETAILS_FIELD_NUMBER = 1;
  private trinsic.services.account.v1.AccountDetails details_;
  /**
   *
   *
   * <pre>
   * Account registration details
   * </pre>
   *
   * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
   * </code>
   *
   * @return Whether the details field is set.
   */
  @java.lang.Override
  public boolean hasDetails() {
    return details_ != null;
  }
  /**
   *
   *
   * <pre>
   * Account registration details
   * </pre>
   *
   * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
   * </code>
   *
   * @return The details.
   */
  @java.lang.Override
  public trinsic.services.account.v1.AccountDetails getDetails() {
    return details_ == null
        ? trinsic.services.account.v1.AccountDetails.getDefaultInstance()
        : details_;
  }
  /**
   *
   *
   * <pre>
   * Account registration details
   * </pre>
   *
   * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
   * </code>
   */
  @java.lang.Override
  public trinsic.services.account.v1.AccountDetailsOrBuilder getDetailsOrBuilder() {
    return getDetails();
  }

  public static final int INVITATION_CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object invitationCode_;
  /**
   *
   *
   * <pre>
   * DEPRECATED, will be removed April 1st 2023
   * Invitation code associated with this registration
   * </pre>
   *
   * <code>string invitation_code = 2 [deprecated = true, (.services.options.optional) = true];
   * </code>
   *
   * @deprecated services.account.v1.SignInRequest.invitation_code is deprecated. See
   *     services/account/v1/account.proto;l=17
   * @return The invitationCode.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.lang.String getInvitationCode() {
    java.lang.Object ref = invitationCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      invitationCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * DEPRECATED, will be removed April 1st 2023
   * Invitation code associated with this registration
   * </pre>
   *
   * <code>string invitation_code = 2 [deprecated = true, (.services.options.optional) = true];
   * </code>
   *
   * @deprecated services.account.v1.SignInRequest.invitation_code is deprecated. See
   *     services/account/v1/account.proto;l=17
   * @return The bytes for invitationCode.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getInvitationCodeBytes() {
    java.lang.Object ref = invitationCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      invitationCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ECOSYSTEM_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object ecosystemId_;
  /**
   *
   *
   * <pre>
   * ID of Ecosystem to use
   * Ignored if `invitation_code` is passed
   * </pre>
   *
   * <code>string ecosystem_id = 3 [(.services.options.optional) = true];</code>
   *
   * @return The ecosystemId.
   */
  @java.lang.Override
  public java.lang.String getEcosystemId() {
    java.lang.Object ref = ecosystemId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ecosystemId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * ID of Ecosystem to use
   * Ignored if `invitation_code` is passed
   * </pre>
   *
   * <code>string ecosystem_id = 3 [(.services.options.optional) = true];</code>
   *
   * @return The bytes for ecosystemId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEcosystemIdBytes() {
    java.lang.Object ref = ecosystemId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ecosystemId_ = b;
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
    if (details_ != null) {
      output.writeMessage(1, getDetails());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(invitationCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, invitationCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ecosystemId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ecosystemId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (details_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDetails());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(invitationCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, invitationCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ecosystemId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ecosystemId_);
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
    if (!(obj instanceof trinsic.services.account.v1.SignInRequest)) {
      return super.equals(obj);
    }
    trinsic.services.account.v1.SignInRequest other =
        (trinsic.services.account.v1.SignInRequest) obj;

    if (hasDetails() != other.hasDetails()) return false;
    if (hasDetails()) {
      if (!getDetails().equals(other.getDetails())) return false;
    }
    if (!getInvitationCode().equals(other.getInvitationCode())) return false;
    if (!getEcosystemId().equals(other.getEcosystemId())) return false;
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
    if (hasDetails()) {
      hash = (37 * hash) + DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getDetails().hashCode();
    }
    hash = (37 * hash) + INVITATION_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getInvitationCode().hashCode();
    hash = (37 * hash) + ECOSYSTEM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEcosystemId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.account.v1.SignInRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.account.v1.SignInRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.account.v1.SignInRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.account.v1.SignInRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.account.v1.SignInRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.account.v1.SignInRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.account.v1.SignInRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.account.v1.SignInRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.account.v1.SignInRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.account.v1.SignInRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.account.v1.SignInRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.account.v1.SignInRequest parseFrom(
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

  public static Builder newBuilder(trinsic.services.account.v1.SignInRequest prototype) {
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
   * Request for creating or signing into an account
   * </pre>
   *
   * Protobuf type {@code services.account.v1.SignInRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.account.v1.SignInRequest)
      trinsic.services.account.v1.SignInRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.account.v1.AccountOuterClass
          .internal_static_services_account_v1_SignInRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.account.v1.AccountOuterClass
          .internal_static_services_account_v1_SignInRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.account.v1.SignInRequest.class,
              trinsic.services.account.v1.SignInRequest.Builder.class);
    }

    // Construct using trinsic.services.account.v1.SignInRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (detailsBuilder_ == null) {
        details_ = null;
      } else {
        details_ = null;
        detailsBuilder_ = null;
      }
      invitationCode_ = "";

      ecosystemId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.account.v1.AccountOuterClass
          .internal_static_services_account_v1_SignInRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.account.v1.SignInRequest getDefaultInstanceForType() {
      return trinsic.services.account.v1.SignInRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.account.v1.SignInRequest build() {
      trinsic.services.account.v1.SignInRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.account.v1.SignInRequest buildPartial() {
      trinsic.services.account.v1.SignInRequest result =
          new trinsic.services.account.v1.SignInRequest(this);
      if (detailsBuilder_ == null) {
        result.details_ = details_;
      } else {
        result.details_ = detailsBuilder_.build();
      }
      result.invitationCode_ = invitationCode_;
      result.ecosystemId_ = ecosystemId_;
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
      if (other instanceof trinsic.services.account.v1.SignInRequest) {
        return mergeFrom((trinsic.services.account.v1.SignInRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.account.v1.SignInRequest other) {
      if (other == trinsic.services.account.v1.SignInRequest.getDefaultInstance()) return this;
      if (other.hasDetails()) {
        mergeDetails(other.getDetails());
      }
      if (!other.getInvitationCode().isEmpty()) {
        invitationCode_ = other.invitationCode_;
        onChanged();
      }
      if (!other.getEcosystemId().isEmpty()) {
        ecosystemId_ = other.ecosystemId_;
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
                input.readMessage(getDetailsFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                invitationCode_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 26:
              {
                ecosystemId_ = input.readStringRequireUtf8();

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

    private trinsic.services.account.v1.AccountDetails details_;
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.account.v1.AccountDetails,
            trinsic.services.account.v1.AccountDetails.Builder,
            trinsic.services.account.v1.AccountDetailsOrBuilder>
        detailsBuilder_;
    /**
     *
     *
     * <pre>
     * Account registration details
     * </pre>
     *
     * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
     * </code>
     *
     * @return Whether the details field is set.
     */
    public boolean hasDetails() {
      return detailsBuilder_ != null || details_ != null;
    }
    /**
     *
     *
     * <pre>
     * Account registration details
     * </pre>
     *
     * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
     * </code>
     *
     * @return The details.
     */
    public trinsic.services.account.v1.AccountDetails getDetails() {
      if (detailsBuilder_ == null) {
        return details_ == null
            ? trinsic.services.account.v1.AccountDetails.getDefaultInstance()
            : details_;
      } else {
        return detailsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Account registration details
     * </pre>
     *
     * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
     * </code>
     */
    public Builder setDetails(trinsic.services.account.v1.AccountDetails value) {
      if (detailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        details_ = value;
        onChanged();
      } else {
        detailsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Account registration details
     * </pre>
     *
     * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
     * </code>
     */
    public Builder setDetails(trinsic.services.account.v1.AccountDetails.Builder builderForValue) {
      if (detailsBuilder_ == null) {
        details_ = builderForValue.build();
        onChanged();
      } else {
        detailsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Account registration details
     * </pre>
     *
     * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
     * </code>
     */
    public Builder mergeDetails(trinsic.services.account.v1.AccountDetails value) {
      if (detailsBuilder_ == null) {
        if (details_ != null) {
          details_ =
              trinsic.services.account.v1.AccountDetails.newBuilder(details_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          details_ = value;
        }
        onChanged();
      } else {
        detailsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Account registration details
     * </pre>
     *
     * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
     * </code>
     */
    public Builder clearDetails() {
      if (detailsBuilder_ == null) {
        details_ = null;
        onChanged();
      } else {
        details_ = null;
        detailsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Account registration details
     * </pre>
     *
     * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
     * </code>
     */
    public trinsic.services.account.v1.AccountDetails.Builder getDetailsBuilder() {

      onChanged();
      return getDetailsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Account registration details
     * </pre>
     *
     * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
     * </code>
     */
    public trinsic.services.account.v1.AccountDetailsOrBuilder getDetailsOrBuilder() {
      if (detailsBuilder_ != null) {
        return detailsBuilder_.getMessageOrBuilder();
      } else {
        return details_ == null
            ? trinsic.services.account.v1.AccountDetails.getDefaultInstance()
            : details_;
      }
    }
    /**
     *
     *
     * <pre>
     * Account registration details
     * </pre>
     *
     * <code>.services.account.v1.AccountDetails details = 1 [(.services.options.optional) = true];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            trinsic.services.account.v1.AccountDetails,
            trinsic.services.account.v1.AccountDetails.Builder,
            trinsic.services.account.v1.AccountDetailsOrBuilder>
        getDetailsFieldBuilder() {
      if (detailsBuilder_ == null) {
        detailsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                trinsic.services.account.v1.AccountDetails,
                trinsic.services.account.v1.AccountDetails.Builder,
                trinsic.services.account.v1.AccountDetailsOrBuilder>(
                getDetails(), getParentForChildren(), isClean());
        details_ = null;
      }
      return detailsBuilder_;
    }

    private java.lang.Object invitationCode_ = "";
    /**
     *
     *
     * <pre>
     * DEPRECATED, will be removed April 1st 2023
     * Invitation code associated with this registration
     * </pre>
     *
     * <code>string invitation_code = 2 [deprecated = true, (.services.options.optional) = true];
     * </code>
     *
     * @deprecated services.account.v1.SignInRequest.invitation_code is deprecated. See
     *     services/account/v1/account.proto;l=17
     * @return The invitationCode.
     */
    @java.lang.Deprecated
    public java.lang.String getInvitationCode() {
      java.lang.Object ref = invitationCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        invitationCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED, will be removed April 1st 2023
     * Invitation code associated with this registration
     * </pre>
     *
     * <code>string invitation_code = 2 [deprecated = true, (.services.options.optional) = true];
     * </code>
     *
     * @deprecated services.account.v1.SignInRequest.invitation_code is deprecated. See
     *     services/account/v1/account.proto;l=17
     * @return The bytes for invitationCode.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getInvitationCodeBytes() {
      java.lang.Object ref = invitationCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        invitationCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED, will be removed April 1st 2023
     * Invitation code associated with this registration
     * </pre>
     *
     * <code>string invitation_code = 2 [deprecated = true, (.services.options.optional) = true];
     * </code>
     *
     * @deprecated services.account.v1.SignInRequest.invitation_code is deprecated. See
     *     services/account/v1/account.proto;l=17
     * @param value The invitationCode to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setInvitationCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      invitationCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED, will be removed April 1st 2023
     * Invitation code associated with this registration
     * </pre>
     *
     * <code>string invitation_code = 2 [deprecated = true, (.services.options.optional) = true];
     * </code>
     *
     * @deprecated services.account.v1.SignInRequest.invitation_code is deprecated. See
     *     services/account/v1/account.proto;l=17
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearInvitationCode() {

      invitationCode_ = getDefaultInstance().getInvitationCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DEPRECATED, will be removed April 1st 2023
     * Invitation code associated with this registration
     * </pre>
     *
     * <code>string invitation_code = 2 [deprecated = true, (.services.options.optional) = true];
     * </code>
     *
     * @deprecated services.account.v1.SignInRequest.invitation_code is deprecated. See
     *     services/account/v1/account.proto;l=17
     * @param value The bytes for invitationCode to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setInvitationCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      invitationCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ecosystemId_ = "";
    /**
     *
     *
     * <pre>
     * ID of Ecosystem to use
     * Ignored if `invitation_code` is passed
     * </pre>
     *
     * <code>string ecosystem_id = 3 [(.services.options.optional) = true];</code>
     *
     * @return The ecosystemId.
     */
    public java.lang.String getEcosystemId() {
      java.lang.Object ref = ecosystemId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ecosystemId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of Ecosystem to use
     * Ignored if `invitation_code` is passed
     * </pre>
     *
     * <code>string ecosystem_id = 3 [(.services.options.optional) = true];</code>
     *
     * @return The bytes for ecosystemId.
     */
    public com.google.protobuf.ByteString getEcosystemIdBytes() {
      java.lang.Object ref = ecosystemId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ecosystemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * ID of Ecosystem to use
     * Ignored if `invitation_code` is passed
     * </pre>
     *
     * <code>string ecosystem_id = 3 [(.services.options.optional) = true];</code>
     *
     * @param value The ecosystemId to set.
     * @return This builder for chaining.
     */
    public Builder setEcosystemId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      ecosystemId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of Ecosystem to use
     * Ignored if `invitation_code` is passed
     * </pre>
     *
     * <code>string ecosystem_id = 3 [(.services.options.optional) = true];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEcosystemId() {

      ecosystemId_ = getDefaultInstance().getEcosystemId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ID of Ecosystem to use
     * Ignored if `invitation_code` is passed
     * </pre>
     *
     * <code>string ecosystem_id = 3 [(.services.options.optional) = true];</code>
     *
     * @param value The bytes for ecosystemId to set.
     * @return This builder for chaining.
     */
    public Builder setEcosystemIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      ecosystemId_ = value;
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

    // @@protoc_insertion_point(builder_scope:services.account.v1.SignInRequest)
  }

  // @@protoc_insertion_point(class_scope:services.account.v1.SignInRequest)
  private static final trinsic.services.account.v1.SignInRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.account.v1.SignInRequest();
  }

  public static trinsic.services.account.v1.SignInRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignInRequest> PARSER =
      new com.google.protobuf.AbstractParser<SignInRequest>() {
        @java.lang.Override
        public SignInRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SignInRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignInRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.account.v1.SignInRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
