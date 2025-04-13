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

public class MTCompositionTypeNode extends BaseObjectTypeNode implements MTCompositionType {
  public MTCompositionTypeNode(
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

  public MTCompositionTypeNode(
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
  public PropertyTypeNode getMtTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTCompositionType.MT_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtTypeName() {
    return getProperty(MTCompositionType.MT_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtTypeName(String value) {
    setProperty(MTCompositionType.MT_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTCompositionType.NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getName() {
    return getProperty(MTCompositionType.NAME).orElse(null);
  }

  @Override
  public void setName(String value) {
    setProperty(MTCompositionType.NAME, value);
  }

  @Override
  public PropertyTypeNode getUuidNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTCompositionType.UUID);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getUuid() {
    return getProperty(MTCompositionType.UUID).orElse(null);
  }

  @Override
  public void setUuid(String value) {
    setProperty(MTCompositionType.UUID, value);
  }

  @Override
  public PropertyTypeNode getXmlIdNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTCompositionType.XML_ID);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getXmlId() {
    return getProperty(MTCompositionType.XML_ID).orElse(null);
  }

  @Override
  public void setXmlId(String value) {
    setProperty(MTCompositionType.XML_ID, value);
  }
}
