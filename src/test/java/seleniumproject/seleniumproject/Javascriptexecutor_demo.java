package seleniumproject.seleniumproject;

import java.net.http.WebSocketHandshakeException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement input=driver.findElement(By.xpath("//*[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'Prasad')", input);
		WebElement email_id_text=driver.findElement(By.xpath("//*[@placeholder='Enter EMail']"));
		js.executeScript("arguments[0].setAttribute('value',  'prasadbusam1996@gmail.com')", email_id_text);
		WebElement phone_no=driver.findElement(By.xpath("//*[@placeholder='Enter Phone']"));
        js.executeScript("arguments[0].setAttribute('value', '9951156294')", phone_no);
        js.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("//*[@id='textarea']")).sendKeys("machilipatnam");
        WebElement address_text=driver.findElement(By.xpath("//*[@id='textarea']"));
        //js.executeScript("argument[0].setAttribute('value', 'machilipatnam')", address_text);
        WebElement radio_btn=driver.findElement(By.xpath("//*[@id='male']"));
        Thread.sleep(2000);
        //js.executeScript("argument[0].scrollIntoview();",radio_btn);
        js.executeScript("arguments[0].click()", radio_btn);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        Thread.sleep(5000);
        driver.quit();
        
	}

}
