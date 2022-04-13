package parallelexecution;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ByMethod
{
	
	@Test(enabled= false)
	public void testcase1()
	{
		Reporter.log("Test case1 from ByMethod class",true);
		//Assert.fail();
	}
	@Test(dependsOnMethods="testcase1")
	public void testcase2()
	{
		Reporter.log("Test case2 from by method class");
	}

}
