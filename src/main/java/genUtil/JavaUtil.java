package genUtil;

import java.util.Random;

public class JavaUtil {

	public int randomNumber() {
		Random ran = new Random();
		int nextInt = ran.nextInt(10000);
		return nextInt;
	}
	
}
