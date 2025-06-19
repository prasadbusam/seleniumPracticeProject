package Webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	}

}
