package TestNG_New;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadExcelsheet {
	@Test
	public void excel() throws EncryptedDocumentException, IOException {
		//file location
		File file=new File("C:\\Users\\NeelimaBusam\\eclipse-workspace\\seleniumproject\\Excel file\\Data.xlsx");
		//file connection
		FileInputStream fis = new FileInputStream(file);
		//file type
		Workbook wb=WorkbookFactory.create(fis);
		//get the sheet of excel
		Sheet sheet=wb.getSheetAt(0);
		// get the row from zero
		Row row=sheet.getRow(0);
		// get the from column zero
		Cell cell=row.getCell(0);
		System.out.println(cell);
	}
	
	@Test
	public void fullexcel() throws EncryptedDocumentException, IOException {
		File file =new File("C:\\Users\\NeelimaBusam\\eclipse-workspace\\seleniumproject\\Excel file\\Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheetAt(0);
		int TRows=sheet.getLastRowNum();
		for(int i=0;i<TRows;i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				System.out.println(row.getCell(j));
			}
		}
		
		
	}

	private Workbook WorkbookFactory(FileInputStream fis) {
		// TODO Auto-generated method stub
		return null;
	}

}
