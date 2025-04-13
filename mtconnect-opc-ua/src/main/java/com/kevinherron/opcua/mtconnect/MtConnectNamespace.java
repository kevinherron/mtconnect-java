package com.kevinherron.opcua.mtconnect;

import com.digitalpetri.opcua.uanodeset.namespace.NodeSetNamespace;
import com.kevinherron.opcua.mtconnect.model.DataTypeInitializer;
import com.kevinherron.opcua.mtconnect.model.server.ObjectTypeInitializer;
import com.kevinherron.opcua.mtconnect.model.server.VariableTypeInitializer;
import java.io.InputStream;
import java.util.List;
import org.eclipse.milo.opcua.sdk.server.OpcUaServer;
import org.eclipse.milo.opcua.stack.core.encoding.EncodingContext;

public class MtConnectNamespace extends NodeSetNamespace {

  public static final String NAMESPACE_URI = "http://opcfoundation.org/UA/MTConnect/v2/";

  private MtConnectNamespace(OpcUaServer server) {
    super(server, NAMESPACE_URI);
  }

  @Override
  protected EncodingContext getEncodingContext() {
    return getServer().getStaticEncodingContext();
  }

  @Override
  protected List<InputStream> getNodeSetInputStreams() {
    InputStream inputStream =
        MtConnectNamespace.class.getResourceAsStream("/Opc.Ua.MTConnect.NodeSet2.xml");
    assert inputStream != null;

    return List.of(inputStream);
  }

  /**
   * Create an {@link MtConnectNamespace} and run initializers to register types with the Server.
   *
   * @param server the {@link OpcUaServer} to create the namespace for.
   * @return the created {@link MtConnectNamespace}.
   */
  public static MtConnectNamespace create(OpcUaServer server) {
    var namespace = new MtConnectNamespace(server);

    new DataTypeInitializer()
        .initialize(server.getNamespaceTable(), server.getStaticDataTypeManager());

    ObjectTypeInitializer.initialize(server.getNamespaceTable(), server.getObjectTypeManager());
    VariableTypeInitializer.initialize(server.getNamespaceTable(), server.getVariableTypeManager());

    return namespace;
  }
}
