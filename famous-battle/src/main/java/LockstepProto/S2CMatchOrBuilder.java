// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NetMessage.proto

package LockstepProto;

public interface S2CMatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LockstepProto.S2CMatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
   */
  java.util.List<BattleActor>
      getActorsList();
  /**
   * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
   */
  LockstepProto.BattleActor getActors(int index);
  /**
   * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
   */
  int getActorsCount();
  /**
   * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
   */
  java.util.List<? extends BattleActorOrBuilder>
      getActorsOrBuilderList();
  /**
   * <code>repeated .LockstepProto.BattleActor actors = 1;</code>
   */
  LockstepProto.BattleActorOrBuilder getActorsOrBuilder(
          int index);

  /**
   * <code>uint32 seed = 2;</code>
   */
  int getSeed();

  /**
   * <code>sint32 mapId = 3;</code>
   */
  int getMapId();

  /**
   * <code>sint64 battleStartTime = 4;</code>
   */
  long getBattleStartTime();
}