package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcases started and details are "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Testcases success and details are "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcases failed and details are "+ result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcases skipped and details are "+ result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Testcases started and details are "+ result.getName());
		
	}

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Testcases finished and details are "+ result.getName());
		
	}

}
