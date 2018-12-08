package kata.Root;

public class Driver {
	
	private Trip trip = new Trip();
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
