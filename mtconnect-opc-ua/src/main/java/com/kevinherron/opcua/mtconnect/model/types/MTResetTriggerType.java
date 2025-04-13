package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum MTResetTriggerType implements UaEnumeratedType {
  /**
   * The value of the data entity that is measuring an action or operation is to be reset upon
   * completion of that action or operation.
   */
  ActionComplete(0),

  /** The value of the data entity is to be reset at the end of a 12-month period. */
  Annual(1),

  /** The value of the data entity is to be reset at the end of a 24-hour period. */
  Day(2),

  /** Action related to maintenance on the piece of equipment. */
  Maintenance(3),

  /** Operations based on the instructions received from an external source. */
  Manual(4),

  /** The value of the data entity is to be reset at the end of a monthly period. */
  Month(5),

  /**
   * The value of the data entity is to be reset when power was applied to the piece of equipment
   * after a planned or unplanned interruption of power has occurred.
   */
  PowerOn(6),

  /** The value of the data entity is to be reset at the end of a work shift. */
  Shift(7),

  /** The value of the data entity is to be reset at the end of a 7-day period. */
  Week(8);

  private final int value;

  MTResetTriggerType(int value) {
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

  public static @Nullable MTResetTriggerType from(int value) {
    return switch (value) {
      case 0 -> ActionComplete;
      case 1 -> Annual;
      case 2 -> Day;
      case 3 -> Maintenance;
      case 4 -> Manual;
      case 5 -> Month;
      case 6 -> PowerOn;
      case 7 -> Shift;
      case 8 -> Week;
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
                  "The value of the data entity that is measuring an action or operation is to be"
                      + " reset upon completion of that action or operation."),
              "ACTION_COMPLETE"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The value of the data entity is to be reset at the end of a 12-month period."),
              "ANNUAL"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The value of the data entity is to be reset at the end of a 24-hour period."),
              "DAY"),
          new EnumField(
              3L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "Action related to maintenance on the piece of equipment."),
              "MAINTENANCE"),
          new EnumField(
              4L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "", "Operations based on the instructions received from an external source."),
              "MANUAL"),
          new EnumField(
              5L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The value of the data entity is to be reset at the end of a monthly period."),
              "MONTH"),
          new EnumField(
              6L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The value of the data entity is to be reset when power was applied to the piece"
                      + " of equipment after a planned or unplanned interruption of power has"
                      + " occurred."),
              "POWER_ON"),
          new EnumField(
              7L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "", "The value of the data entity is to be reset at the end of a work shift."),
              "SHIFT"),
          new EnumField(
              8L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "", "The value of the data entity is to be reset at the end of a 7-day period."),
              "WEEK")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2636");
  }
}
