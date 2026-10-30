package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdPage {

	WebDriver driver;

	public ProdPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[@class=\"qty-label\"]/..//input[@value='Add to cart']")
	private WebElement cartBtn;

	@FindBy(linkText = "Shopping cart")
	private WebElement cartLink;

	@FindBy(id = "product_attribute_75_5_31_96")
	private WebElement processorBtn;

	@FindBy(id = "product_attribute_16_3_6_19")
	private WebElement hddBtn;
	
	@FindBy(id = "product_attribute_71_10_16")
	private WebElement lenTF;

	public WebElement getProcessorBtn() {
		return processorBtn;
	}

	public WebElement getHddBtn() {
		return hddBtn;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public void add2Cart() {
		cartBtn.click();
		cartLink.click();
	}

	public void ownCompadd2Cart() {
		hddBtn.click();
		cartBtn.click();
		cartLink.click();
	}

	public void simpCompadd2Cart() {
		processorBtn.click();
		cartBtn.click();
		cartLink.click();
	}
	
	public void jewlOwn() {
		lenTF.sendKeys("7");
		cartBtn.click();
		cartLink.click();
	}
}
