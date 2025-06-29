package Iamstillalive;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alive {

    // Entry point for Selenium - only opens signup page
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://dev.iamstillalive.com/");
        driver.findElement(By.xpath("//*[@class='img-fluid rounded-5 shadow']")).click();
        driver.findElement(By.xpath("//*[text()='Getting Started (Sign up)']")).click();
        //WebElement category=driver.findElement(By.xpath("//*[@id='category-dropdown']"));
        
    }

    // Entry point for reading Excel
    public static void main1(String[] args) throws IOException {
        File file = new File("./Excel file/Alive1.xlsx");  // ✅ Correct path
        FileInputStream fis = new FileInputStream(file);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheetAt(0);

        // Loop through rows (skip header)
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) continue;

            String emailId = getCellValue(row, 0);
            String category = getCellValue(row, 1);
            String subcategory = getCellValue(row, 2);
            String supersubcategory = getCellValue(row, 3);
            String cancerType = getCellValue(row, 4);
            String firstName = getCellValue(row, 5);
            String lastName = getCellValue(row, 6);
            String nickname = getCellValue(row, 7);
            String email = getCellValue(row, 8);
            String dob = getCellValue(row, 9);
            String country = getCellValue(row, 10);
            String city = getCellValue(row, 11);
            String password = getCellValue(row, 12);
            String confirm = getCellValue(row, 13);

            // Print for testing
            System.out.println(firstName + " | " + lastName + " | " + nickname + " | " +
                    email + " | " + dob + " | " + country + " | " + city + " | " + password);
        }

        //wb.close();
        //fis.close();
    }

    // ✅ Fixed: This method now properly reads cell value
    private static String getCellValue(Row row, int cellIndex) {
        Cell cell = row.getCell(cellIndex);
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue().trim();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getLocalDateTimeCellValue().toLocalDate().toString(); // Format date
                } else {
                    return String.valueOf((long) cell.getNumericCellValue()); // Remove decimal
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }
}
