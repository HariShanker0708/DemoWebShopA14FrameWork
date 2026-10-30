package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage {

	WebDriver driver;

	public DesktopPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Build your own cheap computer")
	private WebElement cheapComp;

	@FindBy(linkText = "Build your own computer")
	private WebElement ownComp;

	@FindBy(linkText = "Build your own expensive computer")
	private WebElement expComp;

	@FindBy(linkText = "Simple Computer")
	private WebElement simpComp;

	public WebElement getCheapComp() {
		return cheapComp;
	}

	public WebElement getOwnComp() {
		return ownComp;
	}

	public WebElement getExpComp() {
		return expComp;
	}

	public WebElement getSimpComp() {
		return simpComp;
	}


}
