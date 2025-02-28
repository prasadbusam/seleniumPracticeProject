package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousetest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(3000);
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(3000);
		WebElement mouseoverbtn=driver.findElement(By.xpath("(//button[normalize-space()='Mouse Hover'])[1]"));
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(mouseoverbtn).perform();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[normalize-space()='Top']")).click();
		Thread.sleep(8000);
		driver.quit();

	}

}
