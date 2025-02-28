package seleniumproject.seleniumproject;

import java.io.File;
import java.time.Duration;import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_screenshot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(3000);
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(3000);
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File targetfile=new File(System.getProperty("user.dir")+"\\seleniumproject\\Screenshots_file\\fullpage.png");
		Thread.sleep(3000);
		sourcefile.renameTo(targetfile);
		Thread.sleep(3000);
		driver.quit();

	}

}
