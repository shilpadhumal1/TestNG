package annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeSuit 
{
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("BeforSuite Method", true);
	}
	@Test
	public void testcase1()
	{
		Reporter.log("test case 1", true);
	}
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("AfterSuite Method", true);
	}

}
