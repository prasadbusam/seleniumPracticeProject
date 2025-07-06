package Wait_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity_wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Username']")));
		username.sendKeys("Admin");
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Password']")));
		password.sendKeys("admin123");
		WebElement login=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']")));
		login.click();
		

	}

}
