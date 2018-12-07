package kata.Root;

public class Driver {

	private String name;
	private boolean registered;
	
	public Driver(String name, boolean registeredDriver) {
		this.name = name;    
		this.registered = registeredDriver;
	}
	
	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) { // revisit
		this.registered = registered;
	}

	public String getName() {
		return name;
	}

	public void setName(String[] driverFields) {
		this.name = driverFields[1];
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
