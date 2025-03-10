package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener {
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test execution is started.......");//This method execute only one time before starting all the methods 
	}

	@Override
	public void onTestStart(ITestResult result) { // pre defined methods getting from the itestlistener... result is a
													// variable
		System.out.println("Test started.............."); // this method execute multiple times before starting every method

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed.........");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed........");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped......");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test execution is completed......");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

}
