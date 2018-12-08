package kata.Root;

import java.util.ArrayList;

public class Driver {
	
	private ArrayList<Trip> trips = new ArrayList<Trip>();
	
/* attributes the trip data to the name 
   of the driver who is registered.
*/	
	private String name;
	private boolean registered;
	
	protected boolean isRegistered() {
		return registered;
	}

	protected void setRegistered(boolean registered) { // revisit
		this.registered = registered;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
}

