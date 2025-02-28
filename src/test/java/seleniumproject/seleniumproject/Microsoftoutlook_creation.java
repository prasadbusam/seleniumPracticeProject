package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Microsoftoutlook_creation {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://signup.live.com/signup?lcid=1033&wa=wsignin1.0&rpsnv=168&ct=1735276797&rver=7.5.2211.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26signup%3d1%26cobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26RpsCsrfState%3dcb4231c5-5293-3e83-211d-6adb5404bab8&id=292841&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c&lic=1&uaid=96de0d7ebbca47dea253e6af4d4cc4e4");
		//driver.findElement(By.xpath("(//span[@class='btn__text']) [10]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='usernameInput']")).sendKeys("prasadbusam444");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Prasad@123");
		driver.findElement(By.xpath("//button[@id='nextButton']")).click();
		driver.findElement(By.id("firstNameInput")).sendKeys("Prasad");
		Thread.sleep(3000);
		driver.findElement(By.id("lastNameInput")).sendKeys("Busam");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Select select=new Select(driver.findElement(By.xpath("//select[@id='countryRegionDropdown']")));
		select.selectByVisibleText("India");
		Select select1=new Select(driver.findElement(By.xpath("//select[@aria-label='Birth month']")));
		select1.selectByIndex(10);
		Select select2=new Select(driver.findElement(By.xpath("//select[@aria-label='Birth day']")));
		select2.selectByIndex(15);
		driver.findElement(By.xpath("//input[@id='BirthYear']")).sendKeys("1996");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
		
	
		
		
		
				
		
		
		
		  /*driver.findElement(By.xpath("//button[@type='submit']")).click();
		  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Prasad@123"
		  ); driver.findElement(By.id("nextButton")).click();
		 * driver.findElement(By.id("firstNameInput")).sendKeys("Prasad");
		 * driver.findElement(By.id("lastNameInput")).sendKeys("Busam");
		 * driver.findElement(By.xpath("//button[@type='submit']")).click(); Select
		 * select=new
		 * Select(driver.findElement(By.xpath("//select[@id='countryRegionDropdown']")))
		 * ; select.selectByVisibleText("India"); Select select2=new
		 * Select(driver.findElement(By.xpath("//select[@aria-label='Birth month']")));
		 * select2.selectByIndex(10); Select select3=new
		 * Select(driver.findElement(By.xpath("//select[@aria-label='Birth day']")));
		 * select2.selectByIndex(15); Select selec4=new
		 * Select(driver.findElement(By.xpath("//input[@id='BirthYear']")));
		 * select2.selectByVisibleText("1996");
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		 
		
				
		

	}

}
