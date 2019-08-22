// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NetMessage.proto

package LockstepProto;

public interface C2SBattleEndOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LockstepProto.C2SBattleEnd)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated sint64 winners = 1;</code>
   */
  java.util.List<java.lang.Long> getWinnersList();
  /**
   * <code>repeated sint64 winners = 1;</code>
   */
  int getWinnersCount();
  /**
   * <code>repeated sint64 winners = 1;</code>
   */
  long getWinners(int index);

  /**
   * <code>repeated sint64 losers = 2;</code>
   */
  java.util.List<java.lang.Long> getLosersList();
  /**
   * <code>repeated sint64 losers = 2;</code>
   */
  int getLosersCount();
  /**
   * <code>repeated sint64 losers = 2;</code>
   */
  long getLosers(int index);

  /**
   * <pre>
   * 0=normal, 1=exception, 2=surrender
   * </pre>
   *
   * <code>uint32 state = 3;</code>
   */
  int getState();
}
