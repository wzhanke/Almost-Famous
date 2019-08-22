// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NetMessage.proto

package LockstepProto;

/**
 * Protobuf type {@code LockstepProto.S2CLockStep}
 */
public  final class S2CLockStep extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LockstepProto.S2CLockStep)
    S2CLockStepOrBuilder {
private static final long serialVersionUID = 0L;
  // Use S2CLockStep.newBuilder() to construct.
  private S2CLockStep(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private S2CLockStep() {
    f_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new S2CLockStep();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private S2CLockStep(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              f_ = new java.util.ArrayList<LockstepProto.Frame>();
              mutable_bitField0_ |= 0x00000001;
            }
            f_.add(
                input.readMessage(LockstepProto.Frame.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        f_ = java.util.Collections.unmodifiableList(f_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_S2CLockStep_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_S2CLockStep_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            LockstepProto.S2CLockStep.class, LockstepProto.S2CLockStep.Builder.class);
  }

  public static final int F_FIELD_NUMBER = 1;
  private java.util.List<LockstepProto.Frame> f_;
  /**
   * <code>repeated .LockstepProto.Frame f = 1;</code>
   */
  public java.util.List<LockstepProto.Frame> getFList() {
    return f_;
  }
  /**
   * <code>repeated .LockstepProto.Frame f = 1;</code>
   */
  public java.util.List<? extends LockstepProto.FrameOrBuilder> 
      getFOrBuilderList() {
    return f_;
  }
  /**
   * <code>repeated .LockstepProto.Frame f = 1;</code>
   */
  public int getFCount() {
    return f_.size();
  }
  /**
   * <code>repeated .LockstepProto.Frame f = 1;</code>
   */
  public LockstepProto.Frame getF(int index) {
    return f_.get(index);
  }
  /**
   * <code>repeated .LockstepProto.Frame f = 1;</code>
   */
  public LockstepProto.FrameOrBuilder getFOrBuilder(
      int index) {
    return f_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < f_.size(); i++) {
      output.writeMessage(1, f_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < f_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, f_.get(i));
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
    if (!(obj instanceof LockstepProto.S2CLockStep)) {
      return super.equals(obj);
    }
    LockstepProto.S2CLockStep other = (LockstepProto.S2CLockStep) obj;

    if (!getFList()
        .equals(other.getFList())) return false;
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
    if (getFCount() > 0) {
      hash = (37 * hash) + F_FIELD_NUMBER;
      hash = (53 * hash) + getFList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static LockstepProto.S2CLockStep parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LockstepProto.S2CLockStep parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LockstepProto.S2CLockStep parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LockstepProto.S2CLockStep parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LockstepProto.S2CLockStep parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LockstepProto.S2CLockStep parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LockstepProto.S2CLockStep parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LockstepProto.S2CLockStep parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static LockstepProto.S2CLockStep parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static LockstepProto.S2CLockStep parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static LockstepProto.S2CLockStep parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LockstepProto.S2CLockStep parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(LockstepProto.S2CLockStep prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code LockstepProto.S2CLockStep}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LockstepProto.S2CLockStep)
      LockstepProto.S2CLockStepOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_S2CLockStep_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_S2CLockStep_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LockstepProto.S2CLockStep.class, LockstepProto.S2CLockStep.Builder.class);
    }

    // Construct using LockstepProto.S2CLockStep.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getFFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fBuilder_ == null) {
        f_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_S2CLockStep_descriptor;
    }

    @java.lang.Override
    public LockstepProto.S2CLockStep getDefaultInstanceForType() {
      return LockstepProto.S2CLockStep.getDefaultInstance();
    }

    @java.lang.Override
    public LockstepProto.S2CLockStep build() {
      LockstepProto.S2CLockStep result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public LockstepProto.S2CLockStep buildPartial() {
      LockstepProto.S2CLockStep result = new LockstepProto.S2CLockStep(this);
      int from_bitField0_ = bitField0_;
      if (fBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          f_ = java.util.Collections.unmodifiableList(f_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.f_ = f_;
      } else {
        result.f_ = fBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof LockstepProto.S2CLockStep) {
        return mergeFrom((LockstepProto.S2CLockStep)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(LockstepProto.S2CLockStep other) {
      if (other == LockstepProto.S2CLockStep.getDefaultInstance()) return this;
      if (fBuilder_ == null) {
        if (!other.f_.isEmpty()) {
          if (f_.isEmpty()) {
            f_ = other.f_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFIsMutable();
            f_.addAll(other.f_);
          }
          onChanged();
        }
      } else {
        if (!other.f_.isEmpty()) {
          if (fBuilder_.isEmpty()) {
            fBuilder_.dispose();
            fBuilder_ = null;
            f_ = other.f_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFFieldBuilder() : null;
          } else {
            fBuilder_.addAllMessages(other.f_);
          }
        }
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
      LockstepProto.S2CLockStep parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (LockstepProto.S2CLockStep) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<LockstepProto.Frame> f_ =
      java.util.Collections.emptyList();
    private void ensureFIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        f_ = new java.util.ArrayList<LockstepProto.Frame>(f_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        LockstepProto.Frame, LockstepProto.Frame.Builder, LockstepProto.FrameOrBuilder> fBuilder_;

    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public java.util.List<LockstepProto.Frame> getFList() {
      if (fBuilder_ == null) {
        return java.util.Collections.unmodifiableList(f_);
      } else {
        return fBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public int getFCount() {
      if (fBuilder_ == null) {
        return f_.size();
      } else {
        return fBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public LockstepProto.Frame getF(int index) {
      if (fBuilder_ == null) {
        return f_.get(index);
      } else {
        return fBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public Builder setF(
        int index, LockstepProto.Frame value) {
      if (fBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFIsMutable();
        f_.set(index, value);
        onChanged();
      } else {
        fBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public Builder setF(
        int index, LockstepProto.Frame.Builder builderForValue) {
      if (fBuilder_ == null) {
        ensureFIsMutable();
        f_.set(index, builderForValue.build());
        onChanged();
      } else {
        fBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public Builder addF(LockstepProto.Frame value) {
      if (fBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFIsMutable();
        f_.add(value);
        onChanged();
      } else {
        fBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public Builder addF(
        int index, LockstepProto.Frame value) {
      if (fBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFIsMutable();
        f_.add(index, value);
        onChanged();
      } else {
        fBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public Builder addF(
        LockstepProto.Frame.Builder builderForValue) {
      if (fBuilder_ == null) {
        ensureFIsMutable();
        f_.add(builderForValue.build());
        onChanged();
      } else {
        fBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public Builder addF(
        int index, LockstepProto.Frame.Builder builderForValue) {
      if (fBuilder_ == null) {
        ensureFIsMutable();
        f_.add(index, builderForValue.build());
        onChanged();
      } else {
        fBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public Builder addAllF(
        java.lang.Iterable<? extends LockstepProto.Frame> values) {
      if (fBuilder_ == null) {
        ensureFIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, f_);
        onChanged();
      } else {
        fBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public Builder clearF() {
      if (fBuilder_ == null) {
        f_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public Builder removeF(int index) {
      if (fBuilder_ == null) {
        ensureFIsMutable();
        f_.remove(index);
        onChanged();
      } else {
        fBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public LockstepProto.Frame.Builder getFBuilder(
        int index) {
      return getFFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public LockstepProto.FrameOrBuilder getFOrBuilder(
        int index) {
      if (fBuilder_ == null) {
        return f_.get(index);  } else {
        return fBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public java.util.List<? extends LockstepProto.FrameOrBuilder> 
         getFOrBuilderList() {
      if (fBuilder_ != null) {
        return fBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(f_);
      }
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public LockstepProto.Frame.Builder addFBuilder() {
      return getFFieldBuilder().addBuilder(
          LockstepProto.Frame.getDefaultInstance());
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public LockstepProto.Frame.Builder addFBuilder(
        int index) {
      return getFFieldBuilder().addBuilder(
          index, LockstepProto.Frame.getDefaultInstance());
    }
    /**
     * <code>repeated .LockstepProto.Frame f = 1;</code>
     */
    public java.util.List<LockstepProto.Frame.Builder> 
         getFBuilderList() {
      return getFFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        LockstepProto.Frame, LockstepProto.Frame.Builder, LockstepProto.FrameOrBuilder> 
        getFFieldBuilder() {
      if (fBuilder_ == null) {
        fBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            LockstepProto.Frame, LockstepProto.Frame.Builder, LockstepProto.FrameOrBuilder>(
                f_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        f_ = null;
      }
      return fBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:LockstepProto.S2CLockStep)
  }

  // @@protoc_insertion_point(class_scope:LockstepProto.S2CLockStep)
  private static final LockstepProto.S2CLockStep DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LockstepProto.S2CLockStep();
  }

  public static LockstepProto.S2CLockStep getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<S2CLockStep>
      PARSER = new com.google.protobuf.AbstractParser<S2CLockStep>() {
    @java.lang.Override
    public S2CLockStep parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new S2CLockStep(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<S2CLockStep> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<S2CLockStep> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public LockstepProto.S2CLockStep getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

