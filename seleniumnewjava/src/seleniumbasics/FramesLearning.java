package seleniumbasics;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesLearning {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
						
				System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://leafground.com/frame.xhtml");
				driver.manage().window().maximize();
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//button[@id='Click']")).click();
				driver.switchTo().defaultContent();
				 int count=driver.findElements(By.tagName("iframe")).size();
				 System.out.println(count);
				 driver.switchTo().frame(2);
				 driver.switchTo().frame(0);
		         driver.findElement(By.xpath("//button[@id='Click']")).click();
		         driver.switchTo().defaultContent();
		         driver.close();
			
				 



		


	}

}
