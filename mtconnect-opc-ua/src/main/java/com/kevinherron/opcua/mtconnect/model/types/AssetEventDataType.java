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
import org.jspecify.annotations.Nullable;

public class AssetEventDataType extends Structure implements UaStructuredType {
  public static final ExpandedNodeId TYPE_ID =
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2618");

  public static final ExpandedNodeId BINARY_ENCODING_ID =
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2745");

  public static final ExpandedNodeId XML_ENCODING_ID =
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2748");

  public static final ExpandedNodeId JSON_ENCODING_ID =
      ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2750");

  private final @Nullable String assetId;

  private final @Nullable String assetType;

  public AssetEventDataType(@Nullable String assetId, @Nullable String assetType) {
    this.assetId = assetId;
    this.assetType = assetType;
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

  public @Nullable String getAssetId() {
    return assetId;
  }

  public @Nullable String getAssetType() {
    return assetType;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    } else if (object == null || getClass() != object.getClass()) {
      return false;
    }
    AssetEventDataType that = (AssetEventDataType) object;
    var eqb = new EqualsBuilder();
    eqb.append(getAssetId(), that.getAssetId());
    eqb.append(getAssetType(), that.getAssetType());
    return eqb.build();
  }

  @Override
  public int hashCode() {
    var hcb = new HashCodeBuilder();
    hcb.append(getAssetId());
    hcb.append(getAssetType());
    return hcb.build();
  }

  @Override
  public String toString() {
    var joiner = new StringJoiner(", ", AssetEventDataType.class.getSimpleName() + "[", "]");
    joiner.add("assetId='" + getAssetId() + "'");
    joiner.add("assetType='" + getAssetType() + "'");
    return joiner.toString();
  }

  public static StructureDefinition definition(NamespaceTable namespaceTable) {
    return new StructureDefinition(
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/MTConnect/v2/;i=2745")
            .toNodeId(namespaceTable)
            .orElseThrow(),
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=22")
            .toNodeId(namespaceTable)
            .orElseThrow(),
        StructureType.Structure,
        new StructureField[] {
          new StructureField(
              "AssetId",
              new LocalizedText(
                  "",
                  "The unique identifier for the mtconnect asset. The identifier MUST be unique"
                      + " with respect to all other asset in an MTConnect installation. The"
                      + " identifier SHOULD be globally unique with respect to all other asset."),
              new NodeId(0, 12),
              -1,
              null,
              UInteger.valueOf(0),
              false),
          new StructureField(
              "AssetType",
              new LocalizedText("", "The type of asset that was updated."),
              new NodeId(0, 12),
              -1,
              null,
              UInteger.valueOf(0),
              false)
        });
  }

  public static final class Codec extends GenericDataTypeCodec<AssetEventDataType> {
    @Override
    public Class<AssetEventDataType> getType() {
      return AssetEventDataType.class;
    }

    @Override
    public AssetEventDataType decodeType(EncodingContext context, UaDecoder decoder) {
      final String assetId;
      final String assetType;
      assetId = decoder.decodeString("AssetId");
      assetType = decoder.decodeString("AssetType");
      return new AssetEventDataType(assetId, assetType);
    }

    @Override
    public void encodeType(EncodingContext context, UaEncoder encoder, AssetEventDataType value) {
      encoder.encodeString("AssetId", value.getAssetId());
      encoder.encodeString("AssetType", value.getAssetType());
    }
  }
}
