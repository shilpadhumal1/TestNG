package keyword;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount
{
	//if we to execute particular test case multiple times we should use invocation count
	//applicable only for @Test
	@Test(invocationCount=5)
	public void count5()
	{
		Reporter.log("excute 5 times", true);
	}
}
