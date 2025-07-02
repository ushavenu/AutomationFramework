package Test_June23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDream11 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		driver.findElement(By.id("regEmail")).sendKeys("872244");
		driver.findElement(By.linkText("GET APP LINK")).click();
		WebElement Errormsg = driver.findElement(By.id("errorMob"));
		System.out.println(Errormsg.getText());
		WebElement Aboutus = driver.findElement(By.partialLinkText("About Us"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("Window.scrollTo(500,5000)");	
	
		
		
	
		
	}

}
