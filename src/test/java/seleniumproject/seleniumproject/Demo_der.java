package seleniumproject.seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_der {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/index.php?next=https%3A%2F%2Fwww.facebook.com%2Fcheckpoint%2F1501092823525282%2F%3Fnext%3Dhttps%253A%252F%252Fwww.facebook.com%252Flogin%252F%253Fprivacy_mutation_token%253DeyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzMzOTkxODUwLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%25253D%25253D%2526next&deoia=1&no_universal_links=1");
		//driver.findElement(By.id("email")).sendKeys("prasad@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("prasad");
		//driver.findElement(By.name("login")).click();
		//for anchor tags we can use linktext and partial link text 
		//driver.findElement(By.linkText("Create new account")).click();
		//partiallink text only anchor tags 
		//WebElement link=driver.findElement(By.partialLinkText("Create new"));
		//link.click();
		//String str=link.getDomAttribute("href");
        List<WebElement> list=driver.findElements(By.tagName("input"));
        //System.out.println(list.size());
        //WebElement go=list.get(2);
        //go.getDomAttribute("type");
        for(int i=0;i<list.size();i++)
        {
        	WebElement li=list.get(i);
        	li.getTagName();
        	System.out.println(li.getTagName()+" "+li.getText());
        			System.out.println("-----------------------------");
        }
	}

}
