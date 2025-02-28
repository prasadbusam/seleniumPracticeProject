package seleniumproject.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Githubfindelements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://github.com/login");
		List<WebElement>alllinks =driver.findElements(By.tagName("a"));
		for(WebElement links:alllinks) {
			String url =links.getAttribute("href");
			System.out.println(url);
		}
		driver.quit();
		

	}

}
