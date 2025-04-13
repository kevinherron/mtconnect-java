package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum InterfaceStateDataType implements UaEnumeratedType {
  /** The value of the data entity that is engaging. */
  Active(0),

  /** Completion of an action. */
  Complete(1),

  /** Failure before completion of an action. */
  Fail(2),

  /** A component is not ready to engage. */
  NotReady(4),

  /** A component is ready to engage. */
  Ready(5);

  private final int value;

  InterfaceStateDataType(int value) {
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

  public static @Nullable InterfaceStateDataType from(int value) {
    return switch (value) {
      case 0 -> Active;
      case 1 -> Complete;
      case 2 -> Fail;
      case 4 -> NotReady;
      case 5 -> Ready;
      default -> null;
    };
  }

  public static EnumDefinition definition() {
    return new EnumDefinition(
        new EnumField[] {
          new EnumField(
              0L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The value of the data entity that is engaging."),
              "ACTIVE"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "Completion of an action."),
              "COMPLETE"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "Failure before completion of an action."),
              "FAIL"),
          new EnumField(
              4L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "A component is not ready to engage."),
              "NOT_READY"),
          new EnumField(
              5L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "A component is ready to engage."),
              "READY")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("ns=1;i=2234");
  }
}
