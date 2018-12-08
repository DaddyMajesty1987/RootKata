package kata.Root;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DriverInput {

	private String[] dataInput() throws FileNotFoundException {
		
		File itemFile = new File("driverData.csv");	
		Scanner itemInfo = new Scanner(itemFile);
		String[] driverFields = null;
		while (itemInfo.hasNextLine()) {
			String line = itemInfo.nextLine();
			driverFields = line.split(" ");
		}
		return driverFields;	
	}
	/* I chose to make this method private due to only this class 
	 * needs to utilize this method.	
	 * 
	 * Method pulling in a file and delimiting via spaces and 
	 * populating an array(driverFields[]), so I can separate and 
	 * use the information provided.
	 * 
	 * I chose to delimit via spaces given the format of the 
	 * example input given in the instructions. */
	
	public void configureDriverData(String[] driverFields) {
		
		if (driverFields[0].contentEquals("Driver")) {
			Driver driver = new Driver();
			driver.setName(driverFields[1]);
			driver.setRegistered(true);
		}
		else if(driverFields[0].contentEquals("Trip")) {
			Trip trip = new Trip();
			trip.setStartTrip(driverFields[2]);
			trip.setEndTrip(driverFields[3]);
			trip.setDistanceTraveled(driverFields[4]);
		}
	}
	/* Per instructions, if "Driver" comes before a name in 
	 * the input file, then the command or status of the person
	 * being registered is true.
	 * if "Trip" is detected then a trip object is created.
	 */
	public void createTrip(String[] driverFields) {
		
	}
	
	

	//Example input:
	//
	//Driver Dan
	//Driver Alex
	//Driver Bob
	//Trip Dan 07:15 07:45 17.3
	//Trip Dan 06:12 06:32 21.8
	//Trip Alex 12:01 13:16 42.0
	//Expected output:
	//
	//Alex: 42 miles @ 34 mph
	//Dan: 39 miles @ 47 mph
	//Bob: 0 miles
}
