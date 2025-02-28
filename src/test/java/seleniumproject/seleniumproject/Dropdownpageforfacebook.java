package seleniumproject.seleniumproject;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpageforfacebook {
	WebDriver driver = null;

	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public void launchApp(String url) {
		driver.get(url);
	}

	public void username() {
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Prasad");
		driver.findElement(By.xpath("u_0_a_RU")).sendKeys("Busam");

	}

	/*
	 * public void SetvalueByvisibleText(WebElement element, String
	 * visibletextString) { Select select = new Select(element);
	 * select.selectByVisibleText(visibletextString);
	 * 
	 * }
	 */

	public void SetvalueByindex(WebElement element, int indexvalue) {
		Select select = new Select(element);
		select.selectByIndex(indexvalue);

	}
	public void selectByvisibletext(WebElement element, String visibletext) {
		Select select =new Select(element);
		select.selectByVisibleText(visibletext);
	}

	/*
	 * public void SetvalueByindex1(WebElement element, int indexvalue) { Select
	 * select = new Select(element); select.selectByIndex(indexvalue); }
	 */

	/*public void closebroser() {
		
		driver.quit();
	}*/

	public static void main(String[] args) {
		Dropdownpageforfacebook obj = new Dropdownpageforfacebook();
		obj.setUp();
		obj.launchApp("https://en-gb.facebook.com/reg/");
		WebElement Day = obj.driver.findElement(By.id("day"));
		WebElement Month = obj.driver.findElement(By.name("birthday_month"));
		WebElement Year = obj.driver.findElement(By.name("birthday_year"));
		WebElement Radiobutton=obj.driver.findElement(By.xpath("_58mt"));
		// obj.SetvalueByvisibleText(car, "BMW");
		obj.SetvalueByindex(Day, 15);
		obj.SetvalueByindex(Month, 10);
		obj.SetvalueByindex(Year, 9);

		//obj.closebroser();

	}

}
