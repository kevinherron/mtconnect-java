package org.mtconnect.v20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mtconnect.v20.assets.AssetType;
import org.mtconnect.v20.assets.AssetsType;
import org.mtconnect.v20.assets.CuttingToolType;
import org.mtconnect.v20.assets.HeaderType;
import org.mtconnect.v20.assets.MTConnectAssetsType;

public class MTConnectAssetsTest {

  @Test
  void parseMTConnectAssets() throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(MTConnectAssetsType.class);

    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    InputStream inputStream =
        getClass().getClassLoader().getResourceAsStream("MTConnectAssets_2.0.xml");
    assertNotNull(inputStream, "XML file not found in resources");

    JAXBElement<?> jaxbElement = (JAXBElement<?>) unmarshaller.unmarshal(inputStream);
    MTConnectAssetsType mtConnectAssets = (MTConnectAssetsType) jaxbElement.getValue();

    // Verify that the parsing was successful by checking some properties
    assertNotNull(mtConnectAssets, "Failed to parse MTConnectAssets");
    assertNotNull(mtConnectAssets.getHeader(), "Header is null");
    assertNotNull(mtConnectAssets.getAssets(), "Assets is null");

    // Verify header information
    HeaderType header = mtConnectAssets.getHeader();
    assertEquals("IntelAgent", header.getSender(), "Incorrect sender in header");
    assertEquals("1743558962", header.getInstanceId().toString(), "Incorrect instanceId in header");
    assertEquals(1024, header.getAssetBufferSize(), "Incorrect assetBufferSize in header");
    assertEquals(66, header.getAssetCount(), "Incorrect assetCount in header");

    // Verify assets information
    AssetsType assets = mtConnectAssets.getAssets();
    List<JAXBElement<? extends AssetType>> assetList = assets.getAsset();
    assertNotNull(assetList, "Asset list is null");

    // The XML file contains many CuttingTool assets, verify we have some
    boolean hasCuttingTools = false;
    for (JAXBElement<? extends AssetType> assetElement : assetList) {
      AssetType asset = assetElement.getValue();
      if (asset instanceof CuttingToolType cuttingTool) {
        hasCuttingTools = true;
        assertNotNull(cuttingTool.getAssetId(), "CuttingTool assetId is null");
        assertNotNull(cuttingTool.getDeviceUuid(), "CuttingTool deviceUuid is null");
        assertNotNull(cuttingTool.getTimestamp(), "CuttingTool timestamp is null");
        break;
      }
    }

    assertTrue(hasCuttingTools, "No CuttingTool assets found");

    // Verify first asset information (assuming it's a CuttingTool based on the XML)
    JAXBElement<? extends AssetType> firstAssetElement = assetList.get(0);
    AssetType firstAsset = firstAssetElement.getValue();
    assertEquals(CuttingToolType.class, firstAsset.getClass(), "First asset is not a CuttingTool");

    CuttingToolType firstCuttingTool = (CuttingToolType) firstAsset;
    assertEquals(
        "123456.2206", firstCuttingTool.getAssetId(), "Incorrect assetId for first CuttingTool");
    assertEquals(
        "OKUMA.123456",
        firstCuttingTool.getDeviceUuid(),
        "Incorrect deviceUuid for first CuttingTool");
    assertEquals(
        "2206", firstCuttingTool.getSerialNumber(), "Incorrect serialNumber for first CuttingTool");
  }
}
