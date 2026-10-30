package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBack {
	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("C:\\Users\\JspidersPC\\Desktop\\A14ExcelData.xlsx");
		Workbook workboook = WorkbookFactory.create(fis);
		Sheet sheet = workboook.getSheet("Sheet1");

		sheet.getRow(0).createCell(2).setCellValue("ConfirmPassword");

		FileOutputStream fos = new FileOutputStream("C:\\Users\\JspidersPC\\Desktop\\A14ExcelData.xlsx");
		workboook.write(fos);
		workboook.close();
	}
}
