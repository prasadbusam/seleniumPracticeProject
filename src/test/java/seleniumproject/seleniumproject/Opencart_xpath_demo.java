package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Opencart_xpath_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys("TShirts");
		//driver.findElement(By.xpath("//*[@placeholder='Search'][@name='search']")).sendKeys("TShirts"); //multiple attributes
		//driver.findElement(By.xpath("//*[@placeholder='Search' and @name='search']")).sendKeys("TShirts");
		//driver.findElement(By.xpath("//*[@placeholder='Search' or @name='search']")).sendKeys("TShirts");
		//driver.findElement(By.xpath("//*[@class='fa-solid fa-magnifying-glass']")).click();
		//Thread.sleep(3000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//Thread.sleep(3000);
        //js.executeScript("window.scrollBy(0, 500);");
        //Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		//driver.findElement(By.xpath("//*[text()='Components']")).click();
		//driver.findElement(By.xpath("//*[text()='Monitors (2)']")).click();
		//boolean display=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		//System.out.println(display);
		
		
		
         
	}

}
