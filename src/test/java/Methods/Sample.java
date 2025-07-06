package Methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println("print url:"+url);
		Thread.sleep(2000);
		System.out.println("print title of the webpage:"+driver.getTitle());
		Thread.sleep(2000);
		String windowid=driver.getWindowHandle();
		System.out.println("Print window id:"+windowid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set<String>windowids=driver.getWindowHandles();
		System.out.println("Print window id's:"+windowids);
		

	}

}
