package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogintest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			String pageurl = driver.getCurrentUrl();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Thread.sleep(2000);
			WebElement usernametextbox = driver.findElement(By.name("email"));
			Thread.sleep(2000);
			usernametextbox.sendKeys("prasadbusam1996@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("pass")).sendKeys("Prasad@123");
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/checkpoint/1501092823525282/?next=https%3A%2F%2Fwww.facebook.com%2F%3Fsk%3Dwelcome%26lsrc%3Dlb#");
			if (pageurl.equals("https://www.facebook.com/")) {
				System.out.println("Test pass");
			} else {
				System.out.println("Test fail");
			}
		} finally {
			driver.quit();
		}

	}

	
}
