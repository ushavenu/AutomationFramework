package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetwindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> MultipleWindowIds = driver.getWindowHandles();
		System.out.println(MultipleWindowIds);
		//** Print one after other using foreach loop */
		for(String Id:MultipleWindowIds)
		{
			System.out.println(Id);	
		}	
		driver.quit();	
	}
}
