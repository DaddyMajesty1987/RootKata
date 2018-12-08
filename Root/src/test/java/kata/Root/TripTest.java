package kata.Root;

import java.text.ParseException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TripTest {
	
	Trip testTrip;
	
	@Before
	public void setup() throws ParseException {
		testTrip = new Trip("Matt", "07:15", "07:45", 30);
	}
	//establishes mock trip object.
	
	@Test
	public void VerifyGetAvgSpeed() throws ParseException {
		testTrip.getDistanceTraveled();
		Assert.assertEquals(60.0, testTrip.getAvgSpeed(), 2);
	}
}//LocalTime t = LocalTime.parse( "17:40" ) ;

