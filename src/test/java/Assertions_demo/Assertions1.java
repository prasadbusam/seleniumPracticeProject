package Assertions_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions1 {
	@Test
	public void test1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en-gb.facebook.com/login/web/");
		String act=driver.getTitle();
		System.out.println(act);
		String exp="Log in to Facebook";
		if(act.equals(exp))
		{
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		Assert.assertEquals(act, exp);
	}
		
		@Test
		public void ant(){
			WebDriver driver2=new ChromeDriver();
			driver2.manage().deleteAllCookies();
			driver2.manage().window().maximize();
			driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver2.get("https://practice.expandtesting.com/login#google_vignette");
			driver2.findElement(By.xpath("//*[@id='username']")).sendKeys("practice");
			driver2.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword!");
			driver2.findElement(By.xpath("//*[text()='Login']")).click();
			WebElement ele=driver2.findElement(By.xpath("//*[@id='flash']"));
			String str=ele.getText();
			//Assert.assertEquals(str, "You logged into a secure area!");
			boolean b=str.contains("secure area!");
			Assert.assertEquals(b, true);
			Assert.assertTrue(b);
		}
	
	
		@Test
		public void test4() {
			
	}

	
	}



