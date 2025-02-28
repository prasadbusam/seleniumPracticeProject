package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiplekeyboardActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://text-compare.com/");
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		input1.sendKeys("This is prasad from hyderabad");
		input2.sendKeys("This is jitendra");
		Actions act = new Actions(driver);
		// ctrl+a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// ctrl+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// tab
		act.keyDown(Keys.TAB);
		act.perform();
		
		// ctrl+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if (input1.getAttribute("value").equals(input2.getAttribute("value"))){
			System.out.println("Text copied");
			
		} 
		else {
			System.out.println("Text not copied");
		}
		/*if (input1.getText().equals(input2.getText())) {
			System.out.println("Text copied");
		}
		else {
			System.out.println("Text not copied");
		}*/

	}

}
