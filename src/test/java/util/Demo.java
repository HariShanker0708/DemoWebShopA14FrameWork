package util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genUtil.ExcelUtil;
import genUtil.JavaUtil;
import genUtil.PropUtil;

public class Demo {
	public static void main(String[] args) throws Throwable {

		// Creating Utilities
		PropUtil plib = new PropUtil();
		ExcelUtil elib = new ExcelUtil();
		JavaUtil jlib = new JavaUtil();

		String BROWSER = plib.toReadDataFromProp("browser");
		String URL = plib.toReadDataFromProp("url");

		int random = jlib.randomNumber();

		String fn = elib.toReadFromExcel("Sheet1", 0, 0);
		String ln = elib.toReadFromExcel("Sheet1", 1, 0);
		String email = elib.toReadFromExcel("Sheet1", 2, 0) + random + "@gmai.com";
		String pw = elib.toReadFromExcel("Sheet1", 3, 0);
		String cnfPw = elib.toReadFromExcel("Sheet1", 4, 0);

		WebDriver driver;

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);

		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fn);
		driver.findElement(By.id("LastName")).sendKeys(ln);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pw);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cnfPw);
		driver.findElement(By.id("register-button")).click();

	}
}
