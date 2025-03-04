package AllLinks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_links_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		//List<WebElement>all=driver.findElements(By.xpath("//div[@class='header-links']/ul/li"));
		List<WebElement>veda=driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println("print all the links:"+veda.size());
		

	}

}
