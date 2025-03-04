package Calender_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		int day=20;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("(//*[@data-handler='selectDay'])[4]")).click();
	}

}
