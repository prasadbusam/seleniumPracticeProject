package Testng_work_demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice_Login {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Methods");
	}

	@BeforeTest
	public void SetUp() {
		System.out.println("Before test");

	}

	@Test
	public void test() {
		System.out.println("Test 1");

	}

	@Test
	public void test1() {
		System.out.println("Test 2");

	}

	@AfterTest
	public void aftertest() {
		System.out.println("After test");
	}

	@AfterMethod
	public void Aftermethod() {
		System.out.println("After method");
	}

}
