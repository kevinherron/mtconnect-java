package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum ControllerModeDataType implements UaEnumeratedType {
  /** The controller is configured to automatically execute a program. */
  Automatic(0),

  /**
   * The controller is currently functioning as a programming device and is not capable of executing
   * an active program.
   */
  Edit(1),

  /** Operations based on the instructions received from an external source. */
  Manual(2),

  /** The operator can enter a series of operations for the controller to perform. */
  ManualDataInput(3),

  /**
   * The controller executes a single set of instructions from an active program and then stops
   * until given a command to execute the next set of instructions.
   */
  SemiAutomatic(4);

  private final int value;

  ControllerModeDataType(int value) {
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

  public static @Nullable ControllerModeDataType from(int value) {
    return switch (value) {
      case 0 -> Automatic;
      case 1 -> Edit;
      case 2 -> Manual;
      case 3 -> ManualDataInput;
      case 4 -> SemiAutomatic;
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
                  "", "The controller is configured to automatically execute a program."),
              "AUTOMATIC"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The controller is currently functioning as a programming device and is not"
                      + " capable of executing an active program."),
              "EDIT"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "", "Operations based on the instructions received from an external source."),
              "MANUAL"),
          new EnumField(
              3L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The operator can enter a series of operations for the controller to perform."),
              "MANUAL_DATA_INPUT"),
          new EnumField(
              4L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The controller executes a single set of instructions from an active program and"
                      + " then stops until given a command to execute the next set of"
                      + " instructions."),
              "SEMI_AUTOMATIC")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("ns=1;i=2203");
  }
}
