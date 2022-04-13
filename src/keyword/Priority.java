package keyword;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Priority 
{
	//pririty is set because we want to excute test case asper importance of test case
	//if priority is low that means that test is v v imp
	//priority is given only to @Test annotations
	//Reporter is class of testng in which log is static method used to take output of perticular testcase in report of testng
	//syso statement as it is java statement hence it  give output only in console but not in report of testng
	@Test(priority=0)
	public void highPriority()
	{
		Reporter.log("high priority test case",true);
	}
	@Test(priority=1)
	public void mediumPriority()
	{
		Reporter.log("medium priority test case",true);
	}
	@Test(priority=2)
	public void lowPriority()
	{
		Reporter.log("low priority test case",true);
	}

}
