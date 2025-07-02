package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String BusTitle = driver.getTitle();
		System.out.println(BusTitle);
		
		if(BusTitle.equals("Bus Ticket Booking Online at Cheapest Price with Top Bus Operators- redBus"))
		{
			System.out.println("Welcome Page is Displayed");
		}
		else 
		{
			System.out.println("Welcome Page is  not Displayed");
		}
		
		String BusPageSource = driver.getPageSource();
		System.out.println(BusPageSource);
		driver.quit();
	}

}
