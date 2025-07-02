package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Rectangle Rect = driver.findElement(By.xpath("//input[@value='Search']")).getRect();
		System.out.println(Rect.getHeight());
		System.out.println(Rect.getWidth());
		System.out.println(Rect.getX());
		System.out.println(Rect.getY());
	}

}
