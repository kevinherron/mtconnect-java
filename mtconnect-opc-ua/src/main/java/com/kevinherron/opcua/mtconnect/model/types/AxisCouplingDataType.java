package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum AxisCouplingDataType implements UaEnumeratedType {
  /**
   * It provides information or state values that influences the operation of other dataitem of
   * similar type.
   */
  Master(0),

  /** The axis is a slave to the coupledaxes event */
  Slave(1),

  /**
   * Physical or logical parts which are not physically connected to each other but are operating
   * together.
   */
  Synchronous(2),

  /** Elements are physically connected to each other and operate as a single unit. */
  Tandem(3);

  private final int value;

  AxisCouplingDataType(int value) {
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

  public static @Nullable AxisCouplingDataType from(int value) {
    return switch (value) {
      case 0 -> Master;
      case 1 -> Slave;
      case 2 -> Synchronous;
      case 3 -> Tandem;
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
                  "It provides information or state values that influences the operation of other"
                      + " dataitem of similar type."),
              "MASTER"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The axis is a slave to the coupledaxes event"),
              "SLAVE"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "Physical or logical parts which are not physically connected to each other but"
                      + " are operating together."),
              "SYNCHRONOUS"),
          new EnumField(
              3L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "Elements are physically connected to each other and operate as a single unit."),
              "TANDEM")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2199");
  }
}
