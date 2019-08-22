// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LSMessage.proto

package LockstepProto;

/**
 * Protobuf enum {@code LockstepProto.State}
 */
public enum State
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STATE_DEFAULT = 0;</code>
   */
  STATE_DEFAULT(0),
  /**
   * <code>BATTLE_READY_GO = 1;</code>
   */
  BATTLE_READY_GO(1),
  /**
   * <code>BROKEN_LINE = 2;</code>
   */
  BROKEN_LINE(2),
  /**
   * <code>BATTLE_END_NORMAL = 3;</code>
   */
  BATTLE_END_NORMAL(3),
  /**
   * <code>BATTLE_END_EXCEPTION = 4;</code>
   */
  BATTLE_END_EXCEPTION(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STATE_DEFAULT = 0;</code>
   */
  public static final int STATE_DEFAULT_VALUE = 0;
  /**
   * <code>BATTLE_READY_GO = 1;</code>
   */
  public static final int BATTLE_READY_GO_VALUE = 1;
  /**
   * <code>BROKEN_LINE = 2;</code>
   */
  public static final int BROKEN_LINE_VALUE = 2;
  /**
   * <code>BATTLE_END_NORMAL = 3;</code>
   */
  public static final int BATTLE_END_NORMAL_VALUE = 3;
  /**
   * <code>BATTLE_END_EXCEPTION = 4;</code>
   */
  public static final int BATTLE_END_EXCEPTION_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static State valueOf(int value) {
    return forNumber(value);
  }

  public static State forNumber(int value) {
    switch (value) {
      case 0: return STATE_DEFAULT;
      case 1: return BATTLE_READY_GO;
      case 2: return BROKEN_LINE;
      case 3: return BATTLE_END_NORMAL;
      case 4: return BATTLE_END_EXCEPTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<State>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return LockstepProto.LSMessage.getDescriptor().getEnumTypes().get(1);
  }

  private static final State[] VALUES = values();

  public static State valueOf(
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

  private final int value;

  private State(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:LockstepProto.State)
}

