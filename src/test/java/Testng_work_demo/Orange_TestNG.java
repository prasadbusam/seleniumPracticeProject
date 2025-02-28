package Testng_work_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange_TestNG {
	WebDriver driver=null;
	
	@Test(priority=1)
	public void openapp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=2)
	public void Testlogo() throws InterruptedException {
		Thread.sleep(4000);
		boolean status=driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo displayed :"+status);
	}
	
	@Test(priority=3)
	public void Testlogin() {
		//driver.findElement(By.xpath("//*[@placeholder='Benutzername']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//*[@placeholder='Passwort']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}
	
	@Test(priority=4)
	public void Testclose() {
		driver.quit();
	}

}
