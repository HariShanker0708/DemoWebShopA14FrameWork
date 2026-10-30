package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoHomePage {

	WebDriver driver;

	public DemoHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Log in")
	private WebElement logInLink;

	@FindBy(linkText = "Books")
	private WebElement booksLink;

	@FindBy(linkText = "Computers")
	private WebElement compLink;

	@FindBy(linkText = "Desktops")
	private WebElement deskLink;

	@FindBy(linkText = "Jewelry")
	private WebElement jewLink;

	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	public WebElement getCompLink() {
		return compLink;
	}

	public WebElement getDeskLink() {
		return deskLink;
	}

	public WebElement getLogInLink() {
		return logInLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getJewLink() {
		return jewLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

}
