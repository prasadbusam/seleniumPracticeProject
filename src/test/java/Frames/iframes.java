package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		Thread.sleep(3000);
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Prasad");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//*[@src='frame_2.html']"));
		Thread.sleep(3000);
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("selenium");

	}

}
