package com.kevinherron.mtconnect;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import org.mtconnect.v20.assets.AssetType;
import org.mtconnect.v20.assets.AssetsType;
import org.mtconnect.v20.assets.CuttingToolType;
import org.mtconnect.v20.assets.FileType;
import org.mtconnect.v20.assets.HeaderType;
import org.mtconnect.v20.assets.MTConnectAssetsType;

public class Assets {

  public static void main(String[] args) {
    try {
      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request =
          HttpRequest.newBuilder()
              .uri(URI.create("https://demo.mtconnect.org/assets"))
              .GET()
              .build();

      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

      System.out.println(response.body());

      JAXBContext jaxbContext = JAXBContext.newInstance(MTConnectAssetsType.class);
      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
      JAXBElement<?> element =
          (JAXBElement<?>) unmarshaller.unmarshal(new java.io.StringReader(response.body()));

      MTConnectAssetsType mTCAssets = (MTConnectAssetsType) element.getValue();

      HeaderType header = mTCAssets.getHeader();

      // Print interesting information from HeaderType
      System.out.println("\n--- Header Information ---");
      System.out.println("Asset Buffer Size: " + header.getAssetBufferSize());
      System.out.println("Asset Count: " + header.getAssetCount());
      System.out.println("Version: " + header.getVersion());
      System.out.println("Creation Time: " + header.getCreationTime());
      System.out.println("Instance ID: " + header.getInstanceId());
      System.out.println("Sender: " + header.getSender());
      System.out.println("Device Model Change Time: " + header.getDeviceModelChangeTime());
      System.out.println("Test Indicator: " + header.isTestIndicator());

      AssetsType assets = mTCAssets.getAssets();

      // Print interesting information from AssetsType
      System.out.println("\n--- Assets Information ---");
      List<JAXBElement<? extends AssetType>> assetList = assets.getAsset();
      System.out.println("Total number of assets: " + assetList.size());

      // Iterate through each asset
      for (JAXBElement<? extends AssetType> assetElement : assetList) {
        AssetType asset = assetElement.getValue();
        System.out.println("\nAsset ID: " + asset.getAssetId());
        System.out.println("Timestamp: " + asset.getTimestamp());
        System.out.println("Device UUID: " + asset.getDeviceUuid());
        System.out.println("Removed: " + asset.isRemoved());

        // Check the specific type of asset and print additional information
        if (asset instanceof CuttingToolType) {
          CuttingToolType cuttingTool = (CuttingToolType) asset;
          System.out.println("Asset Type: Cutting Tool");
          // Print cutting tool specific information if needed
        } else if (asset instanceof FileType) {
          FileType file = (FileType) asset;
          System.out.println("Asset Type: File");
          // Print file specific information if needed
        } else {
          System.out.println("Asset Type: " + asset.getClass().getSimpleName());
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
  }
}
