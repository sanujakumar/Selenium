package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cosmocode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://cosmocode.io/automation-practice-webtable/");
	    
	    List<WebElement> tableColumns = driver.findElements
	    		(By.xpath("//table[@id='countries']/tbody/tr[2]/td"));
	    
	    int tc = tableColumns.size();
	    System.out.println(tc);
	    
	    List<WebElement> tableRows = driver.findElements
	    		(By.xpath("//table[@id='countries']/tbody/tr"));
	    int tr = tableRows.size();
	    System.out.println(tr);
	    			
	   WebElement countryIndia = driver.findElement
			   (By.xpath("//strong[text()='India']/parent::td/preceding-sibling::td/"
			   		+ "input[@class='hasVisited']"));
	   countryIndia.click();
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	
	}

}
