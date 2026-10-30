package testNgs;

import org.testng.annotations.Test;

import base.BaseClasss;
import objRepo.CartPage;
import objRepo.CheckOutPage;
import objRepo.DemoHomePage;
import objRepo.DemoLoginPage;
import objRepo.DesktopPage;
import objRepo.ProdPage;

public class DeskTest extends BaseClasss {

	@Test
	public void cheapComputer() throws Throwable {

		DemoHomePage hp = new DemoHomePage(driver);
		hp.getCompLink().click();
		hp.getDeskLink().click();

		DesktopPage dp = new DesktopPage(driver);
		dp.getCheapComp().click();

		ProdPage pp = new ProdPage(driver);
		pp.add2Cart();
	}

	@Test()
	public void ownComputer() throws Throwable {
		
		DemoHomePage hp = new DemoHomePage(driver);
		hp.getCompLink().click();
		hp.getDeskLink().click();

		DesktopPage dp = new DesktopPage(driver);
		dp.getOwnComp().click();

		ProdPage pp = new ProdPage(driver);
		pp.ownCompadd2Cart();

	}

	@Test()
	public void expensiveComputer() throws Throwable {
		
		DemoHomePage hp = new DemoHomePage(driver);
		hp.getCompLink().click();
		hp.getDeskLink().click();

		DesktopPage dp = new DesktopPage(driver);
		dp.getExpComp().click();

		ProdPage pp = new ProdPage(driver);
		pp.add2Cart();
	}

	@Test(groups = "smoke")
	public void simpleComputer() throws Throwable {
		
		DemoHomePage hp = new DemoHomePage(driver);
		hp.getCompLink().click();
		hp.getDeskLink().click();

		DesktopPage dp = new DesktopPage(driver);
		dp.getSimpComp().click();

		ProdPage pp = new ProdPage(driver);
		pp.simpCompadd2Cart();

	}
}
