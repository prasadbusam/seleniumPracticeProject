package Today1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles#google_vignette");
		Thread.sleep(2000);
		WebElement red=driver.findElement(By.xpath("//*[@class='red']"));
		Thread.sleep(2000);
		WebElement green=driver.findElement(By.xpath("//*[@class='green']"));
		Thread.sleep(2000);
		WebElement blue =driver.findElement(By.xpath("//*[@class='blue']"));
		Thread.sleep(2000);
		WebElement buk=driver.findElement(By.xpath("//*[@id='target']"));
		Thread.sleep(2000);
		act.dragAndDrop(red, buk).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(green, buk).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(blue, buk).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
