package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		
		WebElement select = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dropDown = new Select(select);
		dropDown.selectByVisibleText("Cypress");
		dropDown.selectByIndex(1);
		List<WebElement> selectTool= dropDown.getOptions();

		for (WebElement options : selectTool) {
			System.out.println(options.getText());
		}
		int ab = selectTool.size();
		System.out.println(selectTool.size());
		
			
		for (int i=0;i<ab;i++) {
			dropDown.selectByIndex(i);
		}

	}

}
