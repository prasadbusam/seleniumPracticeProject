package Calender_automation;



	
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.IOException;
		import java.util.Properties;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.edge.EdgeDriver;

import Testng_work_demo.Practice_Login;

		public class p2 {
			private static final String Practice = null;
			private static final String SuperSecretPassword = null;
			static WebDriver d;
			public static void main(String[] args) throws IOException, InterruptedException {
				
				
				
				File f=new File("./config.properties");
				
				FileInputStream fi=new FileInputStream(f);
				
				Properties p=new Properties();
				
				p.load(fi);
				
				String b=p.getProperty("browser");
				String u=p.getProperty("url");
				String id=p.getProperty("user");
				String pw=p.getProperty("password");
			
				if(b.equals("edge")) 
				{
					d=new EdgeDriver();
					d.manage().window().maximize();
					d.get(u);
					
				
				}
				else if(b.equals("chrome")) {
					d=new ChromeDriver();
					d.manage().window().maximize();
					d.get(u);
				}
				else {
					System.out.println("invalid input");
				}
				
				d.findElement(By.xpath("//input[@id='username']")).sendKeys("practice");
				System.out.println("This is user name:"+Practice);
				Thread.sleep(2000);
				d.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
				System.out.println("This is password:"+SuperSecretPassword);
				Thread.sleep(2000);
				d.findElement(By.xpath("//button[text()='Login']")).click();
				
			}	
		}