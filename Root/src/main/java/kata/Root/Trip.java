package kata.Root;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.sql.Time;
public class Trip {
	
	private String startTrip;		
	private String endTrip;	
	private Double distanceTraveled; 
	private Date startTime;
	private Date endTime;
	
	protected Trip(String startTrip, String endTrip, double distance) {
		this.startTrip = startTrip;
		this.endTrip = endTrip;
		this.distanceTraveled = distance;
	}

	protected double getAvgSpeed() throws ParseException {
		LocalTime start = LocalTime.parse((CharSequence) startTime);
		LocalTime stop = LocalTime.parse((CharSequence) endTime);
		long timeMin = start.until(stop, ChronoUnit.MINUTES);
		double timeHr = (timeMin / (double) 60);
		double speed = distanceTraveled / timeHr;
		return speed;
	}
	
/////////////////////First Attempt//////////////////////////////////////
//	protected Long getTripLength(Date startTime, Date endTime) {
//		long timeDiff = endTime.getTime() - startTime.getTime();
//        long tripDuration = timeDiff / (60 * 1000) % 60;
//        return tripDuration;
//	}//      long diffSeconds = timeDiff / 1000 % 60;
	
	
	
	//////////////START TIME//////////////////
	
//	protected Date getStartTime() {
//		return startTime;
//	}
//	protected void setStartTime(String startTrip) throws ParseException {
//		DateFormat tripFormatter = new SimpleDateFormat("hh:mm");
//		startTime = tripFormatter.parse(startTrip);
//	}
	
	///////////////END TIME/////////////////////
	
//	protected Date getEndTime() {
//		return endTime;
//	}
//	protected void setEndTime(String endTrip) throws ParseException {
//		DateFormat tripFormatter = new SimpleDateFormat("hh:mm");
//		endTime = tripFormatter.parse(endTrip);
//	}
/* I am keeping this because I believe it prudent to keep my attempt code
 * for possible future reference.
 */
	
////////////////////////////////////////////////////////////////////////
	
	protected Double getDistanceTraveled() {
		return distanceTraveled;
	}
	protected void setDistanceTraveled(String distance) {
		this.distanceTraveled = Double.parseDouble(distance);
	}
	/////////////SET trip start time/////////////////
	protected String getStartTrip() {
		return startTrip;
	}
	protected void setStartTrip(String startTrip) {
		this.startTrip = startTrip;
	}
	///////////////////////////////////////
	protected String getEndTrip() {
		return endTrip;
	}
	protected void setEndTrip(String endTrip) {
		this.endTrip = endTrip;
	}
	
	
	
}
//String startTime = "9:00 AM";
//String endTime = "10:00 AM";
//SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
//Date st = formatter.parse(time1);
//Date ed = formatter.parse(time2);
//long timeDiff = ed.getTime() - st.getTime();
//Date diff = new Date(timeDiff);
//System.out.println(formatter.format(diff));
//
//long timeDiff = d2.getTime() - d1.getTime();
//System.out.println((timeDiff / 3600000) + " hour/s " + (timeDiff % 3600000) / 60000 + " minutes");
//Output
//1 hour/s 5 minutes
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