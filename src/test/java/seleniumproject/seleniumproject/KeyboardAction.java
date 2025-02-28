package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ALT).perform();
		act.sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.SPACE).perform();
		act.sendKeys(Keys.TAB).perform();

	}

}
