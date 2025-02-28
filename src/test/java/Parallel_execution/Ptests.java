package Parallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ptests {
	@Test
	public void test1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.quit();
	}
	@Test
	public void test2()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.quit();
	}
	@Test
	public void test3()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg/");
		driver.quit();
	}
	

}
