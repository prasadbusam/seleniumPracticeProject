package Alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		/*driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		*/
		
		/*driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		 */
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("This is prasad");
		Thread.sleep(3000);
		alert.accept();
	}

}
