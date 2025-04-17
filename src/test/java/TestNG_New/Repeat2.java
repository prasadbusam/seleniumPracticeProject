package TestNG_New;

import org.testng.annotations.Test;

public class Repeat2 {
	@Test(invocationCount=3)
	public void paper() {
		System.out.println("This is tree");
	}

}
