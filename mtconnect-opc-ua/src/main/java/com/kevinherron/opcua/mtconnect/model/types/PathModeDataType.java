package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum PathModeDataType implements UaEnumeratedType {
  /** The path is operating independently and without the influence of another path. */
  Independent(0),

  /**
   * It provides information or state values that influences the operation of other dataitem of
   * similar type.
   */
  Master(1),

  /** The axes associated with the path are mirroring the motion of the master value path. */
  Mirror(2),

  /**
   * Physical or logical parts which are not physically connected to each other but are operating
   * together.
   */
  Synchronous(3);

  private final int value;

  PathModeDataType(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }

  @Override
  public ExpandedNodeId getTypeId() {
    return TypeInfo.TYPE_ID;
  }

  public static @Nullable PathModeDataType from(int value) {
    return switch (value) {
      case 0 -> Independent;
      case 1 -> Master;
      case 2 -> Mirror;
      case 3 -> Synchronous;
      default -> null;
    };
  }

  public static EnumDefinition definition() {
    return new EnumDefinition(
        new EnumField[] {
          new EnumField(
              0L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The path is operating independently and without the influence of another path."),
              "INDEPENDENT"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "It provides information or state values that influences the operation of other"
                      + " dataitem of similar type."),
              "MASTER"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The axes associated with the path are mirroring the motion of the master value"
                      + " path."),
              "MIRROR"),
          new EnumField(
              3L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "Physical or logical parts which are not physically connected to each other but"
                      + " are operating together."),
              "SYNCHRONOUS")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("ns=1;i=2209");
  }
}
