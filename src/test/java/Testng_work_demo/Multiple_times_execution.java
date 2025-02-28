package Testng_work_demo;

import org.testng.annotations.Test;

public class Multiple_times_execution {
	@Test(invocationCount=3)
	public void test() {
		System.out.println("This is multiple");
		System.out.println("This is prasad");
		System.out.println("---------");
	}

}
