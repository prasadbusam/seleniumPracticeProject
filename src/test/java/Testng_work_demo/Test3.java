package Testng_work_demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver=null;
	@Test(priority=0, invocationTimeOut = 3000)
	public void testnop() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.nopcommerce.com/");
		//@FindBy(xpath="//*[@placeholder='Search store']")
				WebElement Searchstore;
		//System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test(priority=1)
	public void testmail() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
