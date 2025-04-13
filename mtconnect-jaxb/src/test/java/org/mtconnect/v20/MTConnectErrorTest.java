package org.mtconnect.v20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.kevinherron.mtconnect.Error;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.mtconnect.v20.error.ErrorCodeType;
import org.mtconnect.v20.error.ErrorType;
import org.mtconnect.v20.error.ErrorsType;
import org.mtconnect.v20.error.HeaderType;
import org.mtconnect.v20.error.MTConnectErrorType;

public class MTConnectErrorTest {

  @Test
  void parseMTConnectError() throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(org.mtconnect.v20.error.ObjectFactory.class);

    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    InputStream inputStream =
        getClass().getClassLoader().getResourceAsStream("MTConnectError_2.0.xml");
    assertNotNull(inputStream, "XML file not found in resources");

    JAXBElement<?> jaxbElement = (JAXBElement<?>) unmarshaller.unmarshal(inputStream);
    MTConnectErrorType mtConnectError = (MTConnectErrorType) jaxbElement.getValue();

    // Verify that the parsing was successful by checking some properties
    assertNotNull(mtConnectError, "Failed to parse MTConnectError");
    assertNotNull(mtConnectError.getHeader(), "Header is null");
    assertNotNull(mtConnectError.getErrors(), "Errors is null");

    // Verify header information
    HeaderType header = mtConnectError.getHeader();
    assertEquals("IntelAgent", header.getSender(), "Incorrect sender in header");
    assertEquals("1743558962", header.getInstanceId().toString(), "Incorrect instanceId in header");

    // Verify errors information
    ErrorsType errors = mtConnectError.getErrors();
    assertNotNull(errors.getError(), "Error list is null");
    assertEquals(1, errors.getError().size(), "Incorrect number of errors");

    // Verify error information
    ErrorType error = errors.getError().get(0);
    assertEquals(ErrorCodeType.NO_DEVICE, error.getErrorCode(), "Incorrect error code");
    assertEquals("Could not find the device 'foo'", error.getValue(), "Incorrect error message");

    // Print the error information
    System.out.println("\n--- MTConnectError Test Output ---");
    Error.printError(mtConnectError);
  }
}
