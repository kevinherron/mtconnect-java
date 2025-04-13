package com.kevinherron.mtconnect;

import static com.kevinherron.mtconnect.Current.printStreams;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.mtconnect.v20.streams.MTConnectStreamsType;

public class Sample {

  public static void main(String[] args) {
    try {
      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request =
          HttpRequest.newBuilder()
              .uri(URI.create("https://demo.mtconnect.org/sample"))
              .GET()
              .build();

      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

      System.out.println(response.body());

      JAXBContext jaxbContext = JAXBContext.newInstance(MTConnectStreamsType.class);
      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
      JAXBElement<?> element =
          (JAXBElement<?>) unmarshaller.unmarshal(new java.io.StringReader(response.body()));

      MTConnectStreamsType mTCStreams = (MTConnectStreamsType) element.getValue();

      printStreams(mTCStreams);
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }
  }
}
