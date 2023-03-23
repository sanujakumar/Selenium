package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//span[text()='Open']/parent::button")).click();
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		System.out.println(driver.getTitle());
		for (String  window : allwindows) {
			if(!parentwindow.equals(window)) {
				driver.switchTo().window(window); 
				break;
			}
		}
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindow);
		driver.quit();

	}

}
