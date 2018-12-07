package kata.Root;

import java.sql.Time;

public class Trip {
	
	Driver name;		  // driverFields[1]
	Time startTrip;		  // driverFields[2]
	Time endTrip;		  // driverFields[3]
	Float avgMilesDriven; // driverFields[4]
	

//	public void getTripData () {
//		if (driverFields[0].contentEquals("Trip")) {
//			trip.setName();
//		}
//	}
	
	public Driver getName() {
		return name;
	}
	public void setName(Driver name) {
		this.name = name;
	}
	public Time getStartTrip() {
		return startTrip;
	}
	public void setStartTrip(String[] driverFields) {
		this.startTrip = Time.valueOf(driverFields[2]);
	}
	public Time getEndTrip() {
		return endTrip;
	}
	public void setEndTrip(String[] driverFields) {
		this.endTrip = Time.valueOf(driverFields[3]);
	}
	public Float getAvgMilesDriven() {
		return avgMilesDriven;
	}
	public void setAvgMilesDriven(String[] driverFields) {
		this.avgMilesDriven = Float.parseFloat(driverFields[4]);
	}
	
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