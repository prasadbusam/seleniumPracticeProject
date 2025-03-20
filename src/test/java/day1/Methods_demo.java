package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println("Get URL of the application:"+url);
		String Title=driver.getTitle();
		System.out.println("Get the Title of the application:"+Title);
		Thread.sleep(2000);
		boolean logo=driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("Logo displayed:"+logo);
		Thread.sleep(2000);
		boolean symbol=driver.findElement(By.xpath("(//*[@alt='orangehrm-logo'])[2]")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("Symbol visible:"+symbol);
		Thread.sleep(2000);
		boolean login=driver.findElement(By.xpath("//*[text()='Login']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("Login displayed:"+login);
		
		

	}

}
