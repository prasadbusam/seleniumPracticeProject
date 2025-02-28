package seleniumproject.seleniumproject;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sales {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com/?locale=in");
		WebElement tryforfree = driver.findElement(By.xpath("//a[text()='Try for Free']"));
		tryforfree.click();
		 driver.findElement(By.name("UserFirstName")).sendKeys("kovuru");
		//fname.sendKeys("Apoorva");
		driver.findElement(By.name("UserLastName")).sendKeys("apoorva");
		//lname.sendKeys("Kovuru");
		WebElement email = driver.findElement(By.name("UserEmail"));
		email.sendKeys("vabet56296@cctoolz.com");
		WebElement jobtitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select select = new Select(jobtitle);
		select.selectByVisibleText("Others");
		WebElement company = driver.findElement(By.xpath("//input[@name='CompanyName']"));
		company.sendKeys("IBM");
		WebElement employees = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select emp = new Select(employees);
		emp.selectByVisibleText("26 - 100 employees");
		WebElement phone = driver.findElement(By.name("UserPhone"));
		phone.sendKeys("7386707587");
		WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select count = new Select(country);
		count.selectByVisibleText("India");
		WebElement check = driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]"));
		check.click();
		WebElement start = driver.findElement(By.xpath("//button[text()='start my free trial']"));
		start.click();
		Thread.sleep(4000);
		driver.quit();

	}

}
