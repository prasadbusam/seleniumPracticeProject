package Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_methods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement sel=driver.findElement(By.xpath("//*[text()='GUI Elements']"));
		System.out.println("Is it visibled :"+sel.isDisplayed());
		WebElement sel1=driver.findElement(By.xpath("//*[@placeholder='Enter Name']"));
		System.out.println("Is is enabled :"+sel1.isEnabled());
		WebElement sel2=driver.findElement(By.xpath("(//*[@name='gender'])[2]"));
		sel2.click();
		System.out.println("Is it selected: "+sel2.isSelected());

	}

}
