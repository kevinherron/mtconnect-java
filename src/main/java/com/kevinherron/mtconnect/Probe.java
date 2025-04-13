package com.kevinherron.mtconnect;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.mtconnect.v20.devices.ComponentType;
import org.mtconnect.v20.devices.DeviceType;
import org.mtconnect.v20.devices.DevicesType;
import org.mtconnect.v20.devices.HeaderType;
import org.mtconnect.v20.devices.MTConnectDevicesType;

public class Probe {

  public static void main(String[] args) {
    try {
      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request =
          HttpRequest.newBuilder()
              .uri(URI.create("https://demo.mtconnect.org/probe"))
              .GET()
              .build();

      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

      System.out.println(response.body());

      JAXBContext jaxbContext = JAXBContext.newInstance(MTConnectDevicesType.class);
      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
      JAXBElement<?> element =
          (JAXBElement<?>) unmarshaller.unmarshal(new java.io.StringReader(response.body()));

      MTConnectDevicesType mTCDevices = (MTConnectDevicesType) element.getValue();

      HeaderType headerType = mTCDevices.getHeader();
      DevicesType devicesType = mTCDevices.getDevices();

      // Print information from HeaderType
      System.out.println("\n--- Header Information ---");
      System.out.println("Version: " + headerType.getVersion());
      System.out.println("Creation Time: " + headerType.getCreationTime());
      System.out.println("Instance ID: " + headerType.getInstanceId());
      System.out.println("Sender: " + headerType.getSender());
      System.out.println("Buffer Size: " + headerType.getBufferSize());
      System.out.println("Asset Buffer Size: " + headerType.getAssetBufferSize());
      System.out.println("Asset Count: " + headerType.getAssetCount());
      System.out.println("Device Model Change Time: " + headerType.getDeviceModelChangeTime());
      System.out.println("Test Indicator: " + headerType.isTestIndicator());

      // Print information from DevicesType
      System.out.println("\n--- Devices Information ---");

      // Print Agent information if available
      if (devicesType.getAgent() != null) {
        System.out.println("\n--- Agent Information ---");
        DeviceType agent = devicesType.getAgent();
        printDeviceInfo(agent);
      }

      // Print Device information
      System.out.println("\n--- Device List ---");
      for (DeviceType device : devicesType.getDevice()) {
        printDeviceInfo(device);
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
  }

  /**
   * Prints information about a DeviceType object.
   *
   * @param device the DeviceType object to print information about
   */
  private static void printDeviceInfo(DeviceType device) {
    int indentLevel = 0;
    String indent = "  ".repeat(indentLevel);

    System.out.println(indent + "UUID: " + device.getUuid());
    System.out.println(indent + "Name: " + device.getName());
    System.out.println(indent + "MTConnect Version: " + device.getMtconnectVersion());

    if (device.getId() != null) {
      System.out.println(indent + "ID: " + device.getId());
    }

    if (device.getNativeName() != null) {
      System.out.println(indent + "Native Name: " + device.getNativeName());
    }

    if (device.getSampleInterval() != null) {
      System.out.println(indent + "Sample Interval: " + device.getSampleInterval());
    }

    if (device.getSampleRate() != null) {
      System.out.println(indent + "Sample Rate: " + device.getSampleRate());
    }

    // Print components if available
    if (device.getComponents() != null && device.getComponents().getComponent() != null) {
      System.out.println(indent + "Components:");
      for (JAXBElement<? extends ComponentType> jaxbComponent :
          device.getComponents().getComponent()) {
        printComponentInfo(jaxbComponent.getValue(), indentLevel + 1);
      }
    }
  }

  /**
   * Prints information about a ComponentType object with proper indentation.
   *
   * @param component the ComponentType object to print information about
   * @param indentLevel the level of indentation to use
   */
  private static void printComponentInfo(ComponentType component, int indentLevel) {
    String indent = "  ".repeat(indentLevel);

    System.out.println(indent + "Component ID: " + component.getId());

    if (component.getNativeName() != null) {
      System.out.println(indent + "Native Name: " + component.getNativeName());
    }

    // Print data items if available
    if (component.getDataItems() != null && component.getDataItems().getDataItem() != null) {
      System.out.println(indent + "Data Items: " + component.getDataItems().getDataItem().size());
    }

    // Print sub-components if available
    if (component.getComponents() != null && component.getComponents().getComponent() != null) {
      System.out.println(indent + "Sub-Components:");
      for (JAXBElement<? extends ComponentType> jaxbSubComponent :
          component.getComponents().getComponent()) {
        printComponentInfo(jaxbSubComponent.getValue(), indentLevel + 1);
      }
    }
  }
}
