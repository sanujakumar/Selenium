package seleniumbasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testleaf {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
			System.out.println("openBrowser");
			System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
			WebDriver leaf= new ChromeDriver();
			leaf.get("https://leafground.com");
			WebElement link= leaf.findElement(By.xpath("//span[text()='Element']/parent::a[@href='#']"));
			link.click();
			WebElement hyperLink=leaf.findElement(By.xpath("//span[text()='Hyper Link']"));
			hyperLink.click();
			WebElement dashBoard=leaf.findElement(By.linkText("Go to Dashboard"));
			dashBoard.click();
			leaf.get("https://leafground.com/select.xhtml");
			
			WebElement select = leaf.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
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
			
			leaf.get("https://leafground.com/table.xhtml");
			
			List<WebElement> tableRows=leaf.findElements(By.xpath("//table[@role='grid']//tr"));
			int tr=tableRows.size();
			System.out.println(tr);
			
			List<WebElement> tableColumns=leaf.findElements(By.xpath("//table[@role='grid']/thead[@class='ui-datatable-scrollable-theadclone']//th"));
			int tc=tableColumns.size();
			System.out.println(tc);

			
			
			
			
			
			
			
	}

}
