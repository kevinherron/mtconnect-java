package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum MTStatisticType implements UaEnumeratedType {
  /** Mathematical Average value calculated for the data item during the calculation period. */
  Average(0),

  /** The upper limit of data reported for a data item. */
  Maximum(1),

  /** The middle number of a series of numbers. */
  Median(2),

  /** The lower limit of data reported for a data item. */
  Minimum(3),

  /** The number in a series of numbers that occurs most often. */
  Mode(4),

  /**
   * Difference between the maximum and minimum value of a data item during the calculation period.
   * Also represents Peak-to-Peak measurement in a waveform.
   */
  Range(5),

  /**
   * Mathematical Root Mean Square (RMS) value calculated for the data item during the calculation
   * period.
   */
  RootMeanSquare(6),

  /**
   * Statistical Standard Deviation value calculated for the data item during the calculation
   * period.
   */
  StandardDeviation(7);

  private final int value;

  MTStatisticType(int value) {
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

  public static @Nullable MTStatisticType from(int value) {
    return switch (value) {
      case 0 -> Average;
      case 1 -> Maximum;
      case 2 -> Median;
      case 3 -> Minimum;
      case 4 -> Mode;
      case 5 -> Range;
      case 6 -> RootMeanSquare;
      case 7 -> StandardDeviation;
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
                  "Mathematical Average value calculated for the data item during the calculation"
                      + " period."),
              "AVERAGE"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The upper limit of data reported for a data item."),
              "MAXIMUM"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The middle number of a series of numbers."),
              "MEDIAN"),
          new EnumField(
              3L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The lower limit of data reported for a data item."),
              "MINIMUM"),
          new EnumField(
              4L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The number in a series of numbers that occurs most often."),
              "MODE"),
          new EnumField(
              5L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "Difference between the maximum and minimum value of a data item during the"
                      + " calculation period. Also represents Peak-to-Peak measurement in a"
                      + " waveform."),
              "RANGE"),
          new EnumField(
              6L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "Mathematical Root Mean Square (RMS) value calculated for the data item during"
                      + " the calculation period."),
              "ROOT_MEAN_SQUARE"),
          new EnumField(
              7L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "Statistical Standard Deviation value calculated for the data item during the"
                      + " calculation period."),
              "STANDARD_DEVIATION")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2659");
  }
}
