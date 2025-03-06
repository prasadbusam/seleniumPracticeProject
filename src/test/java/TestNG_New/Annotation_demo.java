package TestNG_New;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_demo {
	@BeforeSuite()
	public void beforesuite() {
		System.out.println("This is before suite");
	}
	@BeforeClass()
	public void beforeclass1(){
		System.out.println("This is before class");
	}
	@BeforeTest // it will be execute only once
	public void Beforedemo1() {
		System.out.println("Open the chrome browser");
	}
	@BeforeMethod()
	public void Beforemethod1() {
		System.out.println("set up the common data");
	}
	@Test(invocationCount=3)//it will be executing this method multiple times 
	public void test1() {
		System.out.println("Take screen shot for the method");
		System.out.println("this is test1");
	}
	@Test(groups="smoke")
	public void smoke() {
		System.out.println("this is smoke");
		int c=5/0;
	}
	@Test(groups="regression",invocationTimeOut=2000)
	public void regression() throws InterruptedException {
		System.out.println("this is regression");
		Thread.sleep(3000);
	}
	@Test(enabled=false)
	public void test2() {
		System.out.println("Take screen shot for the method");
		System.out.println("this is test2");
	}
	@AfterMethod()
	public void After() {
		System.out.println("this is Aftermethod");
	}
	@AfterTest
	public void afterdemo() {
		System.out.println("close the browser");
	}
	@AfterClass()
	public void afterclass1(){
		System.out.println("This is after class");
	}
	@AfterSuite()
	public void aftersuite() {
		System.out.println("This is after suite");
	}

}
