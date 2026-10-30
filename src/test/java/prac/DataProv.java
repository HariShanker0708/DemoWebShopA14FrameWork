package prac;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv {

	@Test(dataProvider = "details")
	public void InstaLogin(String un, String pw) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pw);
		driver.quit();
	}

	@DataProvider
	public Object[][] details() throws Throwable, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\JspidersPC\\Desktop\\A14ExcelData.xlsx");
		Workbook workboook = WorkbookFactory.create(fis);
		Sheet sheet = workboook.getSheet("Sheet3");
		int lastRowNum = sheet.getLastRowNum();

		Object[][] objArr = new Object[lastRowNum][2];

		for (int i = 0; i < lastRowNum; i++) {
			objArr[i][0] = sheet.getRow(i + 1).getCell(0).getStringCellValue();
			objArr[i][1] = sheet.getRow(i + 1).getCell(1).getStringCellValue();
		}

		return objArr;
	}

}
