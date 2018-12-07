package kata.Root;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegisterDriverTest {
	
	Driver driver;
	
	@Before
	public void setup() {
		driver = new Driver("Matt", true);
	}
	//establishes mock driver object
	
	@Test
	public void VerifyDriverIsRegistered() {
		driver.getName();
		driver.isRegistered();
		Assert.assertEquals("Matt", driver.getName());
		Assert.assertTrue(driver.isRegistered());
	}
	//tests register command for driver
}
