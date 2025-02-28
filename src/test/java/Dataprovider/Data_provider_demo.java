package Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.IObject;

public class Data_provider_demo {
	WebDriver driver=null;
	@BeforeClass
	public void Setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@Test(dataProvider="er")
	public void testRegister(String email, String pwd) throws InterruptedException {
		/*driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Busam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Prasad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='E-Mail']")).sendKeys("prasadbusam1996@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Telephone']")).sendKeys("995156294");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Prasad@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Password Confirm']")).sendKeys("Prasad@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='radio'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='agree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='E-Mail Address']")).sendKeys("prasadbusam1996@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Prasad@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Login']")).click();*/
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='E-Mail Address']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		Thread.sleep(2000);
		boolean myacc=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		if(myacc==true) {
			driver.findElement(By.xpath("(//*[@href='https://tutorialsninja.com/demo/index.php?route=account/logout'])[2]")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	@DataProvider(name="er", indices= {2,4,5})
	Object[][] logindata(){
		Object data[][]= {
				{"jitendraprasadbusam@gmail.com", "9705920937"},
				{"syamalaraobusam@gmail.com", "Busam@123"},
				{"isbjp@gmail.com", "Jittu@123"},
				{"syamalaraobusam1975@gmail.com", "Prasad@123"},
				{"prasadbusam1996@gmail.com", "9951156294"},
				{"prasadbusam1996@gmail.com", "Prasad@123"},
		};
		return data;
	}
 

}
