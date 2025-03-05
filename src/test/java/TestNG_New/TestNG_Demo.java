package TestNG_New;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Demo {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en-gb.facebook.com/login/web/");
	}
	
	
	@Test(priority=1)
	public void verifyfacebookisworking() {
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("prasadbusam1996@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Prasad@123");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
	}
	
	
	@Test(priority=2)
	public void verifygoogleisworking() {
		
		driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
		
	}
	@AfterMethod()
	public void teardown() {
		driver.quit();
	}

}
