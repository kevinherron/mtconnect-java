package com.kevinherron.opcua.mtconnect.model.server.objects;

import com.kevinherron.opcua.mtconnect.model.types.MTCategoryType;
import com.kevinherron.opcua.mtconnect.model.types.MTRepresentationType;
import java.util.Optional;
import org.eclipse.milo.opcua.sdk.core.nodes.ObjectNode;
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

public class MTConditionTypeNode extends BaseObjectTypeNode implements MTConditionType {
  public MTConditionTypeNode(
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

  public MTConditionTypeNode(
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
  public PropertyTypeNode getCategoryNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionType.CATEGORY);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTCategoryType getCategory() {
    return getProperty(MTConditionType.CATEGORY).orElse(null);
  }

  @Override
  public void setCategory(MTCategoryType value) {
    setProperty(MTConditionType.CATEGORY, value);
  }

  @Override
  public PropertyTypeNode getMtSubTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionType.MT_SUB_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtSubTypeName() {
    return getProperty(MTConditionType.MT_SUB_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtSubTypeName(String value) {
    setProperty(MTConditionType.MT_SUB_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getMtTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionType.MT_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtTypeName() {
    return getProperty(MTConditionType.MT_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtTypeName(String value) {
    setProperty(MTConditionType.MT_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionType.NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getName() {
    return getProperty(MTConditionType.NAME).orElse(null);
  }

  @Override
  public void setName(String value) {
    setProperty(MTConditionType.NAME, value);
  }

  @Override
  public PropertyTypeNode getPeriodFilterNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionType.PERIOD_FILTER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getPeriodFilter() {
    return getProperty(MTConditionType.PERIOD_FILTER).orElse(null);
  }

  @Override
  public void setPeriodFilter(Float value) {
    setProperty(MTConditionType.PERIOD_FILTER, value);
  }

  @Override
  public PropertyTypeNode getRepresentationNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionType.REPRESENTATION);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTRepresentationType getRepresentation() {
    return getProperty(MTConditionType.REPRESENTATION).orElse(null);
  }

  @Override
  public void setRepresentation(MTRepresentationType value) {
    setProperty(MTConditionType.REPRESENTATION, value);
  }

  @Override
  public PropertyTypeNode getSampleRateNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionType.SAMPLE_RATE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Double getSampleRate() {
    return getProperty(MTConditionType.SAMPLE_RATE).orElse(null);
  }

  @Override
  public void setSampleRate(Double value) {
    setProperty(MTConditionType.SAMPLE_RATE, value);
  }

  @Override
  public PropertyTypeNode getSourceDataNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionType.SOURCE_DATA);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getSourceData() {
    return getProperty(MTConditionType.SOURCE_DATA).orElse(null);
  }

  @Override
  public void setSourceData(String value) {
    setProperty(MTConditionType.SOURCE_DATA, value);
  }

  @Override
  public PropertyTypeNode getXmlIdNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConditionType.XML_ID);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getXmlId() {
    return getProperty(MTConditionType.XML_ID).orElse(null);
  }

  @Override
  public void setXmlId(String value) {
    setProperty(MTConditionType.XML_ID, value);
  }

  @Override
  public MTConstraintTypeNode getConstraintsNode() {
    Optional<ObjectNode> component =
        getObjectComponent("http://opcfoundation.org/UA/MTConnect/v2/", "Constraints");
    return (MTConstraintTypeNode) component.orElse(null);
  }
}
