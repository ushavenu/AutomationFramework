package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByContains {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//driver.findElement(By.xpath("//div[contains(text(),'Refund')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'reschedule ')]")).click();
		
		
	
	
	}

}
