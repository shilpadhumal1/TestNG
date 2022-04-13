package annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTest1
{
	@BeforeTest
	public void beforeSuite()
	{
		Reporter.log("Befortest Method", true);
	}
	@Test
	public void testcase1()
	{
		Reporter.log("test case 1", true);
	}
	@AfterTest
	public void aftertest()
	{
		Reporter.log("Aftertest Method", true);
	}

}
