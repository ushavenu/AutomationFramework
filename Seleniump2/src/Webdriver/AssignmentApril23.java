package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentApril23 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		/**1. Go to MakeMytrip Application */
		driver.get("https://www.makemytrip.com/");	
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//** 2.verify welcome page is displayed or not */ 
		if(Title.equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"))
		{
			System.out.println("Welcome page is Displayed");
		}
		else
		{
			System.out.println("Welcome Page is Not Displayed");
		}
		//** 3.Then Refresh the webpage */
		driver.navigate().refresh();
		
		//** 4.Capture the Url of an Application */
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		//** 5.Then print the window id */
		driver.manage().window().maximize();
		String WindowId = driver.getWindowHandle();
		System.out.println(WindowId);
		
		//** 6.Then Close the window using quit */
		driver.quit();
		
	}

}
