package seleniumproject.seleniumproject;
import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launchbrowser {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coxandcox.co.uk/?srsltid=AfmBOopxZ2eM5Z9fstjvFiEJtIpuek4CeHGTtDEVIKNhWxdj0bu9wpXF");
		Thread.sleep(2000);
		driver.navigate().to("https://facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		String s=driver.getTitle();
		String s1=driver.getCurrentUrl();
		System.out.println(s);
		System.out.println(s1);
		
		//driver.close();
		

	}

}
