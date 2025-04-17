package TestNG_New;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	@BeforeMethod
	public void car() {
		System.out.println("This is before method");
	}
	
	@BeforeTest
	public void bike() {
		System.out.println("This is before test");
	}
	
	@Test
	public void honda() {
		System.out.println("This is comfortable car");
	}
	
	@Test
	public void suzuki() {
		System.out.println("This is worst car");
	}
	
	@AfterMethod
	public void drive() {
		System.out.println("This is nice exp");
	}
	
	@AfterTest
	public void last() {
		System.out.println("This is after test ");
	}

}
