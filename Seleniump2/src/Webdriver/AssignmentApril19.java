package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentApril19 {
	public static void main(String[] args) {
		
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.myntra.com/");
	/** 1.open the MyntraApp in maximized mode*/
	   driver.manage().window().maximize();
	   
	  /** 2.Capture the Url and Print*/
	  String Url = driver.getCurrentUrl();
	  System.out.println(Url);                                                                                                                                                                                                                                                                                                       
	  if(Url.equals("https://www.myntra.com/")) 
	  {
		System.out.println("Welcome Page is Displayed");  
	  }
	  else
	  {
	   System.out.println("Welcome page is not Displayed");
	  }
	  
	  /** 3.Later Capture the Height and Width n print */
	   Dimension windowSize = driver.manage().window().getSize();
	   System.out.println(windowSize);
	  
	  /** 4.Resize the window to 750(Width)x900(height)*/
	  driver.manage().window().setSize(new Dimension(750, 900));

	  
	}

}
