package keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	@Test(groups="sanity")
	public void sanity11()
	{
		Reporter.log("test case from sanity group",true);
	}
	@Test(groups="sanity")
	public void sanity12()
	{
		Reporter.log("test case from sanity group",true);
	}
	@Test(groups="regrassion")
	public void regrassion13()
	{
		Reporter.log("test case from regrassion group",true);
	}
	@Test(groups= {"sanity","regrassion"})
	public void sanityregra14()
	{
		Reporter.log("test case from sanity and regrassion");
	}

}
