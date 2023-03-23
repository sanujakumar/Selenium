package seleniumbasics;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowser {
	WebDriver driver;






			@BeforeTest
			@Parameters("browser")
			public void setup(String browser) throws Exception{
				//Check if parameter passed from TestNG is 'firefox'
				if(browser.equalsIgnoreCase("firefox")){
				//create firefox instance
					System.setProperty("webdriver.gecko.driver", "E:\\Testing\\firefox driver\\geckodriver");
					driver = new FirefoxDriver();
				}
				//Check if parameter passed as 'Chrome'
				else if(browser.equalsIgnoreCase("chrome")){
					//set path to chromedriver.exe
					System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
				}
						
				else{
					//If no browser passed throw exception
					throw new Exception("Browser is not correct");
				}
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
			
			@Test
			public void testParameterWithXML() throws InterruptedException{
				driver.get("http://demo.guru99.com/V4/");
				
				WebElement userName = driver.findElement(By.name("uid"));
				userName.sendKeys("guru99");
				
				WebElement password = driver.findElement(By.name("password"));
				password.sendKeys("guru99");
			
		
		
			
		
		
	}

}

