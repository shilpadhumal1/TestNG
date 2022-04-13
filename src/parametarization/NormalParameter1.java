package parametarization;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NormalParameter1 
{
	@Test
	@Parameters({"browser","version"})
	public void testcase3(int a,int b)
	{
		System.out.println(a+" "+b);
		Reporter.log("pass", true);
		
	}
	@Test
	@Parameters({"browser","version"})
	public void testcase4(int c,int d)
	{
		System.out.println(c+" "+d);
		Reporter.log("pass", true);		
	}
	//@DataProvider

}
