package Calender_automation;

import java.io.*;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Duplicate {  // Class name updated to follow Java conventions
    WebDriver driver = null;
    Properties pr;  // Class-level variable for Properties

    public void loadProperties() throws IOException {
        // Specify the location of your config file
        File fi = new File("C:\\Users\\NeelimaBusam\\eclipse-workspace\\seleniumproject\\config.properties");
        BufferedReader br = new BufferedReader(new FileReader(fi));
        pr = new Properties();  // Initialize the Properties object
        pr.load(br);  // Load the properties from the file
        br.close(); // Close the BufferedReader to avoid memory leaks
    }

    public void setup() {
        // Set up the WebDriver and browser configurations
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe"); // Ensure this is correctly set
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://practice.expandtesting.com/login");
    }

    public void expandLogin(String username, String password) {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[text()='Login']")).click();
    }

    public static void main(String[] args) throws IOException {
        Duplicate obj = new Duplicate();
        obj.loadProperties();  // Load properties from the file
        String username = obj.pr.getProperty("Username");  // Use getProperty() to get the values
        String password = obj.pr.getProperty("Password");
        
        obj.setup();  // Set up the browser and navigate to the URL
        obj.expandLogin(username, password);  // Perform login
        System.out.println("Username: " + username);  // Print the username
        //System.out.println("Password: " + password);
    }
}
