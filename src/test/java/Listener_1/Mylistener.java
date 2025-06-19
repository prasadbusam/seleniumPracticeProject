package Listener_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener extends SetUp implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test pass");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
		tkScreenshot();
		
		
	}

	public void tkScreenshot() {
		//convert the driver into takescreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		//call get screenshot method
		File file=ts.getScreenshotAs(OutputType.FILE);
		//fileutils.copyfile, source, destination
		try {
			FileUtils.copyFile(file, new File("./Screenshots/scrn1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
