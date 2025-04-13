package com.kevinherron.opcua.mtconnect.model.server.variables;

import com.kevinherron.opcua.mtconnect.model.types.MTCategoryType;
import com.kevinherron.opcua.mtconnect.model.types.MTRepresentationType;
import java.util.Optional;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.variables.BaseDataVariableTypeNode;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNodeContext;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.structured.AccessLevelExType;
import org.eclipse.milo.opcua.stack.core.types.structured.AccessRestrictionType;
import org.eclipse.milo.opcua.stack.core.types.structured.RolePermissionType;

public class MTAssetEventTypeNode extends BaseDataVariableTypeNode implements MTAssetEventType {
  public MTAssetEventTypeNode(
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
      DataValue value,
      NodeId dataType,
      Integer valueRank,
      UInteger[] arrayDimensions,
      UByte accessLevel,
      UByte userAccessLevel,
      Double minimumSamplingInterval,
      boolean historizing,
      AccessLevelExType accessLevelEx) {
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
        value,
        dataType,
        valueRank,
        arrayDimensions,
        accessLevel,
        userAccessLevel,
        minimumSamplingInterval,
        historizing,
        accessLevelEx);
  }

  public MTAssetEventTypeNode(
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
      DataValue value,
      NodeId dataType,
      Integer valueRank,
      UInteger[] arrayDimensions) {
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
        value,
        dataType,
        valueRank,
        arrayDimensions);
  }

  @Override
  public PropertyTypeNode getCategoryNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTAssetEventType.CATEGORY);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTCategoryType getCategory() {
    return getProperty(MTAssetEventType.CATEGORY).orElse(null);
  }

  @Override
  public void setCategory(MTCategoryType value) {
    setProperty(MTAssetEventType.CATEGORY, value);
  }

  @Override
  public PropertyTypeNode getMtSubTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTAssetEventType.MT_SUB_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtSubTypeName() {
    return getProperty(MTAssetEventType.MT_SUB_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtSubTypeName(String value) {
    setProperty(MTAssetEventType.MT_SUB_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getMtTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTAssetEventType.MT_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtTypeName() {
    return getProperty(MTAssetEventType.MT_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtTypeName(String value) {
    setProperty(MTAssetEventType.MT_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTAssetEventType.NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getName() {
    return getProperty(MTAssetEventType.NAME).orElse(null);
  }

  @Override
  public void setName(String value) {
    setProperty(MTAssetEventType.NAME, value);
  }

  @Override
  public PropertyTypeNode getPeriodFilterNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTAssetEventType.PERIOD_FILTER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getPeriodFilter() {
    return getProperty(MTAssetEventType.PERIOD_FILTER).orElse(null);
  }

  @Override
  public void setPeriodFilter(Float value) {
    setProperty(MTAssetEventType.PERIOD_FILTER, value);
  }

  @Override
  public PropertyTypeNode getRepresentationNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTAssetEventType.REPRESENTATION);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTRepresentationType getRepresentation() {
    return getProperty(MTAssetEventType.REPRESENTATION).orElse(null);
  }

  @Override
  public void setRepresentation(MTRepresentationType value) {
    setProperty(MTAssetEventType.REPRESENTATION, value);
  }

  @Override
  public PropertyTypeNode getSampleRateNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTAssetEventType.SAMPLE_RATE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Double getSampleRate() {
    return getProperty(MTAssetEventType.SAMPLE_RATE).orElse(null);
  }

  @Override
  public void setSampleRate(Double value) {
    setProperty(MTAssetEventType.SAMPLE_RATE, value);
  }

  @Override
  public PropertyTypeNode getSourceDataNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTAssetEventType.SOURCE_DATA);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getSourceData() {
    return getProperty(MTAssetEventType.SOURCE_DATA).orElse(null);
  }

  @Override
  public void setSourceData(String value) {
    setProperty(MTAssetEventType.SOURCE_DATA, value);
  }

  @Override
  public PropertyTypeNode getXmlIdNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTAssetEventType.XML_ID);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getXmlId() {
    return getProperty(MTAssetEventType.XML_ID).orElse(null);
  }

  @Override
  public void setXmlId(String value) {
    setProperty(MTAssetEventType.XML_ID, value);
  }
}
