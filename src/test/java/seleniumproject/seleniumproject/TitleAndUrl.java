package seleniumproject.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(2000);
		String pageurl=driver.getCurrentUrl();
		String Title=driver.getTitle();
		System.out.println(pageurl);
		System.out.println(Title);
		if(pageurl.equals("https://www.google.com/")) {
			System.out.println("This is pass");
		}
		else {
			System.out.println("This is fail");
		}
		driver.quit();
		

	}

}
