package com.kevinherron.opcua.mtconnect.model.server.variables;

import com.kevinherron.opcua.mtconnect.model.types.MTCategoryType;
import com.kevinherron.opcua.mtconnect.model.types.MTCoordinateSystemType;
import com.kevinherron.opcua.mtconnect.model.types.MTRepresentationType;
import com.kevinherron.opcua.mtconnect.model.types.MTResetTriggerType;
import com.kevinherron.opcua.mtconnect.model.types.MTStatisticType;
import java.util.Optional;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.variables.DataItemTypeNode;
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

public class MTNumericEventTypeNode extends DataItemTypeNode implements MTNumericEventType {
  public MTNumericEventTypeNode(
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

  public MTNumericEventTypeNode(
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
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.CATEGORY);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTCategoryType getCategory() {
    return getProperty(MTNumericEventType.CATEGORY).orElse(null);
  }

  @Override
  public void setCategory(MTCategoryType value) {
    setProperty(MTNumericEventType.CATEGORY, value);
  }

  @Override
  public PropertyTypeNode getMtSubTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.MT_SUB_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtSubTypeName() {
    return getProperty(MTNumericEventType.MT_SUB_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtSubTypeName(String value) {
    setProperty(MTNumericEventType.MT_SUB_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getMtTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.MT_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtTypeName() {
    return getProperty(MTNumericEventType.MT_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtTypeName(String value) {
    setProperty(MTNumericEventType.MT_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getName() {
    return getProperty(MTNumericEventType.NAME).orElse(null);
  }

  @Override
  public void setName(String value) {
    setProperty(MTNumericEventType.NAME, value);
  }

  @Override
  public PropertyTypeNode getPeriodFilterNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.PERIOD_FILTER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getPeriodFilter() {
    return getProperty(MTNumericEventType.PERIOD_FILTER).orElse(null);
  }

  @Override
  public void setPeriodFilter(Float value) {
    setProperty(MTNumericEventType.PERIOD_FILTER, value);
  }

  @Override
  public PropertyTypeNode getRepresentationNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.REPRESENTATION);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTRepresentationType getRepresentation() {
    return getProperty(MTNumericEventType.REPRESENTATION).orElse(null);
  }

  @Override
  public void setRepresentation(MTRepresentationType value) {
    setProperty(MTNumericEventType.REPRESENTATION, value);
  }

  @Override
  public PropertyTypeNode getSampleRateNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.SAMPLE_RATE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Double getSampleRate() {
    return getProperty(MTNumericEventType.SAMPLE_RATE).orElse(null);
  }

  @Override
  public void setSampleRate(Double value) {
    setProperty(MTNumericEventType.SAMPLE_RATE, value);
  }

  @Override
  public PropertyTypeNode getSourceDataNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.SOURCE_DATA);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getSourceData() {
    return getProperty(MTNumericEventType.SOURCE_DATA).orElse(null);
  }

  @Override
  public void setSourceData(String value) {
    setProperty(MTNumericEventType.SOURCE_DATA, value);
  }

  @Override
  public PropertyTypeNode getXmlIdNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.XML_ID);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getXmlId() {
    return getProperty(MTNumericEventType.XML_ID).orElse(null);
  }

  @Override
  public void setXmlId(String value) {
    setProperty(MTNumericEventType.XML_ID, value);
  }

  @Override
  public PropertyTypeNode getCoordinateSystemNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.COORDINATE_SYSTEM);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTCoordinateSystemType getCoordinateSystem() {
    return getProperty(MTNumericEventType.COORDINATE_SYSTEM).orElse(null);
  }

  @Override
  public void setCoordinateSystem(MTCoordinateSystemType value) {
    setProperty(MTNumericEventType.COORDINATE_SYSTEM, value);
  }

  @Override
  public PropertyTypeNode getDurationNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.DURATION);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Double getDuration() {
    return getProperty(MTNumericEventType.DURATION).orElse(null);
  }

  @Override
  public void setDuration(Double value) {
    setProperty(MTNumericEventType.DURATION, value);
  }

  @Override
  public PropertyTypeNode getInitialValueNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.INITIAL_VALUE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Double getInitialValue() {
    return getProperty(MTNumericEventType.INITIAL_VALUE).orElse(null);
  }

  @Override
  public void setInitialValue(Double value) {
    setProperty(MTNumericEventType.INITIAL_VALUE, value);
  }

  @Override
  public PropertyTypeNode getMinimumDeltaFilterNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.MINIMUM_DELTA_FILTER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getMinimumDeltaFilter() {
    return getProperty(MTNumericEventType.MINIMUM_DELTA_FILTER).orElse(null);
  }

  @Override
  public void setMinimumDeltaFilter(Float value) {
    setProperty(MTNumericEventType.MINIMUM_DELTA_FILTER, value);
  }

  @Override
  public PropertyTypeNode getNativeUnitsNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.NATIVE_UNITS);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getNativeUnits() {
    return getProperty(MTNumericEventType.NATIVE_UNITS).orElse(null);
  }

  @Override
  public void setNativeUnits(String value) {
    setProperty(MTNumericEventType.NATIVE_UNITS, value);
  }

  @Override
  public PropertyTypeNode getResetTriggerNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.RESET_TRIGGER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTResetTriggerType getResetTrigger() {
    return getProperty(MTNumericEventType.RESET_TRIGGER).orElse(null);
  }

  @Override
  public void setResetTrigger(MTResetTriggerType value) {
    setProperty(MTNumericEventType.RESET_TRIGGER, value);
  }

  @Override
  public PropertyTypeNode getResetTriggeredReasonNode() {
    Optional<VariableNode> propertyNode =
        getPropertyNode(MTNumericEventType.RESET_TRIGGERED_REASON);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTResetTriggerType getResetTriggeredReason() {
    return getProperty(MTNumericEventType.RESET_TRIGGERED_REASON).orElse(null);
  }

  @Override
  public void setResetTriggeredReason(MTResetTriggerType value) {
    setProperty(MTNumericEventType.RESET_TRIGGERED_REASON, value);
  }

  @Override
  public PropertyTypeNode getSignificantDigitsNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.SIGNIFICANT_DIGITS);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Short getSignificantDigits() {
    return getProperty(MTNumericEventType.SIGNIFICANT_DIGITS).orElse(null);
  }

  @Override
  public void setSignificantDigits(Short value) {
    setProperty(MTNumericEventType.SIGNIFICANT_DIGITS, value);
  }

  @Override
  public PropertyTypeNode getStatisticNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.STATISTIC);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTStatisticType getStatistic() {
    return getProperty(MTNumericEventType.STATISTIC).orElse(null);
  }

  @Override
  public void setStatistic(MTStatisticType value) {
    setProperty(MTNumericEventType.STATISTIC, value);
  }

  @Override
  public PropertyTypeNode getUnitsNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTNumericEventType.UNITS);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getUnits() {
    return getProperty(MTNumericEventType.UNITS).orElse(null);
  }

  @Override
  public void setUnits(String value) {
    setProperty(MTNumericEventType.UNITS, value);
  }
}
