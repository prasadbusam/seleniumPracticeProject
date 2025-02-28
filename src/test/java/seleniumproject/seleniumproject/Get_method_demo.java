package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method_demo {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    //System.out.println(driver.getPageSource());
	   String windowid=driver.getWindowHandle();
	   System.out.println("Window id:" +windowid);
	   Thread.sleep(3000);
	   boolean status=driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
	   Thread.sleep(3000);
	   System.out.println("Display status:"+status);
	   Thread.sleep(3000);
	   boolean data=driver.findElement(By.xpath("//*[@placeholder='Username']")).isEnabled();
	   Thread.sleep(3000);
	   System.out.println("Enable status:"+data);
	   driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("admin123");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

}
