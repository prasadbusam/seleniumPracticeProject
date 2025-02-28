package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Manual testing documents\\RTM");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul[id='fileList'] li")).getText().equals("RTM.txt");
		

		
		

	}

}
