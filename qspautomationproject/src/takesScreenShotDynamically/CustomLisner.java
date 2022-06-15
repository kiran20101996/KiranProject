package takesScreenShotDynamically;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomLisner extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
			}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		Reporter.log("test case faile screenshot is taken"+methodName,true);
		failed(methodName);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
			}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

}
