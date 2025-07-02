package Webdriver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentApril24 {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get("https://www.shoppersstack.com/products_page/23");
	Thread.sleep(20000);		
	driver.findElement(By.id("compare")).click();
	
	//** 1.close all the child windows */
	//Set<String> allwindowIds = driver.getWindowHandles();
	//for(String Id:allwindowIds) 
	//{
		//driver.switchTo().window(Id);
		//String Url = driver.getCurrentUrl();
		//if(!Url.contains("shopperstack")) 
		//{
			//driver.close();
		//}
	//}
	
	// **2. swap flipkart position to ebay position n ebay position to flipkart */
	switchToWindow(driver, "flipkart");
	Point flposition = driver.manage().window().getPosition();
	//System.out.println(flposition.getX());
	//System.out.println(flposition.getY());
	
	switchToWindow(driver, "ebay");
	Point ebposition = driver.manage().window().getPosition();
	
	driver.manage().window().setPosition(flposition);
	
	switchToWindow(driver,"flipkart");
	driver.manage().window().setPosition(ebposition);
	driver.quit();	
	}
	
	public static void switchToWindow(WebDriver driver,String  expUrl)
	{
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String Id:allWindowIds)
		{
			driver.switchTo().window(Id);
			String actulUrl = driver.getCurrentUrl();
			if(actulUrl.contains(expUrl))	
			{
				break;
			}
		}		
	}
}


