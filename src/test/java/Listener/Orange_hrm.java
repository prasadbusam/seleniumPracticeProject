package Listener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.Mylistener.class)

public class Orange_hrm {
	WebDriver driver;
	@BeforeClass
	public void Seup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void Testlogo() throws InterruptedException {
		boolean logo=driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
		Thread.sleep(3000);
		Assert.assertEquals(logo, true);
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void Testurl() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void TestHomepageTitle() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		Thread.sleep(3000);
	}
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
