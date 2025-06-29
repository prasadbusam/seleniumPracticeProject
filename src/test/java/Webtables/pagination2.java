package Webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagination2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		List<WebElement>table=driver.findElements(By.xpath("//*[@class='pagination']//a"));
		Thread.sleep(3000);
		int total_pages=table.size();
		Thread.sleep(3000);
		System.out.println("Total pages :"+total_pages);
		Thread.sleep(3000);
		for(int p=1;p<=total_pages;p++) {
			if(p>=1) {
			WebElement page=driver.findElement(By.xpath("//*[@class='pagination']//*[text()="+p+"]"));
			page.click();
			Thread.sleep(3000);
			System.out.println("Clicked page : "+p);
		}
			List<WebElement> rows = driver.findElements(By.xpath("//*[@id='productTable']//tbody/tr"));
            int noOfRows = rows.size();
            System.out.println("Rows on page " + p + ": " + noOfRows);
			for(int r=1;r<=noOfRows;r++) {
				String name=driver.findElement(By.xpath("//*[@id='productTable']//tbody/tr["+r+"]/td[2]")).getText();
				WebElement checkbox=driver.findElement(By.xpath("//*[@id='productTable']//tbody/tr["+r+"]/td[4]/input"));
				Thread.sleep(3000);
				checkbox.click();
				System.out.println("Check box clicked :"+checkbox);
				String price=driver.findElement(By.xpath("//*[@id='productTable']//tbody/tr["+r+"]/td[3]")).getText();
				//WebElement checkbox1=driver.findElement(By.xpath("//*[@id='productTable']//tbody/tr["+r+"]/td[4]/input"));
				//Thread.sleep(3000);
				//checkbox1.click();
				//System.out.println("Check box clicked :"+checkbox1);
				String select=driver.findElement(By.xpath("//*[@id='productTable']//tbody/tr["+r+"]/td[4]")).getText();
				//WebElement checkbox2=driver.findElement(By.xpath("//*[@id='productTable']//tbody/tr["+r+"]/td[4]/input"));
				//Thread.sleep(3000);
				//checkbox2.click();
				//System.out.println("Check box clicked :"+checkbox2);
				//Thread.sleep(3000);
				System.out.println(name+"\t"+price+"\t"+select+"\t");
			}
			
		}
		driver.quit();

	}
}


