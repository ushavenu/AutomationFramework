package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sunil%20Samay/Desktop/Login.html");
		
		//** example for Absolute Xpath */
		//driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Vandana");
		
		/** Example for Relative Xpath */
		driver.findElement(By.xpath("//input[1]")).sendKeys("Vandana");
	}

}
