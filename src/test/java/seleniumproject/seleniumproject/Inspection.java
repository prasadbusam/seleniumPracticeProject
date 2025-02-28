package seleniumproject.seleniumproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Inspection {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("995156294");
		Thread.sleep(1000);
		WebElement Password=driver.findElement(By.name("pass"));
		Password.sendKeys("Prasad@123");
		Thread.sleep(1000);
		WebElement Login_button=driver.findElement(By.name("login"));
		Login_button.click();
		driver.quit();
		
		
		//tagname[@attribute='value']
		//tagname button [text()='value']
		//tagname [.='value']

	}

}
