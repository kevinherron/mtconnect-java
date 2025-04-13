package com.kevinherron.mtconnect;

import static com.kevinherron.mtconnect.Current.printStreams;
import static com.kevinherron.mtconnect.ObjectFactories.ERROR_OBJECT_FACTORY;
import static com.kevinherron.mtconnect.ObjectFactories.STREAMS_OBJECT_FACTORY;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.mtconnect.v20.error.MTConnectErrorType;
import org.mtconnect.v20.streams.MTConnectStreamsType;

public class Sample {

  public static void main(String[] args) throws Exception {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request =
        HttpRequest.newBuilder().uri(URI.create("https://demo.mtconnect.org/sample")).GET().build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println(response.body());

    JAXBContext jaxbContext = JAXBContext.newInstance(STREAMS_OBJECT_FACTORY, ERROR_OBJECT_FACTORY);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    JAXBElement<?> element =
        (JAXBElement<?>) unmarshaller.unmarshal(new java.io.StringReader(response.body()));

    if (element.getValue() instanceof MTConnectErrorType error) {
      Error.printError(error);
    } else if (element.getValue() instanceof MTConnectStreamsType mTCStreams) {
      printStreams(mTCStreams);
    }
  }
}
