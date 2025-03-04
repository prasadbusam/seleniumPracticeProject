package window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles_demo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/windows");
		WebElement link=driver.findElement(By.xpath("//*[@href='/windows/new']"));
		link.click();
		String 	Cwind=driver.getWindowHandle();// we can get window id 
		System.out.println(Cwind);
		//WebElement no=driver.findElement(By.xpath("//*[@href='/windows/new']"));
		//String 	Cwind2=driver.getWindowHandle();
		//System.out.println(Cwind2);
		Set<String> all=driver.getWindowHandles();
		List<String> li=new ArrayList<>(all);
		for(int i=0;i<li.size();i++)
		{
			String win=li.get(i);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
		}
		driver.close();
		

	}

}
