package seleniumproject.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_my_trip_radiobutton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("(//*[text()='Trains'])[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Check PNR Status']")).click();
		driver.findElement(By.xpath("//*[@data-cy='enterPnr']")).sendKeys("4412160511");
		driver.findElement(By.xpath("//*[@data-cy='checkStatusButton']")).click();
		driver.findElement(By.xpath("//*[@class='pnrSprite printIcon appendRight5']")).click();
		SearchContext shadow=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(2000);
		shadow.findElement(By.cssSelector("#background")).click();
		Thread.sleep(2000);
		driver.quit();
		
		//driver.findElement(By.xpath("(//*[@class='outer ']) [2]")).click();
		//driver.findElement(By.xpath("//*[@placeholder='Enter Mobile Number']")).sendKeys("9951156294");
		//driver.findElement(By.xpath("//span[text()='Continue']")).click();

}
}