package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {

	WebDriver driver;

	public JewelryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Create Your Own Jewelry")
	private WebElement ownJewe;

	@FindBy(linkText = "Black & White Diamond Heart")
	private WebElement diamHeart;

	public WebElement getOwnJewe() {
		return ownJewe;
	}

	public WebElement getDiamHeart() {
		return diamHeart;
	}

}
