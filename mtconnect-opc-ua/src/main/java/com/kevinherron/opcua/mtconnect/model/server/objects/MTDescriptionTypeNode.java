package com.kevinherron.opcua.mtconnect.model.server.objects;

import java.util.Optional;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.objects.BaseObjectTypeNode;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNodeContext;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.structured.AccessRestrictionType;
import org.eclipse.milo.opcua.stack.core.types.structured.RolePermissionType;

public class MTDescriptionTypeNode extends BaseObjectTypeNode implements MTDescriptionType {
  public MTDescriptionTypeNode(
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

  public MTDescriptionTypeNode(
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
  public PropertyTypeNode getDataNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTDescriptionType.DATA);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getData() {
    return getProperty(MTDescriptionType.DATA).orElse(null);
  }

  @Override
  public void setData(String value) {
    setProperty(MTDescriptionType.DATA, value);
  }

  @Override
  public PropertyTypeNode getManufacturerNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTDescriptionType.MANUFACTURER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getManufacturer() {
    return getProperty(MTDescriptionType.MANUFACTURER).orElse(null);
  }

  @Override
  public void setManufacturer(String value) {
    setProperty(MTDescriptionType.MANUFACTURER, value);
  }

  @Override
  public PropertyTypeNode getSerialNumberNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTDescriptionType.SERIAL_NUMBER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getSerialNumber() {
    return getProperty(MTDescriptionType.SERIAL_NUMBER).orElse(null);
  }

  @Override
  public void setSerialNumber(String value) {
    setProperty(MTDescriptionType.SERIAL_NUMBER, value);
  }

  @Override
  public PropertyTypeNode getStationNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTDescriptionType.STATION);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getStation() {
    return getProperty(MTDescriptionType.STATION).orElse(null);
  }

  @Override
  public void setStation(String value) {
    setProperty(MTDescriptionType.STATION, value);
  }
}
