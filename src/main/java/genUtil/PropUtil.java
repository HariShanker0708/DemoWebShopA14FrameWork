package genUtil;

import java.io.FileInputStream;
import java.util.Properties;

public class PropUtil {

	public String toReadDataFromProp(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\A14CommData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}

}
