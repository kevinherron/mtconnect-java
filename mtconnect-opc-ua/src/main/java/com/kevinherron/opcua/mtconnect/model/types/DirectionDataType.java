package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum DirectionDataType implements UaEnumeratedType {
  /** A rotary component type rotating in a clockwise fashion using the right-hand rule. */
  Clockwise(0),

  /** A rotary component type rotating in a counter clockwise fashion using the right-hand rule. */
  CounterClockwise(1),

  /** A linear type component is moving in the direction of decreasing position value. */
  Negative(2),

  /** A linear type component is moving in the direction of increasing position value. */
  Positive(3);

  private final int value;

  DirectionDataType(int value) {
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

  public static @Nullable DirectionDataType from(int value) {
    return switch (value) {
      case 0 -> Clockwise;
      case 1 -> CounterClockwise;
      case 2 -> Negative;
      case 3 -> Positive;
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
                  "A rotary component type rotating in a clockwise fashion using the right-hand"
                      + " rule."),
              "CLOCKWISE"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "A rotary component type rotating in a counter clockwise fashion using the"
                      + " right-hand rule."),
              "COUNTER_CLOCKWISE"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "A linear type component is moving in the direction of decreasing position"
                      + " value."),
              "NEGATIVE"),
          new EnumField(
              3L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "A linear type component is moving in the direction of increasing position"
                      + " value."),
              "POSITIVE")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("ns=1;i=2205");
  }
}
