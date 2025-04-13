package com.kevinherron.opcua.mtconnect.model.server.objects;

import java.util.Optional;
import org.eclipse.milo.opcua.sdk.core.Reference;
import org.eclipse.milo.opcua.sdk.core.nodes.ObjectNode;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.objects.BaseObjectTypeNode;
import org.eclipse.milo.opcua.sdk.server.model.objects.FolderTypeNode;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNodeContext;
import org.eclipse.milo.opcua.sdk.server.nodes.UaObjectNode;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.structured.AccessRestrictionType;
import org.eclipse.milo.opcua.stack.core.types.structured.RolePermissionType;

public class MTComponentTypeNode extends BaseObjectTypeNode implements MTComponentType {
  public MTComponentTypeNode(
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

  public MTComponentTypeNode(
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
  public PropertyTypeNode getNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTComponentType.NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getName() {
    return getProperty(MTComponentType.NAME).orElse(null);
  }

  @Override
  public void setName(String value) {
    setProperty(MTComponentType.NAME, value);
  }

  @Override
  public PropertyTypeNode getNativeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTComponentType.NATIVE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getNativeName() {
    return getProperty(MTComponentType.NATIVE_NAME).orElse(null);
  }

  @Override
  public void setNativeName(String value) {
    setProperty(MTComponentType.NATIVE_NAME, value);
  }

  @Override
  public PropertyTypeNode getSampleIntervalNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTComponentType.SAMPLE_INTERVAL);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getSampleInterval() {
    return getProperty(MTComponentType.SAMPLE_INTERVAL).orElse(null);
  }

  @Override
  public void setSampleInterval(Float value) {
    setProperty(MTComponentType.SAMPLE_INTERVAL, value);
  }

  @Override
  public PropertyTypeNode getSampleRateNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTComponentType.SAMPLE_RATE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getSampleRate() {
    return getProperty(MTComponentType.SAMPLE_RATE).orElse(null);
  }

  @Override
  public void setSampleRate(Float value) {
    setProperty(MTComponentType.SAMPLE_RATE, value);
  }

  @Override
  public PropertyTypeNode getUuidNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTComponentType.UUID);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getUuid() {
    return getProperty(MTComponentType.UUID).orElse(null);
  }

  @Override
  public void setUuid(String value) {
    setProperty(MTComponentType.UUID, value);
  }

  @Override
  public PropertyTypeNode getXmlIdNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTComponentType.XML_ID);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getXmlId() {
    return getProperty(MTComponentType.XML_ID).orElse(null);
  }

  @Override
  public void setXmlId(String value) {
    setProperty(MTComponentType.XML_ID, value);
  }

  @Override
  public MTDescriptionTypeNode getDescriptionNode() {
    Optional<ObjectNode> component =
        getObjectComponent("http://opcfoundation.org/UA/MTConnect/v2/", "Description");
    return (MTDescriptionTypeNode) component.orElse(null);
  }

  @Override
  public MTConfigurationTypeNode getConfigurationNode() {
    Optional<ObjectNode> component =
        getObjectComponent("http://opcfoundation.org/UA/MTConnect/v2/", "Configuration");
    return (MTConfigurationTypeNode) component.orElse(null);
  }

  @Override
  public FolderTypeNode getCompositionsNode() {
    Optional<UaNode> node =
        findNode(
            "http://opcfoundation.org/UA/MTConnect/v2/",
            "Compositions",
            n -> n instanceof UaObjectNode,
            Reference.ORGANIZES_PREDICATE);
    return (FolderTypeNode) node.orElse(null);
  }

  @Override
  public FolderTypeNode getComponentsNode() {
    Optional<UaNode> node =
        findNode(
            "http://opcfoundation.org/UA/MTConnect/v2/",
            "Components",
            n -> n instanceof UaObjectNode,
            Reference.ORGANIZES_PREDICATE);
    return (FolderTypeNode) node.orElse(null);
  }
}
