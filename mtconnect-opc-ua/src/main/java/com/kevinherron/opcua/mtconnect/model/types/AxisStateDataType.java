package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum AxisStateDataType implements UaEnumeratedType {
  /** The component at its home position. */
  Home(0),

  /** The component has been moved to a fixed position. */
  Parked(1),

  /** The component is stopped. */
  Stopped(2),

  /** The component is in motion. */
  Travel(3);

  private final int value;

  AxisStateDataType(int value) {
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

  public static @Nullable AxisStateDataType from(int value) {
    return switch (value) {
      case 0 -> Home;
      case 1 -> Parked;
      case 2 -> Stopped;
      case 3 -> Travel;
      default -> null;
    };
  }

  public static EnumDefinition definition() {
    return new EnumDefinition(
        new EnumField[] {
          new EnumField(
              0L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The component at its home position."),
              "HOME"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The component has been moved to a fixed position."),
              "PARKED"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The component is stopped."),
              "STOPPED"),
          new EnumField(
              3L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The component is in motion."),
              "TRAVEL")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("ns=1;i=2200");
  }
}
