package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// step 1
		FileInputStream fis = new FileInputStream("C:\\Users\\JspidersPC\\Desktop\\A14ExcelData.xlsx");

		// step2
		Workbook workboook = WorkbookFactory.create(fis);
		
		//step3
		Sheet sheet = workboook.getSheet("Sheet1");
		
		//step4
		Row row = sheet.getRow(1);
		
		//step5
		Cell cell = row.getCell(0);
		
		//step6
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		
		String cell2 = sheet.getRow(1).getCell(0).getStringCellValue();
		String cell3 = sheet.getRow(2).getCell(0).getStringCellValue();
		String cell4 = sheet.getRow(3).getCell(0).getStringCellValue();
		String cell5 = sheet.getRow(4).getCell(0).getStringCellValue();
		
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		
	}
}
