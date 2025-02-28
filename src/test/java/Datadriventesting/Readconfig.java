package Datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readconfig {

	public static void main(String[] args) throws IOException {
		WebDriver driver=null;
		File file =new File("C:\\Users\\NeelimaBusam\\eclipse-workspace\\seleniumproject\\config.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties pr=new Properties();
		pr.load(fis);
		String v1=pr.getProperty("browser");
		System.out.println(v1);
		String u1=pr.getProperty("url");
		if (v1.equals("chrome"))
		{
			driver= new ChromeDriver();
			driver.get(u1);
		}
		else if(v1.equals("fire fox")) {
			driver=new FirefoxDriver();
			driver.get(u1);
		}
		else if(v1.equals("edge")) {
			driver=new EdgeDriver();
			driver.get(u1);
		}
		else {
			System.out.println("Browser not found");
		}

	}

}
