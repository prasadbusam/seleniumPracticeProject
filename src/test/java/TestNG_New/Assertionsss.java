package TestNG_New;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionsss {
	@Test
	public void test1() {
		int a=40;
		int b=20;
		int exp=40;
		Assert.assertEquals(a, exp);
		System.out.println("After assertion");
		boolean a1=true;
		boolean a2=false;
		Assert.assertFalse(a2); //false
		Assert.assertTrue(a1);  //false	
	}
	
	@Test
	public void title1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		String act=driver.getTitle();
		String exp="Account Login";
		Assert.assertEquals(act, exp);
		boolean title=driver.findElement(By.xpath("//*[text()='Qafox.com']")).isDisplayed();
		System.out.println("This is displayed :"+title);
		
	}
}
