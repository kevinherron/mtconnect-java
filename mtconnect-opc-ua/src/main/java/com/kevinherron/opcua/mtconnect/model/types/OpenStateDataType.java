package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum OpenStateDataType implements UaEnumeratedType {
  /** A component is closed to the point of a positive confirmation. */
  Closed(0),

  /** A component is open to the point of a positive confirmation. */
  Open(1),

  /** An intermediate position. */
  Unlatched(2);

  private final int value;

  OpenStateDataType(int value) {
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

  public static @Nullable OpenStateDataType from(int value) {
    return switch (value) {
      case 0 -> Closed;
      case 1 -> Open;
      case 2 -> Unlatched;
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
                  "", "A component is closed to the point of a positive confirmation."),
              "CLOSED"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "A component is open to the point of a positive confirmation."),
              "OPEN"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "An intermediate position."),
              "UNLATCHED")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2201");
  }
}
