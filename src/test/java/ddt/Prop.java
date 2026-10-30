package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prop {
	public static void main(String[] args) throws IOException {

		// step 1
		FileInputStream fis = new FileInputStream("C:\\Users\\JspidersPC\\Desktop\\A14CommData.properties");

		// step2
		Properties prop = new Properties();

		// step3
		prop.load(fis);

		// step4
		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");

		WebDriver driver;

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new EdgeDriver();
		}
		
	}
}
