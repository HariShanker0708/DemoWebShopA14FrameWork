package prac;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TeachAsserts {

	WebDriver driver;

	@Test
	public void soAssert() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		Reporter.log("Navigated to Instagram", true);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(title, "Facebook");
		Reporter.log("Verification Done",true);
		soft.assertAll();
		driver.quit();
	}
	
	@Test
	public void hardAssert() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		Reporter.log("Navigated to Instagram", true);	
		Assert.assertEquals(title, "Facebook");
		Reporter.log("Verification Done",true);
		driver.quit();
	}

}
