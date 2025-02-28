package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownReusable2 {

	WebDriver driver;

	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public void launchApp(String url) {
		driver.get(url);
	}

	public void SetvalueByvisibleText(WebElement element, String visibletextString) {
		Select select = new Select(element);
		select.selectByVisibleText(visibletextString);

	}

	public void SetvalueByindex(WebElement element, int indexvalue) {
		Select select = new Select(element);
		select.selectByIndex(indexvalue);

	}

	public void SetvalueByindex1(WebElement element, int indexvalue) {
		Select select = new Select(element);
		select.selectByIndex(indexvalue);
	}

	public void closebroser() {
		driver.quit();
	}

	public static void main(String[] args) {
		DropdownReusable2 obj = new DropdownReusable2();
		obj.setUp();
		obj.launchApp("https://www.letskodeit.com/practice");
		WebElement car = obj.driver.findElement(By.id("carselect"));
		obj.SetvalueByvisibleText(car, "BMW");
		obj.SetvalueByindex(car, 1);
		obj.closebroser();

	}

}
