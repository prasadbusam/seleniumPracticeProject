package seleniumproject.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iron_spider {

	public static void main(String[] args) {
	        // Set up WebDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://ironspider.ca/forms/dropdowns.htm");
	        WebElement cofee=driver.findElement(By.name("coffee"));
	        Select s=new Select(cofee);
	        List<WebElement> dropdowns = s.getOptions();
	        for (WebElement dropdown : dropdowns) {
	            String text = dropdown.getText(); 
	            System.out.println(text);
	        }
	}
}

	/*public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		List<WebElement> text=driver.findElements(By.tagName("class"));
		for(WebElement alltext:text) {
			String text1 =alltext.getText();
			System.out.println(text1);
			//String text=alltext.getAttribute("class");
		}
	}*/


