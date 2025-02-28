package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_tabledemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#taskTable"));
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2200);");
        Thread.sleep(4000);
        WebElement memory=driver.findElement(By.xpath(String.format("//*[@id='taskTable']//tr/td[text()='%s']/following-sibling::td[last()]", "Chrome")));
        Thread.sleep(4000);
        System.out.println(memory.getText());
        driver.quit();

	}

}
