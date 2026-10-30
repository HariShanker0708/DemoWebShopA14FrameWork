package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaHomePage {

	WebDriver driver;

	public InstaHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement unTf;

	@FindBy(name = "pass")
	private WebElement pwTf;

	public WebElement getUnTf() {
		return unTf;
	}

	public WebElement getPwTf() {
		return pwTf;
	}

}
