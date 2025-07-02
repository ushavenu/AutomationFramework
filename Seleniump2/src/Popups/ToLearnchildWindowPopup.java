package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnchildWindowPopup {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		
		switchToWindow(driver, "amazon");
		System.out.println(driver.getTitle());
		switchToWindow(driver, "shoppersstack");
		driver.close();
		switchToWindow(driver, "flipkart");
		driver.close();
	}
	
	public static void switchToWindow(WebDriver driver,String ExpUrl)
	{
       Set<String> AllwindowIds = driver.getWindowHandles();
		
		for(String Id: AllwindowIds)
		{
			driver.switchTo().window(Id);			
			String ActualUrl = driver.getCurrentUrl();			
			if(ActualUrl.contains("ExpUrl"))
			{
				break;
				
			}			
		}		
		
	}
}


