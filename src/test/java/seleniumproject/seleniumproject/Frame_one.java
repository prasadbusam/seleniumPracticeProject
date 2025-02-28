package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_one {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Testeng");
		driver.findElement(By.name("lname")).sendKeys("test");
		driver.switchTo().defaultContent();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0, 500);");
        WebElement frame1 =driver.findElement(By.xpath("iframe[class='has-background-white']"));
        driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("(//input[@name='email'])")).sendKeys("prasadbusam@gmail.com");
		

		//driver.findElement(By.linkText("Log in")).click();

	}

}
