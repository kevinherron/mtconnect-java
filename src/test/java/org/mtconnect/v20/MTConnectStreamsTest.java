package org.mtconnect.v20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.mtconnect.v20.streams.DeviceStreamType;
import org.mtconnect.v20.streams.HeaderType;
import org.mtconnect.v20.streams.MTConnectStreamsType;
import org.mtconnect.v20.streams.StreamsType;

public class MTConnectStreamsTest {

  @Test
  void parseMTConnectStreams() throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(MTConnectStreamsType.class);

    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    InputStream inputStream =
        getClass().getClassLoader().getResourceAsStream("MTConnectStreams_2.0.xml");
    assertNotNull(inputStream, "XML file not found in resources");

    JAXBElement<?> jaxbElement = (JAXBElement<?>) unmarshaller.unmarshal(inputStream);
    MTConnectStreamsType mtConnectStreams = (MTConnectStreamsType) jaxbElement.getValue();

    // Verify that the parsing was successful by checking some properties
    assertNotNull(mtConnectStreams, "Failed to parse MTConnectStreams");
    assertNotNull(mtConnectStreams.getHeader(), "Header is null");
    assertNotNull(mtConnectStreams.getStreams(), "Streams is null");

    // Verify header information
    HeaderType header = mtConnectStreams.getHeader();
    assertEquals("IntelAgent", header.getSender(), "Incorrect sender in header");
    assertEquals("1743558962", header.getInstanceId().toString(), "Incorrect instanceId in header");
    assertEquals(131072, header.getBufferSize(), "Incorrect bufferSize in header");

    // Verify streams information
    StreamsType streams = mtConnectStreams.getStreams();
    assertNotNull(streams.getDeviceStream(), "DeviceStream list is null");
    assertEquals(3, streams.getDeviceStream().size(), "Incorrect number of device streams");

    // Verify first device stream information
    DeviceStreamType deviceStream = streams.getDeviceStream().get(0);
    assertEquals("OKUMA", deviceStream.getName(), "Incorrect device name");
    assertEquals("OKUMA.123456", deviceStream.getUuid(), "Incorrect device UUID");
    assertNotNull(deviceStream.getComponentStream(), "ComponentStream list is null");
    assertEquals(23, deviceStream.getComponentStream().size(), "Incorrect number of component streams");
  }
}
