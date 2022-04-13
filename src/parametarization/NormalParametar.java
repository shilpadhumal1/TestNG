package parametarization;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NormalParametar 
{
	@Test
	@Parameters("browser")
	public void testcase1(int a)
	{
		System.out.println(a);
		Reporter.log("pass", true);
		
	}
	@Test
	@Parameters({"browser","version"})
	public void testcase2(int c,int d)
	{
		System.out.println(c+" "+d);
		Reporter.log("pass", true);		
	}
	

}
