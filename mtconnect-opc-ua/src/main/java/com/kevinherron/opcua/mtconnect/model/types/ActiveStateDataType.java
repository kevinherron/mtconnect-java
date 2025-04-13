package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum ActiveStateDataType implements UaEnumeratedType {
  /** The value of the data entity that is engaging. */
  Active(0),

  /** The value of the data entity that is not engaging. */
  Inactive(1);

  private final int value;

  ActiveStateDataType(int value) {
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

  public static @Nullable ActiveStateDataType from(int value) {
    return switch (value) {
      case 0 -> Active;
      case 1 -> Inactive;
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
              new LocalizedText("", "The value of the data entity that is not engaging."),
              "INACTIVE")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("ns=1;i=2197");
  }
}
