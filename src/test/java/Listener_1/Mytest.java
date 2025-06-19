package Listener_1;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Mytest extends SetUp {
	@BeforeMethod
	public void test1() {
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.get("https://practice.expandtesting.com/login");
}
	
	@Test
	public void orange() throws InterruptedException {
		WebElement username=driver.findElement(By.cssSelector("[name='username']"));
		Thread.sleep(3000);
		username.sendKeys("Admin");
		Thread.sleep(3000);
		String exp="Admin";
		Thread.sleep(3000);
		Assert.assertEquals(username.getAttribute("value"), "Admin");
		WebElement password=driver.findElement(By.cssSelector("[name='password']"));
		Thread.sleep(3000);
		password.sendKeys("admin123");
		Thread.sleep(3000);
		String exp1="admin123";
		Thread.sleep(3000);
		Assert.assertEquals(password.getAttribute("value"), "admin123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("//*[@type='submit']")).click();
		Thread.sleep(3000);
	}
	
	@Test
	public void practice() throws InterruptedException {
		WebElement name=driver.findElement(By.cssSelector("[name='username']"));
		Thread.sleep(3000);
		name.sendKeys("practice");
		Thread.sleep(3000);
		String exp2="practice";
		Thread.sleep(3000);
		Assert.assertEquals(name.getAttribute("value"), "practice");
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.cssSelector("[name='password']"));
		Thread.sleep(3000);
		pass.sendKeys("SuperSecretPassword!");
		Thread.sleep(3000);
		String exp3="SuperSecretPassword!";
		Thread.sleep(3000);
		Assert.assertEquals(pass.getAttribute("value"), "SuperSecretPassword!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(3000);
   }
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
}
