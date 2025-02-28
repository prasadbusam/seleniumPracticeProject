package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ninjas {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Busam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Prasad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='E-Mail']")).sendKeys("prasadbusam1996@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Telephone']")).sendKeys("995156294");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Prasad@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Password Confirm']")).sendKeys("Prasad@123");
		Thread.sleep(4000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement radioButton = driver.findElement(By.xpath("(//*[@type='radio'])[1]"));
		//js.executeScript("arguments[0].scrollIntoView(true);", radioButton);
		//radioButton.click();
		//driver.findElement(By.xpath("(//*[@type='radio'])[1]")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@type='radio'])[1]")));
		//radioButton.click();
		WebElement radioButton = driver.findElement(By.xpath("(//*[@type='radio'])[1]"));
		Thread.sleep(2000);
		if (radioButton.isDisplayed() && radioButton.isEnabled()) {
		    radioButton.click();
		} else {
		    System.out.println("Radio button is not visible or enabled");
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='agree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Continue']")).click();

	}

}

