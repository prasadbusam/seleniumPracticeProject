package Webtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_webtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://testautomationpractice.blogspot.com/");
		int rows=driver.findElements(By.xpath("//*[@name='BookTable']//tr")).size();
		System.out.println("print no of rows :"+rows);
		/*List<WebElement>rows=driver.findElements(By.xpath("//*[@name='BookTable']//tr"));
		System.out.println("print no of rows :"+rows.size());
		for(int i=0;i<rows.size();i++) {
			System.out.println(rows.get(i).getText());
		}*/
		int columns=driver.findElements(By.xpath("//*[@name='BookTable']//th")).size();
		System.out.println("print no of columns :"+columns);
		String book=driver.findElement(By.xpath("//*[@name='BookTable']//tr[4]/td[2]")).getText();
		System.out.println("Print the book name :"+book);
		
		String book1=driver.findElement(By.xpath("//*[@name='BookTable']//tr[3]/td[2]")).getText();
		System.out.println("Print the result :"+book1);
		
		for(int r=2;r<=rows;r++) {
			String price=driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			if(price.equals("300")) {
				System.out.println("Print the particular :"+price );
		}
			

	}

}
}

