package Listener_1;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(retryAnalyzer=MyRtryListener.class)
public class Rtest {
	public void test3() {
		System.out.println("Helo world");
		Assert.assertTrue(false);
	}

}
