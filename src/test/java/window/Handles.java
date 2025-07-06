package window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(" //a[normalize-space()='Executive Profile']")).click();
		Set<String>windowids=driver.getWindowHandles();
		for(String windowi:windowids) {
			String parent=driver.switchTo().window(windowi).getTitle();
			if(parent.equals("Orange HRM")) {
				System.out.println(driver.getCurrentUrl());
			}else if(parent.equals("nopcommerce")) {
				System.out.println(driver.getCurrentUrl());
			}else if(parent.equals("OrngeHRM")){
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		

	}

}
