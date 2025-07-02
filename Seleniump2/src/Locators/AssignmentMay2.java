package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMay2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//** Go to Demo workshop */
		driver.get("https://demowebshop.tricentis.com/login");
		//** enter email using xpath to identify the element */
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("aashrita@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("aashrita@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}


}
