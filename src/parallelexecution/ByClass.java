package parallelexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ByClass 
{
	@Test
	public void testcase3()
	{
		Reporter.log("test case3 from byclass ", true);
	}
	@Test
	public void testcase4()
	{
		Reporter.log("testcase4 from byclass", true);
	}
	

}
