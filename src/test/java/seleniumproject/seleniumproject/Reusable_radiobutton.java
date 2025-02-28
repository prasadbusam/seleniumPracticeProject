package seleniumproject.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable_radiobutton {
	WebDriver driver=null;
	public void setUp() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.letskodeit.com/practice");
	}
	public void clickradiooptions(String radioname) {
		List<WebElement> radiooptions=driver.findElements(By.cssSelector("label>input[type='radio']"));
		for(WebElement radio:radiooptions) {
			String value=radio.getAttribute("id");
			if(value.equals(radioname)) {
				radio.click();
				break;
			}
			
		}
	}
	public void closebrowser() {
		driver.quit();
	}

	public static void main(String[] args) {
		Reusable_radiobutton obj=new Reusable_radiobutton();
		obj.setUp();
		obj.clickradiooptions("bmwradio");
		obj.closebrowser();

	}

}
