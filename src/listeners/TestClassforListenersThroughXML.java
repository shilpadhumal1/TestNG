package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClassforListenersThroughXML 
{
	@Test
	public void testcase1()
	{
		Reporter.log("Test case1", true);
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
