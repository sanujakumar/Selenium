package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreThanOneElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
		WebDriver leaf= new ChromeDriver();
		leaf.get("https://leafground.com/table.xhtml");
		
		List<WebElement> tableRows=leaf.findElements(By.xpath("//table[@role='grid']//tr"));
		int tr=tableRows.size();
		System.out.println(tr);
		
		List<WebElement> tableColumns=leaf.findElements(By.xpath("//table[@role='grid']/thead[@class='ui-datatable-scrollable-theadclone']//th"));
		int tc=tableColumns.size();
		System.out.println(tc);


	}

}
