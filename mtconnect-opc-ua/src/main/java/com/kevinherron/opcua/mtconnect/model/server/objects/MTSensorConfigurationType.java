package com.kevinherron.opcua.mtconnect.model.server.objects;

import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.server.model.objects.FolderType;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.DateTime;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;

public interface MTSensorConfigurationType extends MTConfigurationType {
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

  QualifiedProperty<String> FIRWARE_VERSION =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "FirwareVersion",
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

  DateTime getCalibrationDate();

  void setCalibrationDate(DateTime value);

  PropertyType getCalibrationDateNode();

  String getCalibrationInitials();

  void setCalibrationInitials(String value);

  PropertyType getCalibrationInitialsNode();

  String getFirwareVersion();

  void setFirwareVersion(String value);

  PropertyType getFirwareVersionNode();

  DateTime getNextCalibrationDate();

  void setNextCalibrationDate(DateTime value);

  PropertyType getNextCalibrationDateNode();

  FolderType getChannelsNode();
}
