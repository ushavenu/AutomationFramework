package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.vtiger.com/");
	WebElement Features = driver.findElement(By.partialLinkText("Features"));
	Actions act = new Actions(driver);
	act.moveToElement(Features).perform();
	
	WebElement Mousehover = driver.findElement(By.partialLinkText("Sales Automation"));
	act.moveToElement(Mousehover).perform();
	
	Thread.sleep(10000);	
	//MoveByOffset(0,0) X and Y Coordinates using this also mousehover can perform depends on Resolution
	act.moveByOffset(413, 138).perform();			
	
	}

}
