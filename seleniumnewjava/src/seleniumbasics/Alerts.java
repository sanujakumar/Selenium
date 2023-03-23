package seleniumbasics;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement alertBox=driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
		alertBox.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement sweetAlert = driver.findElement(By.xpath("//span[text()='Delete']"));
		sweetAlert.click();

		Alert confirmAlert = driver.switchTo().alert();

		confirmAlert.dismiss();
	    
		
	}

}
