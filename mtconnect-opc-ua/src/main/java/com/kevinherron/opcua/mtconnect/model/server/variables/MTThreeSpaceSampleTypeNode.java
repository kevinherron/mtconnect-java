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
import org.eclipse.milo.opcua.stack.core.types.structured.EUInformation;
import org.eclipse.milo.opcua.stack.core.types.structured.RolePermissionType;

public class MTThreeSpaceSampleTypeNode extends DataItemTypeNode implements MTThreeSpaceSampleType {
  public MTThreeSpaceSampleTypeNode(
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

  public MTThreeSpaceSampleTypeNode(
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
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.CATEGORY);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTCategoryType getCategory() {
    return getProperty(MTThreeSpaceSampleType.CATEGORY).orElse(null);
  }

  @Override
  public void setCategory(MTCategoryType value) {
    setProperty(MTThreeSpaceSampleType.CATEGORY, value);
  }

  @Override
  public PropertyTypeNode getMtSubTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.MT_SUB_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtSubTypeName() {
    return getProperty(MTThreeSpaceSampleType.MT_SUB_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtSubTypeName(String value) {
    setProperty(MTThreeSpaceSampleType.MT_SUB_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getMtTypeNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.MT_TYPE_NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getMtTypeName() {
    return getProperty(MTThreeSpaceSampleType.MT_TYPE_NAME).orElse(null);
  }

  @Override
  public void setMtTypeName(String value) {
    setProperty(MTThreeSpaceSampleType.MT_TYPE_NAME, value);
  }

  @Override
  public PropertyTypeNode getNameNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.NAME);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getName() {
    return getProperty(MTThreeSpaceSampleType.NAME).orElse(null);
  }

  @Override
  public void setName(String value) {
    setProperty(MTThreeSpaceSampleType.NAME, value);
  }

  @Override
  public PropertyTypeNode getPeriodFilterNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.PERIOD_FILTER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getPeriodFilter() {
    return getProperty(MTThreeSpaceSampleType.PERIOD_FILTER).orElse(null);
  }

  @Override
  public void setPeriodFilter(Float value) {
    setProperty(MTThreeSpaceSampleType.PERIOD_FILTER, value);
  }

  @Override
  public PropertyTypeNode getRepresentationNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.REPRESENTATION);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTRepresentationType getRepresentation() {
    return getProperty(MTThreeSpaceSampleType.REPRESENTATION).orElse(null);
  }

  @Override
  public void setRepresentation(MTRepresentationType value) {
    setProperty(MTThreeSpaceSampleType.REPRESENTATION, value);
  }

  @Override
  public PropertyTypeNode getSampleRateNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.SAMPLE_RATE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Double getSampleRate() {
    return getProperty(MTThreeSpaceSampleType.SAMPLE_RATE).orElse(null);
  }

  @Override
  public void setSampleRate(Double value) {
    setProperty(MTThreeSpaceSampleType.SAMPLE_RATE, value);
  }

  @Override
  public PropertyTypeNode getSourceDataNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.SOURCE_DATA);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getSourceData() {
    return getProperty(MTThreeSpaceSampleType.SOURCE_DATA).orElse(null);
  }

  @Override
  public void setSourceData(String value) {
    setProperty(MTThreeSpaceSampleType.SOURCE_DATA, value);
  }

  @Override
  public PropertyTypeNode getXmlIdNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.XML_ID);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getXmlId() {
    return getProperty(MTThreeSpaceSampleType.XML_ID).orElse(null);
  }

  @Override
  public void setXmlId(String value) {
    setProperty(MTThreeSpaceSampleType.XML_ID, value);
  }

  @Override
  public PropertyTypeNode getCoordinateSystemNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.COORDINATE_SYSTEM);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTCoordinateSystemType getCoordinateSystem() {
    return getProperty(MTThreeSpaceSampleType.COORDINATE_SYSTEM).orElse(null);
  }

  @Override
  public void setCoordinateSystem(MTCoordinateSystemType value) {
    setProperty(MTThreeSpaceSampleType.COORDINATE_SYSTEM, value);
  }

  @Override
  public PropertyTypeNode getDurationNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.DURATION);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Double getDuration() {
    return getProperty(MTThreeSpaceSampleType.DURATION).orElse(null);
  }

  @Override
  public void setDuration(Double value) {
    setProperty(MTThreeSpaceSampleType.DURATION, value);
  }

  @Override
  public PropertyTypeNode getInitialValueNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.INITIAL_VALUE);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Double getInitialValue() {
    return getProperty(MTThreeSpaceSampleType.INITIAL_VALUE).orElse(null);
  }

  @Override
  public void setInitialValue(Double value) {
    setProperty(MTThreeSpaceSampleType.INITIAL_VALUE, value);
  }

  @Override
  public PropertyTypeNode getMinimumDeltaFilterNode() {
    Optional<VariableNode> propertyNode =
        getPropertyNode(MTThreeSpaceSampleType.MINIMUM_DELTA_FILTER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getMinimumDeltaFilter() {
    return getProperty(MTThreeSpaceSampleType.MINIMUM_DELTA_FILTER).orElse(null);
  }

  @Override
  public void setMinimumDeltaFilter(Float value) {
    setProperty(MTThreeSpaceSampleType.MINIMUM_DELTA_FILTER, value);
  }

  @Override
  public PropertyTypeNode getNativeUnitsNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.NATIVE_UNITS);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getNativeUnits() {
    return getProperty(MTThreeSpaceSampleType.NATIVE_UNITS).orElse(null);
  }

  @Override
  public void setNativeUnits(String value) {
    setProperty(MTThreeSpaceSampleType.NATIVE_UNITS, value);
  }

  @Override
  public PropertyTypeNode getResetTriggerNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.RESET_TRIGGER);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTResetTriggerType getResetTrigger() {
    return getProperty(MTThreeSpaceSampleType.RESET_TRIGGER).orElse(null);
  }

  @Override
  public void setResetTrigger(MTResetTriggerType value) {
    setProperty(MTThreeSpaceSampleType.RESET_TRIGGER, value);
  }

  @Override
  public PropertyTypeNode getResetTriggeredReasonNode() {
    Optional<VariableNode> propertyNode =
        getPropertyNode(MTThreeSpaceSampleType.RESET_TRIGGERED_REASON);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTResetTriggerType getResetTriggeredReason() {
    return getProperty(MTThreeSpaceSampleType.RESET_TRIGGERED_REASON).orElse(null);
  }

  @Override
  public void setResetTriggeredReason(MTResetTriggerType value) {
    setProperty(MTThreeSpaceSampleType.RESET_TRIGGERED_REASON, value);
  }

  @Override
  public PropertyTypeNode getSignificantDigitsNode() {
    Optional<VariableNode> propertyNode =
        getPropertyNode(MTThreeSpaceSampleType.SIGNIFICANT_DIGITS);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Short getSignificantDigits() {
    return getProperty(MTThreeSpaceSampleType.SIGNIFICANT_DIGITS).orElse(null);
  }

  @Override
  public void setSignificantDigits(Short value) {
    setProperty(MTThreeSpaceSampleType.SIGNIFICANT_DIGITS, value);
  }

  @Override
  public PropertyTypeNode getStatisticNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.STATISTIC);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public MTStatisticType getStatistic() {
    return getProperty(MTThreeSpaceSampleType.STATISTIC).orElse(null);
  }

  @Override
  public void setStatistic(MTStatisticType value) {
    setProperty(MTThreeSpaceSampleType.STATISTIC, value);
  }

  @Override
  public PropertyTypeNode getUnitsNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.UNITS);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String getUnits() {
    return getProperty(MTThreeSpaceSampleType.UNITS).orElse(null);
  }

  @Override
  public void setUnits(String value) {
    setProperty(MTThreeSpaceSampleType.UNITS, value);
  }

  @Override
  public PropertyTypeNode getEngineeringUnitsNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTThreeSpaceSampleType.ENGINEERING_UNITS);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public EUInformation getEngineeringUnits() {
    return getProperty(MTThreeSpaceSampleType.ENGINEERING_UNITS).orElse(null);
  }

  @Override
  public void setEngineeringUnits(EUInformation value) {
    setProperty(MTThreeSpaceSampleType.ENGINEERING_UNITS, value);
  }
}
