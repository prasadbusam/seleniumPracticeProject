package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_tabdemo {

	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//*[@placeholder='Search store']")).sendKeys("mobile");
		driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"PgrT0\"]/div/label/input")).click();
		//driver.findElement(By.xpath("(//*[text()='Electronics '])[1]")).click();
		//driver.findElement(By.xpath("(//*[text()='Cell phones '])[1]")).click();
		
		

	}

}
