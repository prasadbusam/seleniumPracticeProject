package Webtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://datatables.net/examples/data_sources/ajax.html");
		//Showing 1 to 10 of 57 entries
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//*[text()='Showing 1 to 10 of 57 entries']")).getText();
		
		//convert the string to int now we have got and capture the total number of pages
		Thread.sleep(3000);
		int total_pages=Integer.parseInt(text.substring(text.indexOf("of")+3,text.indexOf("entries")-1));
		
		//repeating pages
		Thread.sleep(3000);
		for(int p=1;p<=total_pages;p++) {//if page no is 1 we no need to click because by default page no 1 is displayed
			if(p>1) { //if p value is greater than 1 then only get the active page we have to click on active_page
				
				//how to pass variable in xpath:- //*[@aria-label='pagination']//*[text()='3'] we need to pass the value dynamically so that's the reason we have passed variable into the xpath
				Thread.sleep(3000);
				
				WebElement active_page=driver.findElement(By.xpath("//*[@aria-label='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			//reading the data from the page
			int Noofrows=driver.findElements(By.xpath("//*[@class='dt-layout-row dt-layout-table']//tbody//tr")).size();
			for(int r=1;r<=Noofrows;r++) {//this loop will repeat all 10 rows in the first page.
				String name=driver.findElement(By.xpath("//*[@class='dt-layout-row dt-layout-table']//tbody/tr["+r+"]/td[1]")).getText();
				String position=driver.findElement(By.xpath("//*[@class='dt-layout-row dt-layout-table']//tbody/tr["+r+"]/td[2]")).getText();
				String office=driver.findElement(By.xpath("//*[@class='dt-layout-row dt-layout-table']//tbody/tr["+r+"]/td[3]")).getText();
				System.out.println(name+"\t"+position+"\t"+office+"\t");
			}
		}
		
		

	}

}
