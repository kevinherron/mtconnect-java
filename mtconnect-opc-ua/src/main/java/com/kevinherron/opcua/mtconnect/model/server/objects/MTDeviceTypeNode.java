package com.kevinherron.opcua.mtconnect.model.server.objects;

import java.util.Optional;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNodeContext;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.structured.AccessRestrictionType;
import org.eclipse.milo.opcua.stack.core.types.structured.RolePermissionType;

public class MTDeviceTypeNode extends MTComponentTypeNode implements MTDeviceType {
  public MTDeviceTypeNode(
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

  public MTDeviceTypeNode(
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
  public PropertyTypeNode getIso841ClassNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTDeviceType.ISO_841_CLASS);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getIso841Class() {
    return getProperty(MTDeviceType.ISO_841_CLASS).orElse(null);
  }

  @Override
  public void setIso841Class(String value) {
    setProperty(MTDeviceType.ISO_841_CLASS, value);
  }

  @Override
  public PropertyTypeNode getNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTDeviceType.NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getName() {
    return getProperty(MTDeviceType.NAME).orElse(null);
  }

  @Override
  public void setName(String value) {
    setProperty(MTDeviceType.NAME, value);
  }

  @Override
  public PropertyTypeNode getUuidNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTDeviceType.UUID);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getUuid() {
    return getProperty(MTDeviceType.UUID).orElse(null);
  }

  @Override
  public void setUuid(String value) {
    setProperty(MTDeviceType.UUID, value);
  }

  @Override
  public PropertyTypeNode getVersionNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTDeviceType.VERSION);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getVersion() {
    return getProperty(MTDeviceType.VERSION).orElse(null);
  }

  @Override
  public void setVersion(String value) {
    setProperty(MTDeviceType.VERSION, value);
  }
}
