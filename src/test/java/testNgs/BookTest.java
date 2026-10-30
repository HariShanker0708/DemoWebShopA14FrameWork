package testNgs;

import org.testng.annotations.Test;

import base.BaseClasss;
import genUtil.PropUtil;
import objRepo.BooksPage;
import objRepo.CartPage;
import objRepo.CheckOutPage;
import objRepo.DemoHomePage;
import objRepo.DemoLoginPage;
import objRepo.ProdPage;

public class BookTest extends BaseClasss {

	@Test
	public void computerBook() throws Throwable {

		DemoHomePage hp = new DemoHomePage(driver);
		hp.getBooksLink().click();

		BooksPage bp = new BooksPage(driver);
		bp.getCompBook().click();

		ProdPage pp = new ProdPage(driver);
		pp.add2Cart();
	}

	@Test
	public void fictionBook() throws Throwable {

		DemoHomePage hp = new DemoHomePage(driver);
		hp.getBooksLink().click();

		BooksPage bp = new BooksPage(driver);
		bp.getFictionBook().click();

		ProdPage pp = new ProdPage(driver);
		pp.add2Cart();
	}

	@Test(groups = "smoke")
	public void healthBook() throws Throwable {

		
		DemoHomePage hp = new DemoHomePage(driver);
		hp.getBooksLink().click();

		BooksPage bp = new BooksPage(driver);
		bp.getHealthBook().click();

		ProdPage pp = new ProdPage(driver);
		pp.add2Cart();
	}

}
