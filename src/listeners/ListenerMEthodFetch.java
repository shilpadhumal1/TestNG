package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners (ListnersClass.class)
public class ListenerMEthodFetch 
{
	@Test(priority=1)
	public void testcase1()
	{
		Reporter.log("test case 1", true);
	}
	@Test(priority=2)
	public void testcase2()
	{
		Reporter.log("test case 2", true);
	}
	@Test(priority=3)
	public void testcase3()
	{
		Reporter.log("test case 3", true);
		Assert.fail();
	}
	@Test(priority=4,dependsOnMethods="testcase3")
	public void testcase4()
	{
		Reporter.log("test case 4", true);
	}
}
