package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentApril28
	{
	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aashrita");
		driver.findElement(By.id("LastName")).sendKeys("Samay");
		driver.findElement(By.id("Email")).sendKeys("aashrita25@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("aashrita@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("aashrita@123");
		driver.findElement(By.id("register-button")).click();
		
		
	}

}
