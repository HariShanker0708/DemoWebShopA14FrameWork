package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPage {

	WebDriver driver;

	public DemoLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement unTf;

	@FindBy(id = "Password")
	private WebElement pwTf;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement logBtn;

	public WebElement getUnTf() {
		return unTf;
	}

	public WebElement getPwTf() {
		return pwTf;
	}

	public WebElement getLogBtn() {
		return logBtn;
	}

	public void loginDemo(String un, String pw) {
		unTf.sendKeys(un);
		pwTf.sendKeys(pw);
		logBtn.click();
	}

}
