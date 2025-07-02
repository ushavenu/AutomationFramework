package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.get("https://www.myntra.com/");
		//driver.get("http://www.instagram.com/");		
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Instagram"))		
		{
			System.out.println("Login Page is Displayed");
		}
		else
		{
		  System.out.println("Login page not displayed");
		}
	
		//String title = driver.getTitle();
		//System.out.println(title);
		//if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		//{
			//System.out.println("Welcome Page is Displayed");
		//}
		//else
		//{
			//System.out.println("Welcome page not Displayed");			
		//}
	}
}
		

	


