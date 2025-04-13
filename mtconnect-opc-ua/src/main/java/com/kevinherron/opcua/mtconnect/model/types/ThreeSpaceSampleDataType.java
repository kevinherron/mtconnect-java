package com.kevinherron.opcua.mtconnect.model.types;

import java.util.StringJoiner;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;
import org.eclipse.milo.opcua.stack.core.encoding.EncodingContext;
import org.eclipse.milo.opcua.stack.core.encoding.GenericDataTypeCodec;
import org.eclipse.milo.opcua.stack.core.encoding.UaDecoder;
import org.eclipse.milo.opcua.stack.core.encoding.UaEncoder;
import org.eclipse.milo.opcua.stack.core.types.UaStructuredType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.enumerated.StructureType;
import org.eclipse.milo.opcua.stack.core.types.structured.Structure;
import org.eclipse.milo.opcua.stack.core.types.structured.StructureDefinition;
import org.eclipse.milo.opcua.stack.core.types.structured.StructureField;
import org.eclipse.milo.opcua.stack.core.util.codegen.EqualsBuilder;
import org.eclipse.milo.opcua.stack.core.util.codegen.HashCodeBuilder;

public class ThreeSpaceSampleDataType extends Structure implements UaStructuredType {
  public static final ExpandedNodeId TYPE_ID =
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2637");

  public static final ExpandedNodeId BINARY_ENCODING_ID =
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2909");

  public static final ExpandedNodeId XML_ENCODING_ID =
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2912");

  public static final ExpandedNodeId JSON_ENCODING_ID =
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2914");

  private final Double x;

  private final Double y;

  private final Double z;

  public ThreeSpaceSampleDataType(Double x, Double y, Double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public ExpandedNodeId getTypeId() {
    return TYPE_ID;
  }

  @Override
  public ExpandedNodeId getBinaryEncodingId() {
    return BINARY_ENCODING_ID;
  }

  @Override
  public ExpandedNodeId getXmlEncodingId() {
    return XML_ENCODING_ID;
  }

  @Override
  public ExpandedNodeId getJsonEncodingId() {
    return JSON_ENCODING_ID;
  }

  public Double getX() {
    return x;
  }

  public Double getY() {
    return y;
  }

  public Double getZ() {
    return z;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    } else if (object == null || getClass() != object.getClass()) {
      return false;
    }
    ThreeSpaceSampleDataType that = (ThreeSpaceSampleDataType) object;
    var eqb = new EqualsBuilder();
    eqb.append(getX(), that.getX());
    eqb.append(getY(), that.getY());
    eqb.append(getZ(), that.getZ());
    return eqb.build();
  }

  @Override
  public int hashCode() {
    var hcb = new HashCodeBuilder();
    hcb.append(getX());
    hcb.append(getY());
    hcb.append(getZ());
    return hcb.build();
  }

  @Override
  public String toString() {
    var joiner = new StringJoiner(", ", ThreeSpaceSampleDataType.class.getSimpleName() + "[", "]");
    joiner.add("x=" + getX());
    joiner.add("y=" + getY());
    joiner.add("z=" + getZ());
    return joiner.toString();
  }

  public static StructureDefinition definition(NamespaceTable namespaceTable) {
    return new StructureDefinition(
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2909")
            .toNodeId(namespaceTable)
            .orElseThrow(),
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=22")
            .toNodeId(namespaceTable)
            .orElseThrow(),
        StructureType.Structure,
        new StructureField[] {
          new StructureField(
              "X",
              new LocalizedText("", "If not present, must be set to NaN."),
              new NodeId(0, 11),
              -1,
              null,
              UInteger.valueOf(0),
              false),
          new StructureField(
              "Y",
              new LocalizedText("", "If not present, must be set to NaN."),
              new NodeId(0, 11),
              -1,
              null,
              UInteger.valueOf(0),
              false),
          new StructureField(
              "Z",
              new LocalizedText("", "If not present, must be set to NaN."),
              new NodeId(0, 11),
              -1,
              null,
              UInteger.valueOf(0),
              false)
        });
  }

  public static final class Codec extends GenericDataTypeCodec<ThreeSpaceSampleDataType> {
    @Override
    public Class<ThreeSpaceSampleDataType> getType() {
      return ThreeSpaceSampleDataType.class;
    }

    @Override
    public ThreeSpaceSampleDataType decodeType(EncodingContext context, UaDecoder decoder) {
      final Double x;
      final Double y;
      final Double z;
      x = decoder.decodeDouble("X");
      y = decoder.decodeDouble("Y");
      z = decoder.decodeDouble("Z");
      return new ThreeSpaceSampleDataType(x, y, z);
    }

    @Override
    public void encodeType(
        EncodingContext context, UaEncoder encoder, ThreeSpaceSampleDataType value) {
      encoder.encodeDouble("X", value.getX());
      encoder.encodeDouble("Y", value.getY());
      encoder.encodeDouble("Z", value.getZ());
    }
  }
}
