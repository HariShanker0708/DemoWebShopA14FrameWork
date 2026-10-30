package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement cont1;

	@FindBy(id = "PickUpInStore")
	private WebElement pickUpBtn;

	@FindBy(xpath = "//input[@onclick=\"Shipping.save()\"]")
	private WebElement cont2;

	@FindBy(xpath = "//input[@onclick=\"PaymentMethod.save()\"]")
	private WebElement cont3;

	@FindBy(xpath = "//input[@onclick=\"PaymentInfo.save()\"]")
	private WebElement cont4;

	@FindBy(xpath = "//input[@onclick=\"ConfirmOrder.save()\"]")
	private WebElement confirmBtn;

	public WebElement getCont1() {
		return cont1;
	}

	public WebElement getCont2() {
		return cont2;
	}

	public WebElement getCont3() {
		return cont3;
	}

	public WebElement getCont4() {
		return cont4;
	}

	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

	public WebElement getContBtn() {
		return cont1;
	}

	public WebElement getPickUpBtn() {
		return pickUpBtn;
	}

	public void checkOutProcess() {
		cont1.click();
		pickUpBtn.click();
		cont2.click();
		cont3.click();
		cont4.click();
		confirmBtn.click();
	}

}
