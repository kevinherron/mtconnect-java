package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum RotaryModeDataType implements UaEnumeratedType {
  /** The position of the axis is being interpolated. */
  Contour(0),

  /** The axis is configured to index. */
  Index(1),

  /** The axis is functioning as a spindle. */
  Spindle(2);

  private final int value;

  RotaryModeDataType(int value) {
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

  public static @Nullable RotaryModeDataType from(int value) {
    return switch (value) {
      case 0 -> Contour;
      case 1 -> Index;
      case 2 -> Spindle;
      default -> null;
    };
  }

  public static EnumDefinition definition() {
    return new EnumDefinition(
        new EnumField[] {
          new EnumField(
              0L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The position of the axis is being interpolated."),
              "CONTOUR"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The axis is configured to index."),
              "INDEX"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The axis is functioning as a spindle."),
              "SPINDLE")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2211");
  }
}
