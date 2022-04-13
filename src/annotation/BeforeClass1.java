package annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeClass1 
{
	@BeforeClass
	public void beforeClass()
	{
		
		Reporter.log("Beforeclass Method", true);
		Reporter.log("Beforeclass Method", true);
	}
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("BeforeMethod Method", true);
	}
	@Test
	public void testcase1()
	{
		Reporter.log("test case 1", true);
		
		
	}
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("After Method", true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("After class", true);
	}

}
