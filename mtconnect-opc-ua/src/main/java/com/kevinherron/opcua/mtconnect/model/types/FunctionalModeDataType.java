package com.kevinherron.opcua.mtconnect.model.types;

import org.eclipse.milo.opcua.stack.core.types.UaEnumeratedType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.EnumField;
import org.jspecify.annotations.Nullable;

public enum FunctionalModeDataType implements UaEnumeratedType {
  /** Action related to maintenance on the piece of equipment. */
  Maintenance(0),

  /** A structural element is currently producing product. */
  Production(1),

  /** A structural element is being used to prove-out a new process. */
  ProcessDevelopment(2),

  /** A structural element is being prepared or modified to begin production of product. */
  Setup(3),

  /**
   * Typically, a structural element has completed the production of a product and is being modified
   * or returned to a neutral state such that it may then be prepared to begin production of a
   * different product.
   */
  Teardown(4);

  private final int value;

  FunctionalModeDataType(int value) {
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

  public static @Nullable FunctionalModeDataType from(int value) {
    return switch (value) {
      case 0 -> Maintenance;
      case 1 -> Production;
      case 2 -> ProcessDevelopment;
      case 3 -> Setup;
      case 4 -> Teardown;
      default -> null;
    };
  }

  public static EnumDefinition definition() {
    return new EnumDefinition(
        new EnumField[] {
          new EnumField(
              0L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "Action related to maintenance on the piece of equipment."),
              "MAINTENANCE"),
          new EnumField(
              1L,
              LocalizedText.NULL_VALUE,
              new LocalizedText("", "A structural element is currently producing product."),
              "PRODUCTION"),
          new EnumField(
              2L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "", "A structural element is being used to prove-out a new process."),
              "PROCESS_DEVELOPMENT"),
          new EnumField(
              3L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "A structural element is being prepared or modified to begin production of"
                      + " product."),
              "SETUP"),
          new EnumField(
              4L,
              LocalizedText.NULL_VALUE,
              new LocalizedText(
                  "",
                  "Typically, a structural element has completed the production of a product and is"
                      + " being modified or returned to a neutral state such that it may then be"
                      + " prepared to begin production of a different product."),
              "TEARDOWN")
        });
  }

  public static final class TypeInfo {
    public static final ExpandedNodeId TYPE_ID =
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2208");
  }
}
