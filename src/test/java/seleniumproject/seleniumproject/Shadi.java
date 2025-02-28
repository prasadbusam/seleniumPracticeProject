package seleniumproject.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shadi {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shaadi.com/join-now?ptnr=sribrnext01&aff_url_param=g&gad_source=1&gclid=Cj0KCQiAsaS7BhDPARIsAAX5cSAGVu1ymuaRX78rgigLfzl21AdC6BLDd0HjHkz-xlhHuDP-A7qKGZcaAgcGEALw_wcB");
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile no. / Email ID']")).sendKeys("prasadbusam1996@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Prasad@123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Select select =new Select(driver.findElement(By.xpath("//div[contains(text(),'Woman')]")));
		select.selectByVisibleText("Woman");
		Select select2=new Select(driver.findElement(By.xpath("//div[@class='PreferenceForm_ageFrom__9vfhF']//div[@class='Dropdown-control']")));
		select2.selectByValue("28");
		Select select3=new Select(driver.findElement(By.xpath("//div[@class='PreferenceForm_formGroup__7JJxn col-md-2 col-6']//div[@class='Dropdown-placeholder is-selected'][normalize-space()='Select']")));
		select3.selectByVisibleText("Hindu");
		Select select4=new Select(driver.findElement(By.xpath("//div[@class='PreferenceForm_formGroup__7JJxn col-md-3 col-6']//div[@class='Dropdown-placeholder is-selected'][normalize-space()='Select']")));
		select4.selectByVisibleText("Telugu");
		driver.findElement(By.xpath("//button[@class='btn btn-primary form-control PreferenceForm_brand__uUmm1']")).click();
		

	}

}
