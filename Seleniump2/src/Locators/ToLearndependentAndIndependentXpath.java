package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearndependentAndIndependentXpath {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.get("https://www.shoppersstack.com/");
		//driver.findElement(By.xpath("//span[text()='ROADSTER']/../..//button[@name='addToCart']")).click();
		////span[text()='ROADSTER']/..//span[text()='% off']
		driver.findElement(By.xpath("//label[text()='Poor']/..//input[@type='radio']")).click();
	}

}
