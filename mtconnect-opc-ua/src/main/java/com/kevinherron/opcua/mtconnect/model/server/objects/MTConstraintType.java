package com.kevinherron.opcua.mtconnect.model.server.objects;

import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.server.model.objects.BaseObjectType;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;

public interface MTConstraintType extends BaseObjectType {
  QualifiedProperty<Float> MAXIMUM =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Maximum",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=10"),
          -1,
          Float.class);

  QualifiedProperty<Float> MINIMUM =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Minimum",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=10"),
          -1,
          Float.class);

  QualifiedProperty<Float> NOMINAL =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Nominal",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=10"),
          -1,
          Float.class);

  QualifiedProperty<String[]> VALUES =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "Values",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12"),
          1,
          String[].class);

  Float getMaximum();

  void setMaximum(Float value);

  PropertyType getMaximumNode();

  Float getMinimum();

  void setMinimum(Float value);

  PropertyType getMinimumNode();

  Float getNominal();

  void setNominal(Float value);

  PropertyType getNominalNode();

  String[] getValues();

  void setValues(String[] value);

  PropertyType getValuesNode();
}
