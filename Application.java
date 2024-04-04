System.out.println("Created schedule...");
        
        // 5. Start the schedule
        
        // Create object key for schedule name
        ObjectKey objectKey = new ObjectKey();
        AdminKeyPair keyPair = new AdminKeyPair();
        keyPair.setKeyName( "name" ); // schedules identified by name
        keyPair.setKeyValue( "schedule1" ); // schedule name
        objectKey.getAdminKeyPairs().add( keyPair );
        
        adminPort.start(
          "schedule",
          objectKey,
          null,
          null,
          credentials,
          null,
          null,
          "en"
Code changes for feature2.2 by Developer Teja for Axis bank Application
atch (Throwable t)
    {
      System.out.println("Caught unexpected run-time exception");
      System.out.println("  message    = " + t.getMessage() );
      System.out.println("  stackTrace = " );
      t.printStackTrace( System.out );
end of feature2.2
        );