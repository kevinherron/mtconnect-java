package com.kevinherron.opcua.mtconnect.model.server.objects;

import java.util.Optional;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.objects.BaseObjectTypeNode;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNodeContext;
import org.eclipse.milo.opcua.stack.core.types.builtin.DateTime;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.structured.AccessRestrictionType;
import org.eclipse.milo.opcua.stack.core.types.structured.RolePermissionType;

public class MTChannelTypeNode extends BaseObjectTypeNode implements MTChannelType {
  public MTChannelTypeNode(
      UaNodeContext context,
      NodeId nodeId,
      QualifiedName browseName,
      LocalizedText displayName,
      LocalizedText description,
      UInteger writeMask,
      UInteger userWriteMask,
      RolePermissionType[] rolePermissions,
      RolePermissionType[] userRolePermissions,
      AccessRestrictionType accessRestrictions,
      UByte eventNotifier) {
    super(
        context,
        nodeId,
        browseName,
        displayName,
        description,
        writeMask,
        userWriteMask,
        rolePermissions,
        userRolePermissions,
        accessRestrictions,
        eventNotifier);
  }

  public MTChannelTypeNode(
      UaNodeContext context,
      NodeId nodeId,
      QualifiedName browseName,
      LocalizedText displayName,
      LocalizedText description,
      UInteger writeMask,
      UInteger userWriteMask,
      RolePermissionType[] rolePermissions,
      RolePermissionType[] userRolePermissions,
      AccessRestrictionType accessRestrictions) {
    super(
        context,
        nodeId,
        browseName,
        displayName,
        description,
        writeMask,
        userWriteMask,
        rolePermissions,
        userRolePermissions,
        accessRestrictions);
  }

  @Override
  public PropertyTypeNode getCalibrationDateNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTChannelType.CALIBRATION_DATE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public DateTime getCalibrationDate() {
    return getProperty(MTChannelType.CALIBRATION_DATE).orElse(null);
  }

  @Override
  public void setCalibrationDate(DateTime value) {
    setProperty(MTChannelType.CALIBRATION_DATE, value);
  }

  @Override
  public PropertyTypeNode getCalibrationInitialsNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTChannelType.CALIBRATION_INITIALS);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getCalibrationInitials() {
    return getProperty(MTChannelType.CALIBRATION_INITIALS).orElse(null);
  }

  @Override
  public void setCalibrationInitials(String value) {
    setProperty(MTChannelType.CALIBRATION_INITIALS, value);
  }

  @Override
  public PropertyTypeNode getMtDescriptionNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTChannelType.MT_DESCRIPTION);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtDescription() {
    return getProperty(MTChannelType.MT_DESCRIPTION).orElse(null);
  }

  @Override
  public void setMtDescription(String value) {
    setProperty(MTChannelType.MT_DESCRIPTION, value);
  }

  @Override
  public PropertyTypeNode getNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTChannelType.NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getName() {
    return getProperty(MTChannelType.NAME).orElse(null);
  }

  @Override
  public void setName(String value) {
    setProperty(MTChannelType.NAME, value);
  }

  @Override
  public PropertyTypeNode getNextCalibrationDateNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTChannelType.NEXT_CALIBRATION_DATE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public DateTime getNextCalibrationDate() {
    return getProperty(MTChannelType.NEXT_CALIBRATION_DATE).orElse(null);
  }

  @Override
  public void setNextCalibrationDate(DateTime value) {
    setProperty(MTChannelType.NEXT_CALIBRATION_DATE, value);
  }

  @Override
  public PropertyTypeNode getNumberNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTChannelType.NUMBER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Integer getNumber() {
    return getProperty(MTChannelType.NUMBER).orElse(null);
  }

  @Override
  public void setNumber(Integer value) {
    setProperty(MTChannelType.NUMBER, value);
  }
}
