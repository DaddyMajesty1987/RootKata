package kata.Root;
import java.text.ParseException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class Trip {
	
	private String name;
	private String startTrip;		
	private String endTrip;	
	private Double distanceTraveled; 
	private LocalTime start;
	private LocalTime stop;
	
	protected Trip(String name, String startTrip, String endTrip, double distance) {
		this.startTrip = startTrip;
		this.endTrip = endTrip;
		this.distanceTraveled = distance;
	}

	protected double getAvgSpeed() throws ParseException {
		start = LocalTime.parse((CharSequence) startTrip);
		stop = LocalTime.parse((CharSequence) endTrip);
		long timeMin = start.until(stop, ChronoUnit.MINUTES);
		double timeHr = (timeMin / (double) 60);
		double speed = distanceTraveled / timeHr;
		return speed;
	}
	protected String getName() {
		return name;
	}
	/////////////trip start time/////////////////
	protected String getStartTrip() {
		return startTrip;
	}
	/////////////////trip end time///////////////
	protected String getEndTrip() {
		return endTrip;
	}
	///////////////Distance traveled////////////
	protected Double getDistanceTraveled() {
		return distanceTraveled;
	}
	protected void setDistanceTraveled(String distance) {
		this.distanceTraveled = Double.parseDouble(distance);
	}
}
/////////////////////First//////////////////////////////////////////// 
/////////////////////////Attempt//////////////////////////////////////
//protected Long getTripLength(Date startTime, Date endTime) {
//long timeDiff = endTime.getTime() - startTime.getTime();
//long tripDuration = timeDiff / (60 * 1000) % 60;
//return tripDuration;
//}//      long diffSeconds = timeDiff / 1000 % 60;

//////////////START TIME//////////////////

//protected Date getStartTime() {
//return startTime;
//}
//protected void setStartTime(String startTrip) throws ParseException {
//DateFormat tripFormatter = new SimpleDateFormat("hh:mm");
//startTime = tripFormatter.parse(startTrip);
//}

///////////////END TIME/////////////////////
//
//protected Date getEndTime() {
//return endTime;
//}
//protected void setEndTime(String endTrip) throws ParseException {
//DateFormat tripFormatter = new SimpleDateFormat("hh:mm");
//endTime = tripFormatter.parse(endTrip);
//}
/* I am keeping this because I believe it prudent to keep my attempt code
* for possible future reference.
*/
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
