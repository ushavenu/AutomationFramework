package WebElement;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMay8 {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		//String ParentId = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Vtiger")).click();
		
		Set<String> allwindowsIds = driver.getWindowHandles();
		for(String id:allwindowsIds){
			driver.switchTo().window(id);
			String actualUrl = driver.getCurrentUrl();
			if(actualUrl.contains("https://www.vtiger.com/"))
			{
				break;
			}
		}
		driver.findElement(By.id("loginspan")).click();
		//driver.switchTo().window(ParentId);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		String color = driver.findElement(By.xpath("//p[@id='com-form-login-error']")).getCssValue("color");
		System.out.println(color);
		String BgColor = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("background-color");
		System.out.println(BgColor);
		driver.quit();
		}	
		
	}


