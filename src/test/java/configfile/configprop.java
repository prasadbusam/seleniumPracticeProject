package configfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import seleniumproject.seleniumproject.Microsoftoutlook_creation;

public class configprop {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\NeelimaBusam\\eclipse-workspace\\seleniumproject\\prasad.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		
		String brow=prop.getProperty("browser");//capture the browser name here
		String ur=prop.getProperty("url");
	    String user=prop.getProperty("username");
		String pass=prop.getProperty("password");
		
		if(brow.equals("firefox")) {
			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		else if(brow.equals("chrome")) {
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		else if(brow.equals("Microsoft Edge")) {
			driver=new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		
		driver.get(ur);
		
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		

	}

}
