package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdowntwo {
	WebDriver driver;
	public void SetUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void setvalueByIndex(WebElement element, int indexvalue) {
		Select select =new Select(element);
		select.selectByIndex(indexvalue);
	}
	public void setvalueByIndex(WebElement element, int indexvalue, String visibletext) {
		Select select=new Select(element);
		if (select.isMultiple()) {
		select.selectByIndex(indexvalue);
		select.selectByVisibleText(visibletext);
		}
		else {
			select.selectByVisibleText(visibletext);
		}
	}
	public void closebrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		Multidropdowntwo obj=new Multidropdowntwo();
		obj.SetUp();
		obj.launchUrl("https://letcode.in/dropdowns");
		WebElement prasad=obj.driver.findElement(By.id("superheros"));
		obj.setvalueByIndex(prasad, 1, "Black Panther");
		obj.setvalueByIndex(prasad, 0, "Daredevil");
		obj.setvalueByIndex(prasad, 3, "prasad");
		obj.closebrowser();

	}

}
