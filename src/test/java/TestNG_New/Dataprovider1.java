package TestNG_New;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Test(dataProvider="login1")
	public void login(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//*[@placeholder='E-Mail Address']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Login']")).click();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	@DataProvider
	public String[][] login1(){
		String[][] arr=		{{"prasadbusam1996@gmail.com","password1"},
							{"prasadbusam1996@gmail.com","password1"},
							{"prasadbusam1996@gmail.com","password1"},
							{"prasadbusam1996@gmail.com","password1"},
	};
		return arr;
			                
	}
}
	



