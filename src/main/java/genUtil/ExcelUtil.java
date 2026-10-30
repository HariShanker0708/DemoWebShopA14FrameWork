package genUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public String toReadFromExcel(String sheetName,int rowNum,int cellNum) throws Throwable {

		FileInputStream fis = new FileInputStream("C:\\Users\\JspidersPC\\Desktop\\A14ExcelData.xlsx");
		Workbook workboook = WorkbookFactory.create(fis);
		Sheet sheet = workboook.getSheet(sheetName);
		String data = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
		
	}

}
