/*package TestNG_New;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cross_1 {
	WebDriver driver;

	@BeforeMethod
	public void Up() {
		driver.get("https://x.com/i/flow/login?lang=en");
		driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	/*
	 @BeforeTest
	 
	public void Set() {

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}*/

	/*@Test
	public void logix() {
		boolean logo = driver.findElement(By.xpath("//*[text()='Sign in with Apple']")).isDisplayed();
		System.out.println("Logo displayed :" + logo);
	}

	@Test
	public void regi() {
		boolean amazon = driver.findElement(By.xpath("//*[@aria-label='Amazon.in']")).isDisplayed();
		System.out.println("Amazon is displayed :" + amazon);
	}

	@Test
	public void flip() {
		boolean cart = driver.findElement(By.xpath("//*[@name='q']")).isEnabled();
		System.out.println("Search bar enabled :" + cart);
	}

	@AfterMethod
	public void cleanup() {
		driver.quit();
		System.out.println("Browser session has been expired");	}

	/*@AfterTest
	public void Teardown() {
		driver.quit();
		System.out.println("Browser session has been expired");
	}*/

//}

package TestNG_New;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; // Import ChromeDriver or your preferred driver
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cross_1 {
    WebDriver driver;

    @BeforeMethod
    public void Up() {
        // Initialize the WebDriver (e.g., ChromeDriver)
        driver = new ChromeDriver(); // Make sure the ChromeDriver executable is properly set in PATH

        // Set up browser session
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Navigate to multiple sites
        driver.get("https://x.com/i/flow/login?lang=en");
        driver.get("https://www.amazon.in/");
        driver.get("https://www.flipkart.com/");
    }

    @Test
    public void logix() throws InterruptedException {
    	Thread.sleep(3000);
        boolean logo = driver.findElement(By.xpath("//*[text()='Sign in with Apple']")).isDisplayed();
        System.out.println("Logo displayed :" + logo);
    }

    @Test(priority=1)
    public void regi() throws InterruptedException {
    	Thread.sleep(3000);
        boolean amazon = driver.findElement(By.xpath("//*[@aria-label='Amazon.in']")).isDisplayed();
        System.out.println("Amazon is displayed :" + amazon);
    }

    @Test
    public void flip() throws InterruptedException {
    	Thread.sleep(3000);
        boolean cart = driver.findElement(By.xpath("//*[@name='q']")).isEnabled();
        System.out.println("Search bar enabled :" + cart);
    }

    @AfterMethod
    public void cleanup() {
        // Quit the browser session after each test
        if (driver != null) {
            driver.quit();
            System.out.println("Browser session has been expired");
        }
    }
}
