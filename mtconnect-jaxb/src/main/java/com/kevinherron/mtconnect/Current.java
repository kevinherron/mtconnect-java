package com.kevinherron.mtconnect;

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
import org.mtconnect.v20.streams.ComponentStreamType;
import org.mtconnect.v20.streams.ConditionListType;
import org.mtconnect.v20.streams.ConditionType;
import org.mtconnect.v20.streams.DeviceStreamType;
import org.mtconnect.v20.streams.EventType;
import org.mtconnect.v20.streams.EventsType;
import org.mtconnect.v20.streams.HeaderType;
import org.mtconnect.v20.streams.MTConnectStreamsType;
import org.mtconnect.v20.streams.SampleType;
import org.mtconnect.v20.streams.SamplesType;
import org.mtconnect.v20.streams.StreamsType;

public class Current {

  public static void main(String[] args) throws Exception {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request =
        HttpRequest.newBuilder()
            .uri(URI.create("https://demo.mtconnect.org/current"))
            .GET()
            .build();

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

  static void printStreams(MTConnectStreamsType mTCStreams) {
    HeaderType headerType = mTCStreams.getHeader();
    System.out.println("===== Header Information =====");
    System.out.println("Buffer Size: " + headerType.getBufferSize());
    System.out.println("Next Sequence: " + headerType.getNextSequence());
    System.out.println("Last Sequence: " + headerType.getLastSequence());
    System.out.println("First Sequence: " + headerType.getFirstSequence());
    System.out.println("Version: " + headerType.getVersion());
    System.out.println("Creation Time: " + headerType.getCreationTime());
    System.out.println("Instance ID: " + headerType.getInstanceId());
    System.out.println("Sender: " + headerType.getSender());
    System.out.println("Device Model Change Time: " + headerType.getDeviceModelChangeTime());
    System.out.println("Test Indicator: " + headerType.isTestIndicator());
    System.out.println("=============================");

    StreamsType streamsType = mTCStreams.getStreams();
    System.out.println("===== Streams Information =====");
    for (DeviceStreamType deviceStream : streamsType.getDeviceStream()) {
      System.out.println("Device Name: " + deviceStream.getName());
      System.out.println("Device UUID: " + deviceStream.getUuid());

      for (ComponentStreamType componentStream : deviceStream.getComponentStream()) {
        System.out.println("  Component ID: " + componentStream.getComponentId());
        System.out.println("  Component Name: " + componentStream.getName());
        System.out.println("  Component Type: " + componentStream.getComponent());
        System.out.println("  Component UUID: " + componentStream.getUuid());

        // Print samples information if available
        SamplesType samples = componentStream.getSamples();
        if (samples != null && !samples.getSample().isEmpty()) {
          System.out.println("    Samples:");
          for (JAXBElement<? extends SampleType> sampleElement : samples.getSample()) {
            SampleType sample = sampleElement.getValue();
            System.out.println("      Name: " + sample.getName());
            System.out.println("      Value: " + sample.getContent());
            System.out.println("      Timestamp: " + sample.getTimestamp());
            System.out.println("      Sequence: " + sample.getSequence());
            System.out.println("      -----");
          }
        }

        // Print events information if available
        EventsType events = componentStream.getEvents();
        if (events != null && !events.getEvent().isEmpty()) {
          System.out.println("    Events:");
          for (JAXBElement<? extends EventType> eventElement : events.getEvent()) {
            EventType event = eventElement.getValue();
            System.out.println("      Name: " + event.getName());
            System.out.println("      Value: " + event.getContent());
            System.out.println("      Timestamp: " + event.getTimestamp());
            System.out.println("      Sequence: " + event.getSequence());
            System.out.println("      -----");
          }
        }

        // Print conditions information if available
        ConditionListType conditions = componentStream.getCondition();
        if (conditions != null && !conditions.getCondition().isEmpty()) {
          System.out.println("    Conditions:");
          for (JAXBElement<? extends ConditionType> conditionElement : conditions.getCondition()) {
            ConditionType condition = conditionElement.getValue();
            System.out.println("      Type: " + conditionElement.getName().getLocalPart());
            System.out.println("      Name: " + condition.getName());
            System.out.println("      Value: " + condition.getValue());
            System.out.println("      Timestamp: " + condition.getTimestamp());
            System.out.println("      Sequence: " + condition.getSequence());
            System.out.println("      -----");
          }
        }

        System.out.println("  -----");
      }
      System.out.println("-----");
    }
    System.out.println("==============================");
  }
}
