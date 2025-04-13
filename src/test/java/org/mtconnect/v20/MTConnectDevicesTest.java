package org.mtconnect.v20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.mtconnect.v20.devices.DeviceType;
import org.mtconnect.v20.devices.DevicesType;
import org.mtconnect.v20.devices.HeaderType;
import org.mtconnect.v20.devices.MTConnectDevicesType;

public class MTConnectDevicesTest {

  @Test
  void parseMTConnectDevices() throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(MTConnectDevicesType.class);

    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    InputStream inputStream =
        getClass().getClassLoader().getResourceAsStream("MTConnectDevices_2.0.xml");
    assertNotNull(inputStream, "XML file not found in resources");

    JAXBElement<?> jaxbElement = (JAXBElement<?>) unmarshaller.unmarshal(inputStream);
    MTConnectDevicesType mtConnectDevices = (MTConnectDevicesType) jaxbElement.getValue();

    // Verify that the parsing was successful by checking some properties
    assertNotNull(mtConnectDevices, "Failed to parse MTConnectDevices");
    assertNotNull(mtConnectDevices.getHeader(), "Header is null");
    assertNotNull(mtConnectDevices.getDevices(), "Devices is null");

    // Verify header information
    HeaderType header = mtConnectDevices.getHeader();
    assertEquals("IntelAgent", header.getSender(), "Incorrect sender in header");
    assertEquals("1743558962", header.getInstanceId().toString(), "Incorrect instanceId in header");

    // Verify devices information
    DevicesType devices = mtConnectDevices.getDevices();
    assertNotNull(devices.getDevice(), "Device list is null");
    assertEquals(2, devices.getDevice().size(), "Incorrect number of devices");

    // Verify first device information
    DeviceType device = devices.getDevice().get(0);
    assertEquals("OKUMA.123456", device.getId(), "Incorrect device ID");
    assertEquals("OKUMA", device.getName(), "Incorrect device name");
  }
}
