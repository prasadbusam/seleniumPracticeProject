package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		WebElement drpcntrylist=driver.findElement(By.xpath("//*[@id='country']"));
		Thread.sleep(3000);
		Select select=new Select(drpcntrylist);
		Thread.sleep(3000);
		//select.selectByIndex(2);
		List<WebElement>options=select.getOptions();
		System.out.println("Number of optins in dropdown :"+options.size());
		/*for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
			
		}*/
		
		for(WebElement op:options) {
			System.out.println(op.getText());
		}

	}

}
