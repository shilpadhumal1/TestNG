package keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnGroups
{
	@Test(groups="sanity")
	public void sanity1()
	{
		Reporter.log("test case from sanity group",true);
	}
	@Test(groups="sanity")
	public void sanity2()
	{
		Reporter.log("test case from sanity group",true);
	}
	@Test(groups="regrassion")
	public void regrassion1()
	{
		Reporter.log("test case from regrassion group",true);
	}
	@Test(groups= {"sanity","regrassion"})
	public void sanityregra()
	{
		Reporter.log("test case from sanity and regrassion");
	}

}
