package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genUtil.ExcelUtil;
import genUtil.JavaUtil;
import genUtil.PropUtil;
import genUtil.WebdrUtil;
import objRepo.BooksPage;
import objRepo.CartPage;
import objRepo.CheckOutPage;
import objRepo.DemoHomePage;
import objRepo.DemoLoginPage;
import objRepo.ProdPage;

public class FictionBookTest {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		// Creating Utilities
		PropUtil plib = new PropUtil();
		WebdrUtil wlib = new WebdrUtil();

		String BROWSER = plib.toReadDataFromProp("browser");
		String URL = plib.toReadDataFromProp("url");
		String UN = plib.toReadDataFromProp("un");
		String PW = plib.toReadDataFromProp("pw");

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

		DemoHomePage hp = new DemoHomePage(driver);
		hp.getLogInLink().click();

		DemoLoginPage lp = new DemoLoginPage(driver);
		lp.loginDemo(UN, PW);

		hp.getBooksLink().click();

		BooksPage bp = new BooksPage(driver);
		bp.getFictionBook().click();

		ProdPage pp = new ProdPage(driver);
		pp.add2Cart();

		CartPage cp = new CartPage(driver);
		cp.toCheck();
		
		CheckOutPage cop = new CheckOutPage(driver);
		cop.checkOutProcess();
		Thread.sleep(2000);
		wlib.takesScreenshot(driver);
	}
}
