package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		if(Url.equals("https://www.flipkart.com/")) {
			System.out.println("Welcome Page is Displayed");
		}
		else
		{
			System.out.println("Welcome Page is not Displayed");

		}
	}

}
