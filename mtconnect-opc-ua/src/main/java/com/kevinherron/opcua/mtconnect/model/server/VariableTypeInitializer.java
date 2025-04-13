package com.kevinherron.opcua.mtconnect.model.server;

import com.kevinherron.opcua.mtconnect.model.server.variables.MTAssetEventTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.variables.MTControlledVocabEventTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.variables.MTMessageTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.variables.MTNumericEventTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.variables.MTSampleTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.variables.MTStringEventTypeNode;
import com.kevinherron.opcua.mtconnect.model.server.variables.MTThreeSpaceSampleTypeNode;
import org.eclipse.milo.opcua.sdk.server.VariableTypeManager;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

public class VariableTypeInitializer {
  public static void initialize(
      NamespaceTable namespaceTable, VariableTypeManager variableTypeManager) {
    variableTypeManager.registerVariableType(
        NodeId.parse("ns=1;i=2429")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTSampleTypeNode.class,
        MTSampleTypeNode::new);
    variableTypeManager.registerVariableType(
        NodeId.parse("ns=1;i=2626")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTControlledVocabEventTypeNode.class,
        MTControlledVocabEventTypeNode::new);
    variableTypeManager.registerVariableType(
        NodeId.parse("ns=1;i=2438")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTNumericEventTypeNode.class,
        MTNumericEventTypeNode::new);
    variableTypeManager.registerVariableType(
        NodeId.parse("ns=1;i=2641")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTThreeSpaceSampleTypeNode.class,
        MTThreeSpaceSampleTypeNode::new);
    variableTypeManager.registerVariableType(
        NodeId.parse("ns=1;i=2621")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTAssetEventTypeNode.class,
        MTAssetEventTypeNode::new);
    variableTypeManager.registerVariableType(
        NodeId.parse("ns=1;i=2471")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTMessageTypeNode.class,
        MTMessageTypeNode::new);
    variableTypeManager.registerVariableType(
        NodeId.parse("ns=1;i=2433")
            .reindex(namespaceTable, "http://opcfoundation.org/UA/MTConnect/v2/"),
        MTStringEventTypeNode.class,
        MTStringEventTypeNode::new);
  }
}
