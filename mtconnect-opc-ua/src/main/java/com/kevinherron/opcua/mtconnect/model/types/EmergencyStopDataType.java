package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum EmergencyStopDataType implements UaEnumeratedType {
  /**
   * The emergency stop circuit is complete and the piece of equipment, component, or composition
   * element is allowed to operate.
   */
  Armed(0),

  /** The operation of the piece of equipment, component, or composition element is inhibited. */
  Triggered(1);

  private final int value;

  EmergencyStopDataType(int value) {
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

  public static @Nullable EmergencyStopDataType from(int value) {
    return switch (value) {
      case 0 -> Armed;
      case 1 -> Triggered;
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
                  "The emergency stop circuit is complete and the piece of equipment, component, or"
                      + " composition element is allowed to operate."),
              "ARMED"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The operation of the piece of equipment, component, or composition element is"
                      + " inhibited."),
              "TRIGGERED")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("ns=1;i=2207");
  }
}
