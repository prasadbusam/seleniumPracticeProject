package seleniumproject.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselection2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://letcode.in/dropdowns");
		Select select=new Select(driver.findElement(By.id("superheros")));
		select.selectByIndex(1);
		select.selectByValue("am");
		select.selectByVisibleText("Batman");
		List<WebElement> option =select.getAllSelectedOptions();
		for(WebElement options:option) {
			System.out.println(options.getTagName());
			System.out.println(options.getText());
			System.out.println(options.getAttribute("value"));
		}

	}

}
