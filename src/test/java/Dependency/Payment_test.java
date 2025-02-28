package Dependency;

import org.testng.annotations.Test;

public class Payment_test {
	@Test(priority=1,groups= {"sanity","regression","functional"})
	public void rupees() {
		System.out.println("Payment in rupees");
	}
	@Test(priority=2,groups= {"sanity","regression","functional"})
	public void dollar() {
		System.out.println("Payment in dollar");
	}
	@Test(priority=3,groups= {"sanity","regression","functional"})
	public void eurons() {
		System.out.println("Payment in eurons");
	}

}
