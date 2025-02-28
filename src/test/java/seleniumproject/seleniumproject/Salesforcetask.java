package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salesforcetask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://login.salesforce.com/?locale=in");

		driver.findElement(By.cssSelector("#signup_link")).click();

		driver.findElement(By.name("UserFirstName")).sendKeys("Prasad");

		driver.findElement(By.name("UserLastName")).sendKeys("Busam");

		driver.findElement(By.name("UserEmail")).sendKeys("prasadbusam1996@gmail.com");

		Select select = new Select(driver.findElement(By.name("UserTitle")));

		select.selectByIndex(2);
		driver.findElement(By.name("CompanyName")).sendKeys("Wipro");

		Select select2 = new Select(driver.findElement(By.name("CompanyEmployees")));

		select2.selectByIndex(3);

		driver.findElement(By.name("UserPhone")).sendKeys("9951156294");

		WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select count = new Select(country);
		count.selectByVisibleText("India");
		WebElement check1 = driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]"));
		check1.click();
		WebElement start = driver.findElement(By.xpath("//button[text()='start my free trial']"));
		start.click();
		Thread.sleep(4000);
		driver.quit();

	}

}
