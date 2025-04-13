package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum OnOffDataType implements UaEnumeratedType {
  /** Off state or value. */
  Off(0),

  /** On state or value. */
  On(1);

  private final int value;

  OnOffDataType(int value) {
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

  public static @Nullable OnOffDataType from(int value) {
    return switch (value) {
      case 0 -> Off;
      case 1 -> On;
      default -> null;
    };
  }

  public static EnumDefinition definition() {
    return new EnumDefinition(
        new EnumField[] {
          new EnumField(
              0L, LocalizedText.NULL_VALUE, new LocalizedText("", "Off state or value."), "OFF"),
          new EnumField(
              1L, LocalizedText.NULL_VALUE, new LocalizedText("", "On state or value."), "ON")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("ns=1;i=2204");
  }
}
