package Datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

//public class Data1 {

//public static void main(String[] args) throws FileNotFoundException {
/*WebDriver driver=new ChromeDriver();
driver.get("https://practice.expandtesting.com/login");
WebElement user=driver.findElement(By.id("username"));
WebElement pass=driver.findElement(By.id("password"));
user.sendKeys("admin1");
pass.sendKeys("pass1");
driver.findElement(By.xpath("//*[@type='submit']")).click();
File file =new File("./Excel file/Data.xlsx"); //file location
FileInputStream fis=new FileInputStream(file); //connection created
WorkbookFactory wb=new WorkbookFactory(fis); //type of file
Sheet sheet=new wb.getSheet(0);
Row row= sheet.getRow(0);
Cell cell =row.getCell(0);
System.out.println(cell);


}*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data1 {
	public static void test1(String u, String p) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://practice.expandtesting.com/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200);");
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		user.sendKeys(u);
		pass.sendKeys(p);
		driver.findElement(By.xpath("//*[@class='btn btn-bg btn-primary d-block w-100']")).click();
		driver.quit();
	}

	public static void main(String[] args) throws IOException {
		// Excel file location
		File file = new File("./Excel file/Data.xlsx");

		// Establish connection with the Excel file
		FileInputStream fis = new FileInputStream(file);

		// type of file
		Workbook wb = WorkbookFactory.create(fis);

		// Get the first sheet
		Sheet sheet = wb.getSheetAt(0);
		for (int i = 0; i < sheet.getLastRowNum(); i++)

		// Get the first row
		{
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++)
			// Get the first cell
			{
				Cell cell = row.getCell(j);
				String u = cell.toString();
				j++;
				Cell cell2 = row.getCell(j);
				String p = cell.toString();
				test1(u, p);

				// Print cell value
				System.out.println();

				// Close workbook and file stream
				//wb.close();
				//fis.close();

				// Quit WebDriver
				//driver.quit();
			}
		}

	}

}
