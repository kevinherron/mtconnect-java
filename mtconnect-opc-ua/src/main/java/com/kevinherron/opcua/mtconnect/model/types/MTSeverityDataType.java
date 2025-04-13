package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum MTSeverityDataType implements UaEnumeratedType {
  /** Fault value for a condition element. */
  Fault(0),

  /** Normal value for a condition element. */
  Normal(1),

  /** Warning value for a condition element. */
  Warning(2);

  private final int value;

  MTSeverityDataType(int value) {
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

  public static @Nullable MTSeverityDataType from(int value) {
    return switch (value) {
      case 0 -> Fault;
      case 1 -> Normal;
      case 2 -> Warning;
      default -> null;
    };
  }

  public static EnumDefinition definition() {
    return new EnumDefinition(
        new EnumField[] {
          new EnumField(
              0L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "Fault value for a condition element."),
              "FAULT"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "Normal value for a condition element."),
              "NORMAL"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "Warning value for a condition element."),
              "WARNING")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2669");
  }
}
