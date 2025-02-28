package Day43;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {
	@Test
	public void asd() {
		System.out.println("This is asd from c3");
	}
	@BeforeSuite
	public void qwe() {
		System.out.println("This is Before suite method");
	}
	@AfterSuite
	public void zxc() {
		System.out.println("This is after suite method");
	}

}
