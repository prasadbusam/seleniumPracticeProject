package TestNG_New;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice_web {
	WebDriver driver;
	JavascriptExecutor js;
	ChromeOptions options;

	@BeforeTest()
	public void SetUp() {
		options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://practice.expandtesting.com/");
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700);");

	}

	@Test
	public void webinputs() throws InterruptedException {
		WebElement ele1 = driver.findElement(By.xpath("(//*[@href='/inputs'])[2]"));
		js.executeScript("arguments[0].click();", ele1);
//			driver.findElement(By.xpath("//div[@id='dismiss-button']//span")).click();

		try {

			WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
			closeButton.click();
			System.out.println("Popup closed successfully.");
		} catch (Exception e) {
			WebElement ele = driver.findElement(By.xpath("//*[@name='input-number']"));
			js.executeScript("arguments[0].value='44';", ele);
			driver.findElement(By.xpath("//*[@name='input-text']")).sendKeys("Prasad");
			driver.findElement(By.xpath("//*[@name='input-password']")).sendKeys("Prasad@123");
			driver.findElement(By.xpath("//*[@name='input-date']")).click();
		}

	}

}
