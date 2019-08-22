// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NetMessage.proto

package LockstepProto;

/**
 * Protobuf type {@code LockstepProto.C2SLockStep}
 */
public  final class C2SLockStep extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LockstepProto.C2SLockStep)
    C2SLockStepOrBuilder {
private static final long serialVersionUID = 0L;
  // Use C2SLockStep.newBuilder() to construct.
  private C2SLockStep(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private C2SLockStep() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new C2SLockStep();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private C2SLockStep(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            LockstepProto.Command.Builder subBuilder = null;
            if (c_ != null) {
              subBuilder = c_.toBuilder();
            }
            c_ = input.readMessage(LockstepProto.Command.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(c_);
              c_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_C2SLockStep_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_C2SLockStep_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            LockstepProto.C2SLockStep.class, LockstepProto.C2SLockStep.Builder.class);
  }

  public static final int C_FIELD_NUMBER = 1;
  private LockstepProto.Command c_;
  /**
   * <code>.LockstepProto.Command c = 1;</code>
   */
  public boolean hasC() {
    return c_ != null;
  }
  /**
   * <code>.LockstepProto.Command c = 1;</code>
   */
  public LockstepProto.Command getC() {
    return c_ == null ? LockstepProto.Command.getDefaultInstance() : c_;
  }
  /**
   * <code>.LockstepProto.Command c = 1;</code>
   */
  public LockstepProto.CommandOrBuilder getCOrBuilder() {
    return getC();
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
    if (c_ != null) {
      output.writeMessage(1, getC());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (c_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getC());
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
    if (!(obj instanceof LockstepProto.C2SLockStep)) {
      return super.equals(obj);
    }
    LockstepProto.C2SLockStep other = (LockstepProto.C2SLockStep) obj;

    if (hasC() != other.hasC()) return false;
    if (hasC()) {
      if (!getC()
          .equals(other.getC())) return false;
    }
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
    if (hasC()) {
      hash = (37 * hash) + C_FIELD_NUMBER;
      hash = (53 * hash) + getC().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static LockstepProto.C2SLockStep parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LockstepProto.C2SLockStep parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LockstepProto.C2SLockStep parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LockstepProto.C2SLockStep parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LockstepProto.C2SLockStep parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LockstepProto.C2SLockStep parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LockstepProto.C2SLockStep parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LockstepProto.C2SLockStep parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static LockstepProto.C2SLockStep parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static LockstepProto.C2SLockStep parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static LockstepProto.C2SLockStep parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LockstepProto.C2SLockStep parseFrom(
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
  public static Builder newBuilder(LockstepProto.C2SLockStep prototype) {
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
   * Protobuf type {@code LockstepProto.C2SLockStep}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LockstepProto.C2SLockStep)
      LockstepProto.C2SLockStepOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_C2SLockStep_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_C2SLockStep_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LockstepProto.C2SLockStep.class, LockstepProto.C2SLockStep.Builder.class);
    }

    // Construct using LockstepProto.C2SLockStep.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cBuilder_ == null) {
        c_ = null;
      } else {
        c_ = null;
        cBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_C2SLockStep_descriptor;
    }

    @java.lang.Override
    public LockstepProto.C2SLockStep getDefaultInstanceForType() {
      return LockstepProto.C2SLockStep.getDefaultInstance();
    }

    @java.lang.Override
    public LockstepProto.C2SLockStep build() {
      LockstepProto.C2SLockStep result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public LockstepProto.C2SLockStep buildPartial() {
      LockstepProto.C2SLockStep result = new LockstepProto.C2SLockStep(this);
      if (cBuilder_ == null) {
        result.c_ = c_;
      } else {
        result.c_ = cBuilder_.build();
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
      if (other instanceof LockstepProto.C2SLockStep) {
        return mergeFrom((LockstepProto.C2SLockStep)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(LockstepProto.C2SLockStep other) {
      if (other == LockstepProto.C2SLockStep.getDefaultInstance()) return this;
      if (other.hasC()) {
        mergeC(other.getC());
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
      LockstepProto.C2SLockStep parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (LockstepProto.C2SLockStep) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private LockstepProto.Command c_;
    private com.google.protobuf.SingleFieldBuilderV3<
        LockstepProto.Command, LockstepProto.Command.Builder, LockstepProto.CommandOrBuilder> cBuilder_;
    /**
     * <code>.LockstepProto.Command c = 1;</code>
     */
    public boolean hasC() {
      return cBuilder_ != null || c_ != null;
    }
    /**
     * <code>.LockstepProto.Command c = 1;</code>
     */
    public LockstepProto.Command getC() {
      if (cBuilder_ == null) {
        return c_ == null ? LockstepProto.Command.getDefaultInstance() : c_;
      } else {
        return cBuilder_.getMessage();
      }
    }
    /**
     * <code>.LockstepProto.Command c = 1;</code>
     */
    public Builder setC(LockstepProto.Command value) {
      if (cBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        c_ = value;
        onChanged();
      } else {
        cBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.LockstepProto.Command c = 1;</code>
     */
    public Builder setC(
        LockstepProto.Command.Builder builderForValue) {
      if (cBuilder_ == null) {
        c_ = builderForValue.build();
        onChanged();
      } else {
        cBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.LockstepProto.Command c = 1;</code>
     */
    public Builder mergeC(LockstepProto.Command value) {
      if (cBuilder_ == null) {
        if (c_ != null) {
          c_ =
            LockstepProto.Command.newBuilder(c_).mergeFrom(value).buildPartial();
        } else {
          c_ = value;
        }
        onChanged();
      } else {
        cBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.LockstepProto.Command c = 1;</code>
     */
    public Builder clearC() {
      if (cBuilder_ == null) {
        c_ = null;
        onChanged();
      } else {
        c_ = null;
        cBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.LockstepProto.Command c = 1;</code>
     */
    public LockstepProto.Command.Builder getCBuilder() {
      
      onChanged();
      return getCFieldBuilder().getBuilder();
    }
    /**
     * <code>.LockstepProto.Command c = 1;</code>
     */
    public LockstepProto.CommandOrBuilder getCOrBuilder() {
      if (cBuilder_ != null) {
        return cBuilder_.getMessageOrBuilder();
      } else {
        return c_ == null ?
            LockstepProto.Command.getDefaultInstance() : c_;
      }
    }
    /**
     * <code>.LockstepProto.Command c = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        LockstepProto.Command, LockstepProto.Command.Builder, LockstepProto.CommandOrBuilder> 
        getCFieldBuilder() {
      if (cBuilder_ == null) {
        cBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            LockstepProto.Command, LockstepProto.Command.Builder, LockstepProto.CommandOrBuilder>(
                getC(),
                getParentForChildren(),
                isClean());
        c_ = null;
      }
      return cBuilder_;
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


    // @@protoc_insertion_point(builder_scope:LockstepProto.C2SLockStep)
  }

  // @@protoc_insertion_point(class_scope:LockstepProto.C2SLockStep)
  private static final LockstepProto.C2SLockStep DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LockstepProto.C2SLockStep();
  }

  public static LockstepProto.C2SLockStep getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<C2SLockStep>
      PARSER = new com.google.protobuf.AbstractParser<C2SLockStep>() {
    @java.lang.Override
    public C2SLockStep parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new C2SLockStep(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<C2SLockStep> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<C2SLockStep> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public LockstepProto.C2SLockStep getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

