package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class DemoWorkShopBaseClass {
	public static WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");			
	}
	
	@BeforeMethod(alwaysRun = true)
	public void ClickOnBooks()
	{
		driver.findElement(By.partialLinkText("Books")).click();
	}
	
	public void ClickOnComputers()
	{
		
		driver.findElement(By.partialLinkText("Computers")).click();
	}
	
	public void ClickOnElectronics()
	{
		driver.findElement(By.partialLinkText("Electronics")).click();	
	}
	
	@AfterClass(alwaysRun = true)

	public void CloseBroser()
	{
		driver.quit();
	}
	
	

	

}
