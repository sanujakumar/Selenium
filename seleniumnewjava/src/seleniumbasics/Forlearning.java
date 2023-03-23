package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forlearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\eclipse -java\\seleniumnewjava\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		for(int i=0;i<=100;i++) {
			System.out.println("The iteration value is "+i);
		}
	
		for(int i=0;i<=100;i=i+2) {
			System.out.println("The iteration value is "+i);
		}
		for(int j=10;j>=0;j--) {
			System.out.println("The iteration value is "+j);

		}
		
		for(int i=0;i<=100;i++) {
        if(i>50) {
        	System.out.println(i+"=Pass");
        }else {
        	System.out.println(i+"=Fail");
        }
		}
	    int i=0;
	    while(i<10) {
	    	System.out.println(i);
	    	i++;
	    }
	    int j = 0;
	    do {
	      System.out.println(j);
	      j++;
	    }
	    while (j < 5);
	    for (int  a = 0; a < 10; a++) {
	    	  if (a == 4) {
	    	    break;
	    	  }
	    	  System.out.println(a);
	    	}
	    	 


	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
