package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(40000);
		// below u can learn in Locators
		driver.findElement(By.id("compare")).click();
		
		driver.quit();
		  

	}

}
