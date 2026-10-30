package testNgs;

import org.testng.annotations.Test;

import base.BaseClasss;
import objRepo.DemoHomePage;
import objRepo.JewelryPage;
import objRepo.ProdPage;

public class JewelTest extends BaseClasss {

	@Test
	public void ownJewl() throws Throwable {
		
	
		DemoHomePage hp = new DemoHomePage(driver);
		hp.getJewLink().click();

		JewelryPage jp = new JewelryPage(driver);
		jp.getOwnJewe().click();

		ProdPage pp = new ProdPage(driver);
		pp.jewlOwn();
	}

	@Test
	public void diamHeart() throws Throwable {

		DemoHomePage hp = new DemoHomePage(driver);
		hp.getJewLink().click();

		JewelryPage jp = new JewelryPage(driver);
		jp.getDiamHeart().click();

		ProdPage pp = new ProdPage(driver);
		pp.add2Cart();
	}

}
