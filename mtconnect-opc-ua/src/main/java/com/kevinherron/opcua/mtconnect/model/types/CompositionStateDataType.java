package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum CompositionStateDataType implements UaEnumeratedType {
  /** The value of the data entity that is engaging. */
  Active(0),

  /** A component is closed to the point of a positive confirmation. */
  Closed(1),

  /** Reduction in the behavior of a structural element. */
  Down(2),

  /** The value of the data entity that is not engaging. */
  Inactive(3),

  /**
   * The position of the composition element is oriented to the left to the point of a positive
   * confirmation.
   */
  Left(4),

  /** Off state or value. */
  Off(5),

  /** On state or value. */
  On(6),

  /** A component is open to the point of a positive confirmation. */
  Open(7),

  /**
   * The position of the composition element is oriented to the right to the point of a positive
   * confirmation.
   */
  Right(8),

  /** It is in an intermediate position of the composition element. */
  Transitioning(9),

  /** An intermediate position. */
  Unlatched(10),

  /** Increase in the behavior of a structural element. */
  Up(11);

  private final int value;

  CompositionStateDataType(int value) {
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

  public static @Nullable CompositionStateDataType from(int value) {
    return switch (value) {
      case 0 -> Active;
      case 1 -> Closed;
      case 2 -> Down;
      case 3 -> Inactive;
      case 4 -> Left;
      case 5 -> Off;
      case 6 -> On;
      case 7 -> Open;
      case 8 -> Right;
      case 9 -> Transitioning;
      case 10 -> Unlatched;
      case 11 -> Up;
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
              new LocalizedText(
                  "", "A component is closed to the point of a positive confirmation."),
              "CLOSED"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "Reduction in the behavior of a structural element."),
              "DOWN"),
          new EnumField(
              3L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The value of the data entity that is not engaging."),
              "INACTIVE"),
          new EnumField(
              4L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The position of the composition element is oriented to the left to the point of"
                      + " a positive confirmation."),
              "LEFT"),
          new EnumField(
              5L, LocalizedText.NULL_VALUE, new LocalizedText("", "Off state or value."), "OFF"),
          new EnumField(
              6L, LocalizedText.NULL_VALUE, new LocalizedText("", "On state or value."), "ON"),
          new EnumField(
              7L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "A component is open to the point of a positive confirmation."),
              "OPEN"),
          new EnumField(
              8L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The position of the composition element is oriented to the right to the point of"
                      + " a positive confirmation."),
              "RIGHT"),
          new EnumField(
              9L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "", "It is in an intermediate position of the composition element."),
              "TRANSITIONING"),
          new EnumField(
              10L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "An intermediate position."),
              "UNLATCHED"),
          new EnumField(
              11L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "Increase in the behavior of a structural element."),
              "UP")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2202");
  }
}
