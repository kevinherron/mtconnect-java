package com.kevinherron.opcua.mtconnect.model.server.objects;

import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.server.model.objects.BaseObjectType;
import org.eclipse.milo.opcua.sdk.server.model.objects.FolderType;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;

public interface MTComponentType extends BaseObjectType {
  QualifiedProperty<String> NAME =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Name",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<String> NATIVE_NAME =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "NativeName",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<Float> SAMPLE_INTERVAL =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "SampleInterval",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=10"),
          -1,
          Float.class);

  QualifiedProperty<Float> SAMPLE_RATE =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "SampleRate",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=10"),
          -1,
          Float.class);

  QualifiedProperty<String> UUID =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Uuid",
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

  String getName();

  void setName(String value);

  PropertyType getNameNode();

  String getNativeName();

  void setNativeName(String value);

  PropertyType getNativeNameNode();

  Float getSampleInterval();

  void setSampleInterval(Float value);

  PropertyType getSampleIntervalNode();

  Float getSampleRate();

  void setSampleRate(Float value);

  PropertyType getSampleRateNode();

  String getUuid();

  void setUuid(String value);

  PropertyType getUuidNode();

  String getXmlId();

  void setXmlId(String value);

  PropertyType getXmlIdNode();

  MTDescriptionType getDescriptionNode();

  MTConfigurationType getConfigurationNode();

  FolderType getCompositionsNode();

  FolderType getComponentsNode();
}
