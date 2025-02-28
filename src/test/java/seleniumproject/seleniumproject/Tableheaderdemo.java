package seleniumproject.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tableheaderdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1800)", "");
		Thread.sleep(4000);
		//new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[text()='Static Web Table']"))).perform();
	    List<WebElement> headers=driver.findElements(By.xpath("//*[@name='BookTable']//tr[1]/th"));
	    for(WebElement header:headers) {
	    	System.out.println(header.getText());
	    }

	}

}
