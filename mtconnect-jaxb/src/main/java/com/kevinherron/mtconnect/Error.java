package com.kevinherron.mtconnect;

import org.mtconnect.v20.error.ErrorType;
import org.mtconnect.v20.error.ErrorsType;
import org.mtconnect.v20.error.MTConnectErrorType;

public class Error {

  public static void printError(MTConnectErrorType error) {
    // Print information from HeaderType
    System.out.println("\n--- Error Header Information ---");
    org.mtconnect.v20.error.HeaderType errorHeaderType = error.getHeader();
    System.out.println("Version: " + errorHeaderType.getVersion());
    System.out.println("Creation Time: " + errorHeaderType.getCreationTime());
    System.out.println("Instance ID: " + errorHeaderType.getInstanceId());
    System.out.println("Sender: " + errorHeaderType.getSender());
    System.out.println("Buffer Size: " + errorHeaderType.getBufferSize());
    System.out.println("Test Indicator: " + errorHeaderType.isTestIndicator());

    // Print information from ErrorType if present
    if (error.getError() != null) {
      System.out.println("\n--- Error Information ---");
      ErrorType errorType = error.getError();
      System.out.println("Error Code: " + errorType.getErrorCode());
      System.out.println("Error Description: " + errorType.getValue());
    }

    // Print information from ErrorsType if present
    if (error.getErrors() != null && !error.getErrors().getError().isEmpty()) {
      System.out.println("\n--- Multiple Errors Information ---");
      ErrorsType errorsType = error.getErrors();
      int errorCount = 1;
      for (ErrorType errorType : errorsType.getError()) {
        System.out.println("\nError #" + errorCount++);
        System.out.println("Error Code: " + errorType.getErrorCode());
        System.out.println("Error Description: " + errorType.getValue());
      }
    }
  }
}
