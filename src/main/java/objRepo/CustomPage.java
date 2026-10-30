package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomPage {

	WebDriver driver;

	public CustomPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "product_attribute_75_5_31_96")
	private WebElement processorBtn;

	@FindBy(linkText = "product_attribute_16_3_6_19")
	private WebElement hddBtn;

	public WebElement getProcessorBtn() {
		return processorBtn;
	}

	public WebElement getHddBtn() {
		return hddBtn;
	}

}
