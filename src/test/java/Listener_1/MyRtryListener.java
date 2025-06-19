package Listener_1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRtryListener implements IRetryAnalyzer {
	int count=0;
	int tLimit=3;

	@Override
	public boolean retry(ITestResult result) {
		if(count<tLimit)
			
		{
			count++;
			return true;
		}
				return false;
	}
	

}
