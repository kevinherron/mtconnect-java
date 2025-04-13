package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum MTRepresentationType implements UaEnumeratedType {
  /**
   * A data entity where each discrete occurrence of the data may have the same value as the
   * previous occurrence of the data.
   */
  Discrete(0),

  /** A series of sampled data. */
  TimeSeries(1),

  /** The measured value of the sample data. */
  Value(2);

  private final int value;

  MTRepresentationType(int value) {
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

  public static @Nullable MTRepresentationType from(int value) {
    return switch (value) {
      case 0 -> Discrete;
      case 1 -> TimeSeries;
      case 2 -> Value;
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
                  "A data entity where each discrete occurrence of the data may have the same value"
                      + " as the previous occurrence of the data."),
              "DISCRETE"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "A series of sampled data."),
              "TIME_SERIES"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The measured value of the sample data."),
              "VALUE")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("ns=1;i=2633");
  }
}
