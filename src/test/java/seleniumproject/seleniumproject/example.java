package seleniumproject.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
			driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Busam");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Prasad");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@placeholder='E-Mail']")).sendKeys("prasadbusam1996@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@placeholder='Telephone']")).sendKeys("995156294");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Prasad@123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@placeholder='Password Confirm']")).sendKeys("Prasad@123");
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@class='radio-inline' and text()='Yes']/input")));
			js.executeScript("arguments[0].scrollIntoView(true);", radioButton);
			radioButton.click();
			//System.out.println("Error");
			driver.findElement(By.xpath("//*[@name='agree']")).click();
			WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='Continue']")));
			continueButton.click();
			driver.quit();
		}
	
}



		
	


