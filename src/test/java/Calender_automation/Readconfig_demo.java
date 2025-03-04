package Calender_automation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class Readconfig_demo {
	WebDriver driver=null;
	ConfigProperties pr;                 //null
	public void loadproperties() throws IOException {
		//String projectloc=System.getProperty("user.dir");
		File fi=new File("C:\\Users\\NeelimaBusam\\eclipse-workspace\\seleniumproject\\config.properties");
		BufferedReader br=new BufferedReader(new FileReader(fi));
		Properties pr=new Properties();
		pr.load(br);
		
	}
	public void setup() {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://practice.expandtesting.com/login");
		
		
	}
	public void expandlogin(String username, String password) {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("practice");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
	}

	public static void main(String[] args) throws IOException {
		Readconfig_demo obj=new Readconfig_demo();
		obj.loadproperties();
		String username=obj.pr.getString("Username");
		String Password=obj.pr.getString("Password");
		obj.expandlogin(username, Password);
		System.out.println(username);
		obj.setup();
		
		
		
		}

	

	}


