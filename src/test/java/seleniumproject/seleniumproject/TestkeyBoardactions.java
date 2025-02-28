package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestkeyBoardactions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement dblclickbtn=driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		Thread.sleep(2000);
        Actions action=new Actions(driver);
        Thread.sleep(2000);
        action.doubleClick(dblclickbtn).perform();
        Thread.sleep(2000);
        Alert alert= driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        //driver.switchTo().alert().accept();
        Thread.sleep(2000);
        WebElement rightclickbtn=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Thread.sleep(2000);
        action.contextClick(rightclickbtn).perform();
        Thread.sleep(2000);
        //WebElement deletebtn=driver.findElement(By.xpath("//span[normalize-space()='Delete']"));
        //Thread.sleep(2000);
        //action.contextClick(deletebtn).perform();
        //Thread.sleep(2000);
        //driver.switchTo().alert().accept();
        //Thread.sleep(2000);
        WebElement editbtn=driver.findElement(By.xpath("//span[normalize-space()='Edit']"));
        Thread.sleep(2000);
        action.contextClick(editbtn).perform();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.quit();
	}

}
