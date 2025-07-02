package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AssignmentMay26 {
	
	public static void main(String[] args) throws IOException {
		
		String Time = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//1.Go to Demoapps.qspiders.com
		driver.get("https://demoapps.qspiders.com/");
		//2.click on UI Testing Concepts
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		//3.Click on Button
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		//4.Click on Right click
	    driver.findElement(By.xpath("//a[text()='Right Click']")).click();
	    //5.Then Right click on RightClick Button
	    WebElement RightClickButton=driver.findElement(By.xpath("//button[@id='btn_a']"));
	    
		 
		 Actions act = new Actions(driver);
	     act.contextClick(RightClickButton).perform();
	     //driver.findElement(By.xpath("//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']"));
	     //6.Then Click on Yes
	     driver.findElement(By.xpath("//div[text()='Yes']")).click();
	     //7.Then Capture the text and color of that text
	     String textname = driver.findElement(By.xpath("//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']")).getText();
	     System.out.println(textname);
	     
	     String TextColor = driver.findElement(By.xpath("//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']")).getCssValue("Color");
	     System.out.println(TextColor);
	     
	     //8.Then Take Screenshot
	        TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest= new File("./Screenshots/"+Time+".png");
			FileHandler.copy(temp, dest);
			
		//9.close the Browser	
			driver.quit();
	     
	     
	     
	     
		
		
	}

}
