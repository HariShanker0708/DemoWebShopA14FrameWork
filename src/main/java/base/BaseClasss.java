package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import genUtil.PropUtil;
import genUtil.WebdrUtil;
import objRepo.CartPage;
import objRepo.CheckOutPage;
import objRepo.DemoHomePage;
import objRepo.DemoLoginPage;

public class BaseClasss {

	public WebDriver driver;

	// Creating Utilities
	public PropUtil plib = new PropUtil();
	public WebdrUtil wlib = new WebdrUtil();

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("") String BROWSER) throws Throwable {

		Reporter.log("Launching the Browser", true);

		if (BROWSER == null || BROWSER.isEmpty()) {
			BROWSER = plib.toReadDataFromProp("browser");
		}
		
		String URL = plib.toReadDataFromProp("url");

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(URL);
	}

	@BeforeMethod
	public void beforeMethod() throws Throwable {

		String UN = plib.toReadDataFromProp("un");
		String PW = plib.toReadDataFromProp("pw");

		DemoHomePage hp = new DemoHomePage(driver);
		hp.getLogInLink().click();

		DemoLoginPage lp = new DemoLoginPage(driver);
		lp.loginDemo(UN, PW);

		Reporter.log("Login Successful", true);
	}

	@AfterMethod
	public void afterMethod() throws Throwable {

		CartPage cp = new CartPage(driver);
		cp.toCheck();

		CheckOutPage cop = new CheckOutPage(driver);
		cop.checkOutProcess();
		Thread.sleep(2000);
		wlib.takesScreenshot(driver);

		DemoHomePage hp = new DemoHomePage(driver);
		hp.getLogoutLink().click();
		Reporter.log("Logout Successfull", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("Closing the Browser", true);
		driver.quit();
	}

}
