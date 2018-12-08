package kata.Root;

import java.text.ParseException;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main( String[] args ) throws ParseException {
        Trip trip = new Trip("Matt", "07:15", "07:45", 30);
         
		System.out.println(trip.getAvgSpeed());
  
	
	}
    
    
}

//Driver registeredDriver;
//
//public void registerDriver (String[] driverFields) {
//	if (driverFields[0].contentEquals("Driver")) {		
//		registeredDriver.setName(driverFields[1]);
//	}		
//}