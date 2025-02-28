package Day43;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	@Test
	public void abc() {
		System.out.println("This is abc frm c1");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("This is Before test method");
	}

}
