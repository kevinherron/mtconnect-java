package com.kevinherron.opcua.mtconnect.model.server.objects;

import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.server.model.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;

public interface CloseChuckClassType extends MTControlledVocabEventClassType {
  QualifiedProperty<LocalizedText[]> ENUM_STRINGS =
      new QualifiedProperty<>(
          "http://opcfoundation.org/UA/MTConnect/v2/",
          "EnumStrings",
          ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=21"),
          1,
          LocalizedText[].class);

  LocalizedText[] getEnumStrings();

  void setEnumStrings(LocalizedText[] value);

  PropertyType getEnumStringsNode();
}
