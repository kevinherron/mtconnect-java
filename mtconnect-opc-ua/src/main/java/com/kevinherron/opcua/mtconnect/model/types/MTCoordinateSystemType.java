package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum MTCoordinateSystemType implements UaEnumeratedType {
  /** An unchangeable coordinate system that has machine zero as its origin. */
  Machine(0),

  /**
   * The coordinate system that represents the working area for a particular workpiece whose origin
   * is shifted within the machine coordinate system. If the work coordinates are not currently
   * defined in the piece of equipment, the machine coordinates will be used.
   */
  Work(1);

  private final int value;

  MTCoordinateSystemType(int value) {
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

  public static @Nullable MTCoordinateSystemType from(int value) {
    return switch (value) {
      case 0 -> Machine;
      case 1 -> Work;
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
                  "", "An unchangeable coordinate system that has machine zero as its origin."),
              "MACHINE"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The coordinate system that represents the working area for a particular"
                      + " workpiece whose origin is shifted within the machine coordinate system."
                      + " If the work coordinates are not currently defined in the piece of"
                      + " equipment, the machine coordinates will be used."),
              "WORK")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2635");
  }
}
