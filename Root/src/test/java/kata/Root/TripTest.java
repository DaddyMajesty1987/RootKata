package kata.Root;

import java.text.ParseException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TripTest {
	
	Trip trip;
	
	@Before
	public void setup() throws ParseException {
		trip = new Trip("07:15", "07:45", 30.5);
//		trip.setStartTrip("07:15");
//		trip.setEndTrip("07:45");
//		trip.setDistanceTraveled("30.5");
	}
	//establishes mock trip object.
	
	@Test
	public void VerifyTripIsCreated() {
		
		Assert.assertEquals("07:15", trip.getStartTrip());
		Assert.assertEquals("07:45", trip.getEndTrip());
		Assert.assertEquals(30.5, trip.getDistanceTraveled(), 2);
	}
	//tests set properties of given trip.
}//LocalTime t = LocalTime.parse( "17:40" ) ;

