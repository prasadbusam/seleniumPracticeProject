package seleniumproject.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentivationhandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(4000);
		driver.get("https://jitendra:jitendraas@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		List<WebElement> condition = driver.findElements(By.tagName("h3"));
		//System.out.println(ByTagName.s);
		if (condition.size()<=0) {  //authentication pass eventhough i passed tagsize <0 so this is my doubt 
			Thread.sleep(3000);
			System.out.println("Authentication successfully handled");
		} else {
			System.out.println("Authentication failed");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
