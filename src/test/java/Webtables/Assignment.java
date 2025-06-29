package Webtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		WebElement departure =driver.findElement(By.xpath("(//*[@class='form-inline'])[1]"));
		Thread.sleep(2000);
		departure.click();
		Thread.sleep(2000);
		WebElement destination=driver.findElement(By.xpath("(//*[@class='form-inline'])[2]"));
		Thread.sleep(2000);
		destination.click();
		Thread.sleep(2000);
		Select select =new Select(departure);
		Thread.sleep(2000);
		select.selectByIndex(2);
		Thread.sleep(2000);
		Select des=new Select(destination);
		Thread.sleep(2000);
		des.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='table']//tr[3]/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[placeholder='First Last']")).sendKeys("Raviteja");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='address']")).sendKeys("12-800Hitech city");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='city']")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='state']")).sendKeys("Telangana");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='zipCode']")).sendKeys("500085");
		Thread.sleep(2000);
		WebElement cardtype=driver.findElement(By.cssSelector("[name='cardType']"));
		Thread.sleep(2000);
		cardtype.click();
		Thread.sleep(2000);
		Select card=new Select(cardtype);
		Thread.sleep(2000);
		card.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='creditCardMonth']")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='creditCardYear']")).sendKeys("1996");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='nameOnCard']")).sendKeys("Raviteja");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name='rememberMe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
		
		

	}

}
