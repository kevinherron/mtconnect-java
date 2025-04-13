package com.kevinherron.opcua.mtconnect.model.server.objects;

import com.kevinherron.opcua.mtconnect.model.types.MTSeverityDataType;
import com.kevinherron.opcua.mtconnect.model.types.QualifierDataType;
import java.util.Optional;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.objects.ConditionTypeNode;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNodeContext;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.structured.AccessRestrictionType;
import org.eclipse.milo.opcua.stack.core.types.structured.RolePermissionType;

public class MTConditionEventTypeNode extends ConditionTypeNode implements MTConditionEventType {
  public MTConditionEventTypeNode(
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

  public MTConditionEventTypeNode(
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
  public PropertyTypeNode getActiveStateNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionEventType.ACTIVE_STATE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public LocalizedText getActiveState() {
    return getProperty(MTConditionEventType.ACTIVE_STATE).orElse(null);
  }

  @Override
  public void setActiveState(LocalizedText value) {
    setProperty(MTConditionEventType.ACTIVE_STATE, value);
  }

  @Override
  public PropertyTypeNode getDataItemIdNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionEventType.DATA_ITEM_ID);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getDataItemId() {
    return getProperty(MTConditionEventType.DATA_ITEM_ID).orElse(null);
  }

  @Override
  public void setDataItemId(String value) {
    setProperty(MTConditionEventType.DATA_ITEM_ID, value);
  }

  @Override
  public PropertyTypeNode getMtSeverityNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionEventType.MT_SEVERITY);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTSeverityDataType getMtSeverity() {
    return getProperty(MTConditionEventType.MT_SEVERITY).orElse(null);
  }

  @Override
  public void setMtSeverity(MTSeverityDataType value) {
    setProperty(MTConditionEventType.MT_SEVERITY, value);
  }

  @Override
  public PropertyTypeNode getMtSubTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionEventType.MT_SUB_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtSubTypeName() {
    return getProperty(MTConditionEventType.MT_SUB_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtSubTypeName(String value) {
    setProperty(MTConditionEventType.MT_SUB_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getMtTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionEventType.MT_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtTypeName() {
    return getProperty(MTConditionEventType.MT_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtTypeName(String value) {
    setProperty(MTConditionEventType.MT_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getNativeCodeNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionEventType.NATIVE_CODE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getNativeCode() {
    return getProperty(MTConditionEventType.NATIVE_CODE).orElse(null);
  }

  @Override
  public void setNativeCode(String value) {
    setProperty(MTConditionEventType.NATIVE_CODE, value);
  }

  @Override
  public PropertyTypeNode getNativeSeverityNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionEventType.NATIVE_SEVERITY);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getNativeSeverity() {
    return getProperty(MTConditionEventType.NATIVE_SEVERITY).orElse(null);
  }

  @Override
  public void setNativeSeverity(String value) {
    setProperty(MTConditionEventType.NATIVE_SEVERITY, value);
  }

  @Override
  public PropertyTypeNode getQualifierNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionEventType.QUALIFIER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public QualifierDataType getQualifier() {
    return getProperty(MTConditionEventType.QUALIFIER).orElse(null);
  }

  @Override
  public void setQualifier(QualifierDataType value) {
    setProperty(MTConditionEventType.QUALIFIER, value);
  }
}
