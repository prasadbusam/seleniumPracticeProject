package seleniumproject.seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/index.php?next=https%3A%2F%2Fwww.facebook.com%2Fcheckpoint%2F1501092823525282%2F%3Fnext%3Dhttps%253A%252F%252Fwww.facebook.com%252Flogin%252F%253Fprivacy_mutation_token%253DeyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzMzOTkxODUwLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%25253D%25253D%2526next&deoia=1&no_universal_links=1");
        List<WebElement> li=driver.findElements(By.tagName("a"));
        int tlinks=li.size();
        /*if(tlinks==48)
        {
        	System.out.println("test pass");
        }
        else
        {
        	System.out.println("test fail");
        }*/
	}

}
