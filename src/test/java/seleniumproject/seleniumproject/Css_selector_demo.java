package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.nopcommerce.com/");
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("electronics");
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("electronics");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		

	}

}
