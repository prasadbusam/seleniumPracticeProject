package seleniumproject.seleniumproject;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.letskodeit.com/practice");
		//driver.findElement(By.id("user-name")).sendKeys("prasad");
		//driver.findElement(By.id("password")).sendKeys("prasad@12");
		//driver.findElement(By.id("login-button")).click();
		File scr=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);                            //user.dir it will get the current location dynamically
		File targetfile =new File(System.getProperty("user.dir")+"\\seleniumproject\\Screenshots_file\\fullpage1.jpg");
		Thread.sleep(3000);
		scr.renameTo(targetfile);

	}

}
