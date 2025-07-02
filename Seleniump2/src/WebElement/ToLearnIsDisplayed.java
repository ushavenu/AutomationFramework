package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsDisplayed {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		boolean Status = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
		System.out.println(Status);
		
	}

}
