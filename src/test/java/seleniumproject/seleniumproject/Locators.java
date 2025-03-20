package seleniumproject.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.nopcommerce.com/");
		//driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.partialLinkText("Reg")).click();
		List<WebElement>links =driver.findElements(By.tagName("a"));
		System.out.println("Total number of header links :"+links.size());
	}

}
