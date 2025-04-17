package TestNG_New;

import org.testng.annotations.Test;

public class Time1 {
	@Test(invocationTimeOut=6000)
	public void sample() {
		System.out.println("This is invocationTimeOut attribute");
	}
	
	@Test(dependsOnMethods="sample")
	public void product() {
		System.out.println("This product is belongs to sample");
	}
	
	@Test(enabled=true)
	public void shampoo() {
		System.out.println("This is shampoo");
	}

}


