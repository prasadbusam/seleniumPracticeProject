package seleniumproject.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_demo {

	public static void main(String[] args, WebElement drop) {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.letskodeit.com/practice");
		WebElement drop1=driver.findElement(By.xpath("//*[@id='carselect']"));
        Select sel=new Select(drop1);
        sel.selectByIndex(1);
		/*List<WebElement> drop11=sel.getOptions();
		for(int i=0;i<drop11.size();i++)
		{
			WebElement ele=drop11.get(i);
			System.out.println(ele.getText());
			
		}*/
	}

}
