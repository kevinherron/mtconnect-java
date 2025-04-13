package com.kevinherron.opcua.mtconnect.model.server.objects;

import com.kevinherron.opcua.mtconnect.model.types.MTSeverityDataType;
import com.kevinherron.opcua.mtconnect.model.types.QualifierDataType;
import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.server.model.objects.ConditionType;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;

public interface MTConditionEventType extends ConditionType {
  QualifiedProperty<LocalizedText> ACTIVE_STATE =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "ActiveState",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=21"),
          -1,
          LocalizedText.class);

  QualifiedProperty<String> DATA_ITEM_ID =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "DataItemId",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<MTSeverityDataType> MT_SEVERITY =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "MTSeverity",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2669"),
          -1,
          MTSeverityDataType.class);

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

  QualifiedProperty<String> NATIVE_CODE =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "NativeCode",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<String> NATIVE_SEVERITY =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "NativeSeverity",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<QualifierDataType> QUALIFIER =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Qualifier",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2668"),
          -1,
          QualifierDataType.class);

  LocalizedText getActiveState();

  void setActiveState(LocalizedText value);

  PropertyType getActiveStateNode();

  String getDataItemId();

  void setDataItemId(String value);

  PropertyType getDataItemIdNode();

  MTSeverityDataType getMtSeverity();

  void setMtSeverity(MTSeverityDataType value);

  PropertyType getMtSeverityNode();

  String getMtSubTypeName();

  void setMtSubTypeName(String value);

  PropertyType getMtSubTypeNameNode();

  String getMtTypeName();

  void setMtTypeName(String value);

  PropertyType getMtTypeNameNode();

  String getNativeCode();

  void setNativeCode(String value);

  PropertyType getNativeCodeNode();

  String getNativeSeverity();

  void setNativeSeverity(String value);

  PropertyType getNativeSeverityNode();

  QualifierDataType getQualifier();

  void setQualifier(QualifierDataType value);

  PropertyType getQualifierNode();
}
