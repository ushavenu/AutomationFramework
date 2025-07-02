package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentApril25 {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		SwitchToWindow(driver, "amazon");
		System.out.println(driver.getTitle());
		
		SwitchToWindow(driver, "ebay");
		//driver.quit();
	}
	
	public static void SwitchToWindow(WebDriver driver,String expUrl) 
	{
		Set<String> allwindowIds = driver.getWindowHandles();
		for(String Id:allwindowIds)
		{
			driver.switchTo().window(Id);
			String actualUrl = driver.getCurrentUrl();
			if(actualUrl.equals(expUrl))
			{
				break;
				
			}
			
		}			
	}
}
