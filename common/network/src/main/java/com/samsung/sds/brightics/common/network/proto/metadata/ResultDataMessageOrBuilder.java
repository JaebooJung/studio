// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package com.samsung.sds.brightics.common.network.proto.metadata;

public interface ResultDataMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.samsung.sds.brightics.common.network.proto.metadata.ResultDataMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 1;</code>
   */
  int getMessageStatusValue();
  /**
   * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 1;</code>
   */
  com.samsung.sds.brightics.common.network.proto.MessageStatus getMessageStatus();

  /**
   * <code>.google.protobuf.Any result = 2;</code>
   */
  boolean hasResult();
  /**
   * <code>.google.protobuf.Any result = 2;</code>
   */
  com.google.protobuf.Any getResult();
  /**
   * <code>.google.protobuf.Any result = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getResultOrBuilder();
}