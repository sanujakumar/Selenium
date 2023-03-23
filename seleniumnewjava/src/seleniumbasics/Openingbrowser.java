package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openingbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("openbrowser");
			System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://twitter.com/i/flow/login");
	}

}
