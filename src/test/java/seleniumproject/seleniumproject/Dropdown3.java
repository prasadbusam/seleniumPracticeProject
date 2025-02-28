package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.letskodeit.com/practice");
		WebElement multiple=driver.findElement(By.xpath("(//select[@id='multiple-select-example'])[1]"));
		Select select=new Select(multiple);
		//select.selectByValue("apple");
		//select.selectByIndex(2);
		if(select.isMultiple()) {
			System.out.println("test pass");
		select.selectByValue("apple");
		select.selectByIndex(2);
		}
		else {
			System.out.println("test fail");
			select.selectByIndex(1);
		}
		driver.quit();

	}

}
