package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AssignmentMay27 {

	public static void main(String[] args) throws InterruptedException, IOException {

	
		String Time = LocalDate.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		
		WebElement Photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(Photoframe);
		
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement Trash = driver.findElement(By.id("trash"));
		Actions act = new Actions(driver);
		act.dragAndDrop(img2, Trash).perform();
		act.dragAndDrop(img3, Trash).perform();
		
		//3.Then Click on CheetSheets
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='CheatSheets']")).click();
		//4.Click on Back n forward
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
		Thread.sleep(2000);
		
		Set<String> allwindowid = driver.getWindowHandles();
		for(String Id : allwindowid)
		{
			driver.switchTo().window(Id);
			String Url = driver.getCurrentUrl();
			System.out.println(Url);
			if(Url.contains("https://www.globalsqa.com/sql-cheat-sheet/")) {
				break;
			}
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.ScollTo(0,940");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshots/"+Time+".png");
		FileHandler.copy(temp, dest);
		

	}

}
