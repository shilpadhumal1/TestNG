package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;


//ITestListner is an interface class
//as per our test case pass or fail we can add some code or some operation for that perticular test case
public class ListnersClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starting of test"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case is pass"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case is fail"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case is skipped"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("starting the process: "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("finishing of process: "+context.getName());
		
	}

}
