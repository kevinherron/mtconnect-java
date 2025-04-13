package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum AvailabilityDataType implements UaEnumeratedType {
  /** The value or status of an XML element when it is available. */
  Available(0),

  /**
   * The value of the data entity either when the data is not received or the entity is incapable of
   * providing data.
   */
  Unavailable(1);

  private final int value;

  AvailabilityDataType(int value) {
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

  public static @Nullable AvailabilityDataType from(int value) {
    return switch (value) {
      case 0 -> Available;
      case 1 -> Unavailable;
      default -> null;
    };
  }

  public static EnumDefinition definition() {
    return new EnumDefinition(
        new EnumField[] {
          new EnumField(
              0L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The value or status of an XML element when it is available."),
              "AVAILABLE"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The value of the data entity either when the data is not received or the entity"
                      + " is incapable of providing data."),
              "UNAVAILABLE")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2198");
  }
}
