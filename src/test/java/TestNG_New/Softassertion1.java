package TestNG_New;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion1 {
	/*@Test
	public void addition() {
		
	
	int a=100;
	int b=200;
	int c=a+b;
	int exp=100;
	SoftAssert sf=new SoftAssert();
	sf.assertEquals(c, exp);
	sf.assertTrue(false);
	sf.assertAll();
			
	}*/
	
	@Test
	public void practice() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://practice.expandtesting.com/login");
		boolean tool=driver.findElement(By.xpath("//*[text()='Tools']")).isDisplayed();
		System.out.println("This is displayed :"+tool);
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(tool,true,"Tool element should be visible" );
		sf.assertTrue(tool);
		sf.assertAll();
	}
}
