package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnSwitchTo {
	public static void main(String[] args) throws InterruptedException 
	{

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);		
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();	
		for(String Id:allWindowIds)
		{
			driver.switchTo().window(Id);	
			String url = driver.getCurrentUrl();
			//**1. closing single child window */
			if(url.equals("https://www.amazon.in/"))
			{
			   driver.close();
			}
			
			//** 2.capture the Title of flipkart and maximize ebay */
			//if(url.equals("https://www.flipkart.com/")) {
				//System.out.println(driver.getTitle());
			//}
			//else if(url.equals("https://www.ebay.com/"))
			//{
				//driver.manage().window().maximize();
			
			//}
			
			//**3. using contains n break */
			//if(url.contains("ebay"))
			//{
				//break;
			//}
			//driver.manage().window().maximize();
			//System.out.println(driver.getTitle());
			
			
		}
	  } 
}
	
	
	
	
	  
		
	

