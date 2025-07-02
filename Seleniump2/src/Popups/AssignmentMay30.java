package Popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AssignmentMay30 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ScrollFacebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		Actions act = new Actions(driver);
		act.scrollToElement(ScrollFacebook).perform();
		driver.findElement(By.linkText("Facebook")).click();
		SwitchToWindow(driver,"facebook");
		
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		SwitchToWindow(driver,"facebook.com/reg");
		WebElement month = driver.findElement(By.id("month"));
		
		Select sel = new Select(month); 
		sel.selectByIndex(11);		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshots/"+Time+".png");
		FileHandler.copy(temp, dest);
		driver.quit();
		
	}
	
	public static void SwitchToWindow(WebDriver driver,String ExpUrl)
	{
		Set<String> AllwindowIds = driver.getWindowHandles();
				
		for (String Id:AllwindowIds)
		{
			driver.switchTo().window(Id);
			String ActulUrl = driver.getCurrentUrl();
			if(ActulUrl.contains(ExpUrl))
			{
				break;
				
				
			}			
		}
		
		
	}
	
	
	}


