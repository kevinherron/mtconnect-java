package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum ExecutionDataType implements UaEnumeratedType {
  /** The value of the data entity that is engaging. */
  Active(0),

  /** Motion of a component has been commanded to stop at its current position. */
  FeedHold(1),

  /** The action of a component has been suspended due to an external signal. */
  Interrupted(2),

  /** The controllers program has been intentionally stopped */
  OptionalStop(3),

  /** A component is ready to engage. */
  Ready(4),

  /**
   * The execution of the controllers program has been stopped by a command from within the program.
   */
  ProgramCompleted(5),

  /**
   * The execution of the controller's program has been stopped by a command from within the
   * program.
   */
  ProgramStopped(6),

  /** The component is stopped. */
  Stopped(7);

  private final int value;

  ExecutionDataType(int value) {
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

  public static @Nullable ExecutionDataType from(int value) {
    return switch (value) {
      case 0 -> Active;
      case 1 -> FeedHold;
      case 2 -> Interrupted;
      case 3 -> OptionalStop;
      case 4 -> Ready;
      case 5 -> ProgramCompleted;
      case 6 -> ProgramStopped;
      case 7 -> Stopped;
      default -> null;
    };
  }

  public static EnumDefinition definition() {
    return new EnumDefinition(
        new EnumField[] {
          new EnumField(
              0L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The value of the data entity that is engaging."),
              "ACTIVE"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "", "Motion of a component has been commanded to stop at its current position."),
              "FEED_HOLD"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "", "The action of a component has been suspended due to an external signal."),
              "INTERRUPTED"),
          new EnumField(
              3L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The controllers program has been intentionally stopped"),
              "OPTIONAL_STOP"),
          new EnumField(
              4L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "A component is ready to engage."),
              "READY"),
          new EnumField(
              5L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The execution of the controllers program has been stopped by a command from"
                      + " within the program."),
              "PROGRAM_COMPLETED"),
          new EnumField(
              6L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "The execution of the controller's program has been stopped by a command from"
                      + " within the program."),
              "PROGRAM_STOPPED"),
          new EnumField(
              7L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "The component is stopped."),
              "STOPPED")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID = ExpandedNodeId.parse("ns=1;i=2262");
  }
}
