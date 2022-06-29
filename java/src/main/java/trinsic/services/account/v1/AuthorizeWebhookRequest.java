// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/account/v1/account.proto

package trinsic.services.account.v1;

/**
 *
 *
 * <pre>
 * Authorize ecosystem to receive wallet events
 * </pre>
 *
 * Protobuf type {@code services.account.v1.AuthorizeWebhookRequest}
 */
public final class AuthorizeWebhookRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.account.v1.AuthorizeWebhookRequest)
    AuthorizeWebhookRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AuthorizeWebhookRequest.newBuilder() to construct.
  private AuthorizeWebhookRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AuthorizeWebhookRequest() {
    events_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AuthorizeWebhookRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AuthorizeWebhookRequest(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                events_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              events_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        events_ = events_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.account.v1.AccountOuterClass
        .internal_static_services_account_v1_AuthorizeWebhookRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.account.v1.AccountOuterClass
        .internal_static_services_account_v1_AuthorizeWebhookRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.account.v1.AuthorizeWebhookRequest.class,
            trinsic.services.account.v1.AuthorizeWebhookRequest.Builder.class);
  }

  public static final int EVENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList events_;
  /**
   *
   *
   * <pre>
   * Events to authorize access to. Default is "*" (all events)
   * </pre>
   *
   * <code>repeated string events = 1;</code>
   *
   * @return A list containing the events.
   */
  public com.google.protobuf.ProtocolStringList getEventsList() {
    return events_;
  }
  /**
   *
   *
   * <pre>
   * Events to authorize access to. Default is "*" (all events)
   * </pre>
   *
   * <code>repeated string events = 1;</code>
   *
   * @return The count of events.
   */
  public int getEventsCount() {
    return events_.size();
  }
  /**
   *
   *
   * <pre>
   * Events to authorize access to. Default is "*" (all events)
   * </pre>
   *
   * <code>repeated string events = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The events at the given index.
   */
  public java.lang.String getEvents(int index) {
    return events_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Events to authorize access to. Default is "*" (all events)
   * </pre>
   *
   * <code>repeated string events = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the events at the given index.
   */
  public com.google.protobuf.ByteString getEventsBytes(int index) {
    return events_.getByteString(index);
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
    for (int i = 0; i < events_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, events_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < events_.size(); i++) {
        dataSize += computeStringSizeNoTag(events_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEventsList().size();
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
    if (!(obj instanceof trinsic.services.account.v1.AuthorizeWebhookRequest)) {
      return super.equals(obj);
    }
    trinsic.services.account.v1.AuthorizeWebhookRequest other =
        (trinsic.services.account.v1.AuthorizeWebhookRequest) obj;

    if (!getEventsList().equals(other.getEventsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest parseFrom(
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

  public static Builder newBuilder(trinsic.services.account.v1.AuthorizeWebhookRequest prototype) {
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
   * Authorize ecosystem to receive wallet events
   * </pre>
   *
   * Protobuf type {@code services.account.v1.AuthorizeWebhookRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.account.v1.AuthorizeWebhookRequest)
      trinsic.services.account.v1.AuthorizeWebhookRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.account.v1.AccountOuterClass
          .internal_static_services_account_v1_AuthorizeWebhookRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.account.v1.AccountOuterClass
          .internal_static_services_account_v1_AuthorizeWebhookRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.account.v1.AuthorizeWebhookRequest.class,
              trinsic.services.account.v1.AuthorizeWebhookRequest.Builder.class);
    }

    // Construct using trinsic.services.account.v1.AuthorizeWebhookRequest.newBuilder()
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
      events_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.account.v1.AccountOuterClass
          .internal_static_services_account_v1_AuthorizeWebhookRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.account.v1.AuthorizeWebhookRequest getDefaultInstanceForType() {
      return trinsic.services.account.v1.AuthorizeWebhookRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.account.v1.AuthorizeWebhookRequest build() {
      trinsic.services.account.v1.AuthorizeWebhookRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.account.v1.AuthorizeWebhookRequest buildPartial() {
      trinsic.services.account.v1.AuthorizeWebhookRequest result =
          new trinsic.services.account.v1.AuthorizeWebhookRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        events_ = events_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.events_ = events_;
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
      if (other instanceof trinsic.services.account.v1.AuthorizeWebhookRequest) {
        return mergeFrom((trinsic.services.account.v1.AuthorizeWebhookRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.account.v1.AuthorizeWebhookRequest other) {
      if (other == trinsic.services.account.v1.AuthorizeWebhookRequest.getDefaultInstance())
        return this;
      if (!other.events_.isEmpty()) {
        if (events_.isEmpty()) {
          events_ = other.events_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEventsIsMutable();
          events_.addAll(other.events_);
        }
        onChanged();
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
      trinsic.services.account.v1.AuthorizeWebhookRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (trinsic.services.account.v1.AuthorizeWebhookRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList events_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        events_ = new com.google.protobuf.LazyStringArrayList(events_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Events to authorize access to. Default is "*" (all events)
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     *
     * @return A list containing the events.
     */
    public com.google.protobuf.ProtocolStringList getEventsList() {
      return events_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Events to authorize access to. Default is "*" (all events)
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     *
     * @return The count of events.
     */
    public int getEventsCount() {
      return events_.size();
    }
    /**
     *
     *
     * <pre>
     * Events to authorize access to. Default is "*" (all events)
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The events at the given index.
     */
    public java.lang.String getEvents(int index) {
      return events_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Events to authorize access to. Default is "*" (all events)
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the events at the given index.
     */
    public com.google.protobuf.ByteString getEventsBytes(int index) {
      return events_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Events to authorize access to. Default is "*" (all events)
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The events to set.
     * @return This builder for chaining.
     */
    public Builder setEvents(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEventsIsMutable();
      events_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Events to authorize access to. Default is "*" (all events)
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     *
     * @param value The events to add.
     * @return This builder for chaining.
     */
    public Builder addEvents(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEventsIsMutable();
      events_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Events to authorize access to. Default is "*" (all events)
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     *
     * @param values The events to add.
     * @return This builder for chaining.
     */
    public Builder addAllEvents(java.lang.Iterable<java.lang.String> values) {
      ensureEventsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, events_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Events to authorize access to. Default is "*" (all events)
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEvents() {
      events_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Events to authorize access to. Default is "*" (all events)
     * </pre>
     *
     * <code>repeated string events = 1;</code>
     *
     * @param value The bytes of the events to add.
     * @return This builder for chaining.
     */
    public Builder addEventsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureEventsIsMutable();
      events_.add(value);
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

    // @@protoc_insertion_point(builder_scope:services.account.v1.AuthorizeWebhookRequest)
  }

  // @@protoc_insertion_point(class_scope:services.account.v1.AuthorizeWebhookRequest)
  private static final trinsic.services.account.v1.AuthorizeWebhookRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.account.v1.AuthorizeWebhookRequest();
  }

  public static trinsic.services.account.v1.AuthorizeWebhookRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthorizeWebhookRequest> PARSER =
      new com.google.protobuf.AbstractParser<AuthorizeWebhookRequest>() {
        @java.lang.Override
        public AuthorizeWebhookRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AuthorizeWebhookRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AuthorizeWebhookRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthorizeWebhookRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.account.v1.AuthorizeWebhookRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}