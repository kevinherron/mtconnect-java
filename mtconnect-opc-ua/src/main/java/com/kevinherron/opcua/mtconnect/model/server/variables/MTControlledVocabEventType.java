package com.kevinherron.opcua.mtconnect.model.server.variables;

import com.kevinherron.opcua.mtconnect.model.types.MTCategoryType;
import com.kevinherron.opcua.mtconnect.model.types.MTRepresentationType;
import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.server.model.variables.MultiStateDiscreteType;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;

public interface MTControlledVocabEventType extends MultiStateDiscreteType {
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

  QualifiedProperty<String> VALUE_AS_TEXT =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "ValueAsText",
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

  String getValueAsText();

  void setValueAsText(String value);

  PropertyType getValueAsTextNode();
}
