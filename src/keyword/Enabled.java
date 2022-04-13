package keyword;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Enabled 
{
	//If we want disable particular test case from an execution process then we can write enabled= false
	//we can use this keyword for any annotation
	@BeforeSuite(enabled= true)
	public void beforeMethod()
	{
		Reporter.log("Before method is disabled", true);
	}
	@Test(enabled= true)
	public void enabled()
	{
		Reporter.log("Enabled Method", true);
	}
	@Test(enabled=false)
	public void disabled()
	{
		Reporter.log("Disabled Method", true);
	}

}
