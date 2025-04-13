package com.kevinherron.opcua.mtconnect.model.server.objects;

import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.server.model.objects.BaseObjectType;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.DateTime;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;

public interface MTChannelType extends BaseObjectType {
  QualifiedProperty<DateTime> CALIBRATION_DATE =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "CalibrationDate",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=294"),
          -1,
          DateTime.class);

  QualifiedProperty<String> CALIBRATION_INITIALS =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "CalibrationInitials",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          -1,
          String.class);

  QualifiedProperty<String> MT_DESCRIPTION =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "MTDescription",
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

  QualifiedProperty<DateTime> NEXT_CALIBRATION_DATE =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "NextCalibrationDate",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=294"),
          -1,
          DateTime.class);

  QualifiedProperty<Integer> NUMBER =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Number",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=6"),
          -1,
          Integer.class);

  DateTime getCalibrationDate();

  void setCalibrationDate(DateTime value);

  PropertyType getCalibrationDateNode();

  String getCalibrationInitials();

  void setCalibrationInitials(String value);

  PropertyType getCalibrationInitialsNode();

  String getMtDescription();

  void setMtDescription(String value);

  PropertyType getMtDescriptionNode();

  String getName();

  void setName(String value);

  PropertyType getNameNode();

  DateTime getNextCalibrationDate();

  void setNextCalibrationDate(DateTime value);

  PropertyType getNextCalibrationDateNode();

  Integer getNumber();

  void setNumber(Integer value);

  PropertyType getNumberNode();
}
