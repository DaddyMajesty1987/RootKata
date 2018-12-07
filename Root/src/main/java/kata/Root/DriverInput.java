package kata.Root;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DriverInput {

	Driver driver = new Driver(null, false);
	
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
	
//	public void registerDriver(String[] driverFields) {
//		if (driverFields[0].contentEquals("Driver")) {
//			driver.;
//		}
//		else {
//			registered = false;
//
//	}
	/* Per instructions, if "Driver" comes before a name in 
	 * the input file, then the command or status of the person
	 * being registered is true.
	 */
	
	
	

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
