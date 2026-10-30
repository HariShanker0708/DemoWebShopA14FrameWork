package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "termsofservice")
	private WebElement agreeBtn;

	@FindBy(id = "checkout")
	private WebElement checkBtn;

	public WebElement getAgreeBtn() {
		return agreeBtn;
	}

	public WebElement getCheckBtn() {
		return checkBtn;
	}

	public void toCheck() {
		agreeBtn.click();
		checkBtn.click();
	}

}
