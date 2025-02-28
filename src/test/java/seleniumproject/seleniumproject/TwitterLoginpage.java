package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.MemberSubstitution.Current;

public class TwitterLoginpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://x.com/i/flow/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("username")).sendKeys("prasadbusam1996");
		Thread.sleep(3000);
		driver.findElement(By.xpath("password")).sendKeys("Prasad@123");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("LoginForm_Login_Button")).click();
		//Thread.sleep(3000);
		driver.quit();
		
		

	}

}
