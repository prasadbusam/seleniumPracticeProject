package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.letskodeit.com/practice");
		//driver.findElement(By.id("alertbtn")).click();
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(5000);
		Alert alert =driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.dismiss();
		Thread.sleep(5000);
		driver.quit();

	}

}
