package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

	WebDriver driver;

	public BooksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Computing and Internet")
	private WebElement compBook;

	@FindBy(linkText = "Copy of Computing and Internet EX")
	private WebElement copyBook;

	@FindBy(linkText = "Fiction")
	private WebElement fictionBook;

	@FindBy(linkText = "Fiction EX")
	private WebElement ficCopy;

	@FindBy(linkText = "Health Book")
	private WebElement healthBook;

	@FindBy(linkText = "Science")
	private WebElement scienceBook;

	public WebElement getCompBook() {
		return compBook;
	}

	public WebElement getCopyBook() {
		return copyBook;
	}

	public WebElement getFictionBook() {
		return fictionBook;
	}

	public WebElement getFicCopy() {
		return ficCopy;
	}

	public WebElement getHealthBook() {
		return healthBook;
	}

	public WebElement getScienceBook() {
		return scienceBook;
	}

}
