package seleniumproject.seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Pnr_status_checking_makemytrip {

	public static void main(String[] args) {
		
		        WebDriver driver = new ChromeDriver();
		        try {
		            driver.manage().window().maximize();
		            driver.manage().deleteAllCookies();
		            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		            driver.get("https://www.makemytrip.com/");

		            // Close modal if present
		            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            try {
		                WebElement closeModal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-cy='closeModal']")));
		                closeModal.click();
		            } catch (Exception e) {
		                System.out.println("Modal not present.");
		            }

		            // Navigate to 'Trains' and check PNR status
		            driver.findElement(By.xpath("(//*[text()='Trains'])[1]")).click();
		            driver.findElement(By.xpath("//span[normalize-space()='Check PNR Status']")).click();
		            driver.findElement(By.xpath("//*[@data-cy='enterPnr']")).sendKeys("4412160511");
		            driver.findElement(By.xpath("//*[@data-cy='checkStatusButton']")).click();

		            // Print PNR details (if accessible)
		            driver.findElement(By.xpath("//*[@class='pnrSprite printIcon appendRight5']")).click();

		            // Access Shadow DOM (if required)
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		            WebElement shadowHost = driver.findElement(By.cssSelector("#shadow-root"));
		            WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
		            WebElement background = shadowRoot.findElement(By.cssSelector("#background"));
		            background.click();
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            driver.quit();
		        }
		    }
	}


