package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Aashrita");
		driver.findElement(By.id("pass")).sendKeys("Samay@123");
		
	}

}
