package com.kevinherron.opcua.mtconnect.model.server.variables;

import com.kevinherron.opcua.mtconnect.model.types.MTCategoryType;
import com.kevinherron.opcua.mtconnect.model.types.MTCoordinateSystemType;
import com.kevinherron.opcua.mtconnect.model.types.MTRepresentationType;
import com.kevinherron.opcua.mtconnect.model.types.MTResetTriggerType;
import com.kevinherron.opcua.mtconnect.model.types.MTStatisticType;
import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.server.model.variables.AnalogUnitType;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;

public interface MTSampleType extends AnalogUnitType {
  QualifiedProperty<MTCategoryType> CATEGORY =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Category",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2634"),
          -1,
          MTCategoryType.class);

  QualifiedProperty<String> MT_SUB_TYPE_NAME =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "MTSubTypeName",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<String> MT_TYPE_NAME =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "MTTypeName",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<String> NAME =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Name",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<Float> PERIOD_FILTER =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "PeriodFilter",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=10"),
          -1,
          Float.class);

  QualifiedProperty<MTRepresentationType> REPRESENTATION =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Representation",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2633"),
          -1,
          MTRepresentationType.class);

  QualifiedProperty<Double> SAMPLE_RATE =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "SampleRate",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=11"),
          -1,
          Double.class);

  QualifiedProperty<String> SOURCE_DATA =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "SourceData",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<String> XML_ID =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "XmlId",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<MTCoordinateSystemType> COORDINATE_SYSTEM =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "CoordinateSystem",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2635"),
          -1,
          MTCoordinateSystemType.class);

  QualifiedProperty<Double> DURATION =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Duration",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=290"),
          -1,
          Double.class);

  QualifiedProperty<Double> INITIAL_VALUE =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "InitialValue",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=11"),
          -1,
          Double.class);

  QualifiedProperty<Float> MINIMUM_DELTA_FILTER =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "MinimumDeltaFilter",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=10"),
          -1,
          Float.class);

  QualifiedProperty<String> NATIVE_UNITS =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "NativeUnits",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<MTResetTriggerType> RESET_TRIGGER =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "ResetTrigger",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2636"),
          -1,
          MTResetTriggerType.class);

  QualifiedProperty<MTResetTriggerType> RESET_TRIGGERED_REASON =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "ResetTriggeredReason",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2636"),
          -1,
          MTResetTriggerType.class);

  QualifiedProperty<Short> SIGNIFICANT_DIGITS =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "SignificantDigits",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=4"),
          -1,
          Short.class);

  QualifiedProperty<MTStatisticType> STATISTIC =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Statistic",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2659"),
          -1,
          MTStatisticType.class);

  QualifiedProperty<String> UNITS =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Units",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  MTCategoryType getCategory();

  void setCategory(MTCategoryType value);

  PropertyType getCategoryNode();

  String getMtSubTypeName();

  void setMtSubTypeName(String value);

  PropertyType getMtSubTypeNameNode();

  String getMtTypeName();

  void setMtTypeName(String value);

  PropertyType getMtTypeNameNode();

  String getName();

  void setName(String value);

  PropertyType getNameNode();

  Float getPeriodFilter();

  void setPeriodFilter(Float value);

  PropertyType getPeriodFilterNode();

  MTRepresentationType getRepresentation();

  void setRepresentation(MTRepresentationType value);

  PropertyType getRepresentationNode();

  Double getSampleRate();

  void setSampleRate(Double value);

  PropertyType getSampleRateNode();

  String getSourceData();

  void setSourceData(String value);

  PropertyType getSourceDataNode();

  String getXmlId();

  void setXmlId(String value);

  PropertyType getXmlIdNode();

  MTCoordinateSystemType getCoordinateSystem();

  void setCoordinateSystem(MTCoordinateSystemType value);

  PropertyType getCoordinateSystemNode();

  Double getDuration();

  void setDuration(Double value);

  PropertyType getDurationNode();

  Double getInitialValue();

  void setInitialValue(Double value);

  PropertyType getInitialValueNode();

  Float getMinimumDeltaFilter();

  void setMinimumDeltaFilter(Float value);

  PropertyType getMinimumDeltaFilterNode();

  String getNativeUnits();

  void setNativeUnits(String value);

  PropertyType getNativeUnitsNode();

  MTResetTriggerType getResetTrigger();

  void setResetTrigger(MTResetTriggerType value);

  PropertyType getResetTriggerNode();

  MTResetTriggerType getResetTriggeredReason();

  void setResetTriggeredReason(MTResetTriggerType value);

  PropertyType getResetTriggeredReasonNode();

  Short getSignificantDigits();

  void setSignificantDigits(Short value);

  PropertyType getSignificantDigitsNode();

  MTStatisticType getStatistic();

  void setStatistic(MTStatisticType value);

  PropertyType getStatisticNode();

  String getUnits();

  void setUnits(String value);

  PropertyType getUnitsNode();
}
