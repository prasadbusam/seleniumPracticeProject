package Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Param_demo {
	WebDriver driver=null;
	@BeforeClass
	public void setup(){
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
		@Test(priority=1)
		public void testlogo() {
			boolean logo=driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
			Assert.assertEquals(logo, true);
		}
		@Test(priority=2)
		public void testTitle() {
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		}
		@Test(priority=3)
		public void testURL() {
			Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}
	}


