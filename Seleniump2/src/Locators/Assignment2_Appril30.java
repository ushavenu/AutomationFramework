package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_Appril30 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//** Go to Login Page (We Created)*/
		driver.get("file:///C:/Users/Sunil%20Samay/Desktop/Login.html");
		//** click on selenium Checkbox using Absolute Xpath */
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		//** Then Click on radio button using relative Xpath */
		driver.findElement(By.xpath("//input[6]")).click();
	}
}
