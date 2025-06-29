package Iamstillalive;


		import java.io.FileInputStream;
		import org.apache.poi.ss.usermodel.*;
		import java.io.IOException;

		public class ExcelReader {

		    Workbook workbook;
		    Sheet sheet;

		    public ExcelReader(String excelPath, String sheetName) throws IOException {
		        FileInputStream fis = new FileInputStream(excelPath);
		        workbook = WorkbookFactory.create(fis);
		        sheet = workbook.getSheet(sheetName);
		    }

		    public String getCellData(int rowNum, int colNum) {
		        return sheet.getRow(rowNum).getCell(colNum).toString();
		    }

		    public int getRowCount() {
		        return sheet.getPhysicalNumberOfRows();
		    }
		


	}


