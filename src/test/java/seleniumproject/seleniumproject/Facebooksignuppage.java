package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooksignuppage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);
		driver.get("https://en-gb.facebook.com/reg/");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Prasad");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Busam");
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(By.name("birthday_day")));
		Thread.sleep(2000);
		select.selectByIndex(15);
		Thread.sleep(2000);
		Select select1 = new Select(driver.findElement(By.name("birthday_month")));
		Thread.sleep(2000);
		select1.selectByIndex(10);
		Thread.sleep(2000);
		Select select3 = new Select(driver.findElement(By.name("birthday_year")));
		Thread.sleep(2000);
		select3.selectByValue("1996");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("prasadbusam1996@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("9951156294");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();

	}

}
