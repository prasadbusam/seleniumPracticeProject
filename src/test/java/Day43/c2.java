package Day43;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class c2 {
	@Test
	public void xyz() {
		System.out.println("This is xyz frm c2");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("This is after test method");
	}

}
