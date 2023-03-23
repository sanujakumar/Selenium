package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		WebElement download=driver.findElement(By.xpath("//span[contains (text(),'Download')]"));
		download.click();
		
		
	    

	}

}
