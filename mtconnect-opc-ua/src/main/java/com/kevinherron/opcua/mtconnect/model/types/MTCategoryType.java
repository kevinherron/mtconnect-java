package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum MTCategoryType implements UaEnumeratedType {
  /**
   * An event category is a data item representing a discrete piece of information from the piece of
   * equipment.
   */
  Event(0),

  /**
   * A condition category is a data item that communicates information about the health of a piece
   * of equipment and its ability to function.
   */
  Condition(1),

  /**
   * A sample category is the reading of the value of a continuously variable or analog data value.
   */
  Sample(2);

  private final int value;

  MTCategoryType(int value) {
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

  public static @Nullable MTCategoryType from(int value) {
    return switch (value) {
      case 0 -> Event;
      case 1 -> Condition;
      case 2 -> Sample;
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
                  "An event category is a data item representing a discrete piece of information"
                      + " from the piece of equipment."),
              "EVENT"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "A condition category is a data item that communicates information about the"
                      + " health of a piece of equipment and its ability to function."),
              "CONDITION"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "A sample category is the reading of the value of a continuously variable or"
                      + " analog data value."),
              "SAMPLE")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2634");
  }
}
