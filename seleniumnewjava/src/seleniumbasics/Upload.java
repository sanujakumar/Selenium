package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement uploadBtn = driver.findElement(By.xpath("(//h5[text()='Basic Upload']/following-sibling::form//input)[2]"));
		uploadBtn.sendKeys("C:\\Users\\User\\Desktop\\SSJS may till oct sanu");

	}

}
