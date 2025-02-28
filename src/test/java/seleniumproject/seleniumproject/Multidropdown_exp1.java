package seleniumproject.seleniumproject;

import java.lang.annotation.ElementType;
import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown_exp1 {
	WebDriver driver;

	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void SetByindexvalue(WebElement element, int indexvalue) {
		Select select =new Select(element);
			select.selectByIndex(indexvalue);
		}
	public void closebrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		Multidropdown_exp1 obj=new Multidropdown_exp1();
		obj.Setup();
		obj.launchUrl("https://www.letskodeit.com/practice");
		WebElement carlist=obj.driver.findElement(By.id("carselect"));
		obj.SetByindexvalue(carlist, 0);
		obj.SetByindexvalue(carlist, 1);
		obj.SetByindexvalue(carlist, 2);
		obj.closebrowser();

	}

}
