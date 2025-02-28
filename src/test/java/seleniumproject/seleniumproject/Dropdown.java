package seleniumproject.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(3000);
		driver.get("https://letcode.in/dropdowns");
		WebElement fruitsdropdown =driver.findElement(By.id("fruits"));
		Thread.sleep(3000);
		Select select = new Select(fruitsdropdown);
		Thread.sleep(5000);
		//select.selectByIndex(1);
		//Thread.sleep(6000);
		//select.selectByVisibleText("Mango");
		//Thread.sleep(6000);
		List<WebElement> options =select.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		Thread.sleep(6000);
		driver.quit();
		

	}

}
