package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment29 {
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/** Capture the title and Verify */
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Login Page is Displayed");				
	    }
		else
		{
			System.out.println("login Page is not Displayed");
		}
		/** click on Contaact uploading and non user */
		/** Then count how many headinds are present in that page */
		
		 List<WebElement> CountallHeading = driver.findElements(By.tagName("a"));
		 System.out.println(CountallHeading.size());
		
		
		
		
	}

}
