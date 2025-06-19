package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Imageupload {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // ✅ Define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            // Login
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")))
                .sendKeys("Admin");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // Navigate to Add Employee page
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='PIM']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary"))).click();

            // Click the plus icon to upload image
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i.oxd-icon.bi-plus"))).click();

            // Upload image file
            WebElement fileInput = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']")));
            fileInput.sendKeys("C:\\Users\\NeelimaBusam\\OneDrive\\Pictures\\photo.jpg");

            System.out.println("✅ Image uploaded successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //driver.quit();
        }
    }
}
