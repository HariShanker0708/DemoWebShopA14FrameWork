package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objRepo.InstaHomePage;

public class InstaDemo {
	
	@Test
	public void reshmaLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.instagram.com/");

		InstaHomePage hp = new InstaHomePage(driver);
		hp.getUnTf().sendKeys("__hari07");
		hp.getPwTf().sendKeys("7415896");
		Thread.sleep(2000);
		driver.navigate().refresh();
		hp.getUnTf().sendKeys("__hari07");
		hp.getPwTf().sendKeys("7415896");
	}
	@Test
	public void hariLogin() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.instagram.com/");

		InstaHomePage hp = new InstaHomePage(driver);
		hp.getUnTf().sendKeys("__hari07");
		hp.getPwTf().sendKeys("7415896");
		Thread.sleep(2000);
		driver.navigate().refresh();
		hp.getUnTf().sendKeys("__hari07");
		hp.getPwTf().sendKeys("7415896");

	}
	
}
	
	
	
