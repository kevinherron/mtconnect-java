package com.kevinherron.opcua.mtconnect.model;

import com.kevinherron.opcua.mtconnect.model.types.AssetEventDataType;
import com.kevinherron.opcua.mtconnect.model.types.MessageDataType;
import com.kevinherron.opcua.mtconnect.model.types.ThreeSpaceSampleDataType;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;
import org.eclipse.milo.opcua.stack.core.types.DataTypeManager;

public class DataTypeInitializer {
  public void initialize(NamespaceTable namespaceTable, DataTypeManager dataTypeManager) {
    try {
      registerStructCodecs(namespaceTable, dataTypeManager);
    } catch (Exception e) {
      throw new RuntimeException("DataType initialization failed", e);
    }
  }

  private void registerStructCodecs(NamespaceTable namespaceTable, DataTypeManager dataTypeManager)
      throws Exception {
    dataTypeManager.registerType(
        AssetEventDataType.TYPE_ID.toNodeIdOrThrow(namespaceTable),
        new AssetEventDataType.Codec(),
        AssetEventDataType.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
        AssetEventDataType.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
        AssetEventDataType.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable));
    dataTypeManager.registerType(
        MessageDataType.TYPE_ID.toNodeIdOrThrow(namespaceTable),
        new MessageDataType.Codec(),
        MessageDataType.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
        MessageDataType.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
        MessageDataType.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable));
    dataTypeManager.registerType(
        ThreeSpaceSampleDataType.TYPE_ID.toNodeIdOrThrow(namespaceTable),
        new ThreeSpaceSampleDataType.Codec(),
        ThreeSpaceSampleDataType.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
        ThreeSpaceSampleDataType.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
        ThreeSpaceSampleDataType.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable));
  }
}
