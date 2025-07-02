package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_April30 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//** 1.Go to demoworkshop app */
		driver.get("https://demowebshop.tricentis.com/");
		//** 2. capture the Url and Verify */
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		if(Url.equals("https://demowebshop.tricentis.com/"))
		{
			System.out.println("Welcome SignIn page is displayed");
		}
		else
		{
			System.out.println("Welcome SignIn page is not displayed");
		}
		 //** Then click on "vote" button using CssSelector */
		driver.findElement(By.cssSelector("input[value='Vote']")).click();
		
	}

}
