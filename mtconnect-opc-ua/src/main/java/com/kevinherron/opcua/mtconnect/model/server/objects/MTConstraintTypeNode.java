package com.kevinherron.opcua.mtconnect.model.server.objects;

import java.util.Optional;
import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.objects.BaseObjectTypeNode;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNodeContext;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.structured.AccessRestrictionType;
import org.eclipse.milo.opcua.stack.core.types.structured.RolePermissionType;

public class MTConstraintTypeNode extends BaseObjectTypeNode implements MTConstraintType {
  public MTConstraintTypeNode(
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
      UByte eventNotifier) {
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
        eventNotifier);
  }

  public MTConstraintTypeNode(
      UaNodeContext context,
      NodeId nodeId,
      QualifiedName browseName,
      LocalizedText displayName,
      LocalizedText description,
      UInteger writeMask,
      UInteger userWriteMask,
      RolePermissionType[] rolePermissions,
      RolePermissionType[] userRolePermissions,
      AccessRestrictionType accessRestrictions) {
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
        accessRestrictions);
  }

  @Override
  public PropertyTypeNode getMaximumNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConstraintType.MAXIMUM);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getMaximum() {
    return getProperty(MTConstraintType.MAXIMUM).orElse(null);
  }

  @Override
  public void setMaximum(Float value) {
    setProperty(MTConstraintType.MAXIMUM, value);
  }

  @Override
  public PropertyTypeNode getMinimumNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConstraintType.MINIMUM);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getMinimum() {
    return getProperty(MTConstraintType.MINIMUM).orElse(null);
  }

  @Override
  public void setMinimum(Float value) {
    setProperty(MTConstraintType.MINIMUM, value);
  }

  @Override
  public PropertyTypeNode getNominalNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConstraintType.NOMINAL);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public Float getNominal() {
    return getProperty(MTConstraintType.NOMINAL).orElse(null);
  }

  @Override
  public void setNominal(Float value) {
    setProperty(MTConstraintType.NOMINAL, value);
  }

  @Override
  public PropertyTypeNode getValuesNode() {
    Optional<VariableNode> propertyNode = getPropertyNode(MTConstraintType.VALUES);
    return (PropertyTypeNode) propertyNode.orElse(null);
  }

  @Override
  public String[] getValues() {
    return getProperty(MTConstraintType.VALUES).orElse(null);
  }

  @Override
  public void setValues(String[] value) {
    setProperty(MTConstraintType.VALUES, value);
  }
}
