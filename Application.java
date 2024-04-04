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
#code changes by developer Charan for Axis Bank on 4th April 2024
System.out.println("Started schedule..."); 
        System.out.println("Waiting 30 seconds to get status...");
        Thread.sleep( 30000 );
 
        // 6. Use object key above to get schedule state
        oo = adminPort.getState(
          "schedule",
          objectKey,
          null, // request all state properties
          credentials,
          null,
          "en"
Need for feature2.1
        );