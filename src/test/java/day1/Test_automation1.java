package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_automation1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		boolean dis=driver.findElement(By.xpath("//*[text()='Automation Testing Practice']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("logo displayed:"+dis);
		Thread.sleep(2000);
		boolean vis=driver.findElement(By.xpath("//*[text()='For Selenium, Cypress & Playwright']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("mini logo visible:"+vis);
		Thread.sleep(2000);
		boolean ena=driver.findElement(By.xpath("//*[@placeholder='Enter Name']")).isEnabled();
		Thread.sleep(2000);
		System.out.println("field box enabled:"+ena);
		Thread.sleep(2000);
		boolean ena1=driver.findElement(By.xpath("//*[@placeholder='Enter EMail']")).isEnabled();
		Thread.sleep(2000);
		System.out.println(" email field box enabled:"+ena1);
		boolean phone=driver.findElement(By.xpath("//*[@placeholder='Enter Phone']")).isEnabled();
		Thread.sleep(2000);
		System.out.println("phone number field box enabled:"+phone);
		Thread.sleep(2000);
		boolean radio=driver.findElement(By.xpath("(//*[@name='gender'])[1]")).isSelected();
		Thread.sleep(2000);
		System.out.println("Men Radio button is selected:"+radio);
		Thread.sleep(2000);
		boolean radio1=driver.findElement(By.xpath("(//*[@name='gender'])[2]")).isSelected();
		Thread.sleep(2000);
		System.out.println("Female Radio button is selected:"+radio1);
		

	}

}
