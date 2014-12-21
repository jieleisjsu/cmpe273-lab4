package edu.sjsu.cmpe273.CRDTClient;

public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting cache client...");
        
        CRDTClient crdtClient = new CRDTClient();
        boolean requestStatus = crdtClient.put(1, "a");
        if (requestStatus) {
        	// Successful
        	System.out.println("First write completed. Thread sleeps for 30 seconds...");
        	Thread.sleep(30000);
        	requestStatus = crdtClient.put(1, "b");
        	if (requestStatus) {
        		System.out.println("Second write completed. Thread sleeps for 30 seconds...");
            	Thread.sleep(30000);
            	String value = crdtClient.get(1);
            	System.out.println("GET value "+value);
        	} else {
            	System.out.println("Second write failed...");
        	}
        } else {
        	// Failed
        	System.out.println("First write failed...");
        }
        
        System.out.println("Exiting cache client...");
        
    }

}
