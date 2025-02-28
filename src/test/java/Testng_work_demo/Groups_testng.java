package Testng_work_demo;

import org.testng.annotations.Test;

public class Groups_testng {
	@Test(groups = "Reg")
	public void test() {
		System.out.println("Test Reg");
	}
	@Test(groups = "Reg")
	public void test1() {
		System.out.println("Test Reg");
	}
	@Test(groups = "Wip")
	public void test2() {
		System.out.println("Test 	Wip");
	}
	@Test(groups = "Smoke")
	public void test3() {
		System.out.println("Test Smoke");
	}

}
