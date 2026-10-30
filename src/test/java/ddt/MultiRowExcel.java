package ddt;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultiRowExcel {
	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("C:\\Users\\JspidersPC\\Desktop\\A14ExcelData.xlsx");
		Workbook workboook = WorkbookFactory.create(fis);
		Sheet sheet = workboook.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();

		for (int i = 1; i <= lastRowNum; i++) {
			String un = sheet.getRow(i).getCell(0).getStringCellValue();
			String pw = sheet.getRow(i).getCell(1).getStringCellValue();

			System.out.println("UserName : " + un);
			System.out.println("Password : " + pw);
		}

	}
}
