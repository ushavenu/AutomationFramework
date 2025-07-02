package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnStaleElement {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		//WebElement SearchTF = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]"));
		//SearchTF.sendKeys("mobiles",Keys.ENTER);
		//SearchTF.sendKeys("Shoes");
		
		MyntraPage pg = new MyntraPage(driver);
		pg.getSerachTextField().sendKeys("Mobiles",Keys.ENTER);
		pg.getSerachTextField().sendKeys("Shoes");		
		
		
	}

}
