package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TestScriptLoginPage {
	
	@Test
	
	public void Facebooklogin() throws IOException
	{
		
	FileInputStream fis = new FileInputStream("./TestData/TestNGCommondata.properties");
	Properties Prop = new Properties();
	Prop.load(fis);
	String Url=Prop.getProperty("url");
	String Email = Prop.getProperty("email");
	String Password = Prop.getProperty("password");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(Url);
	
	LoginPage Pg = new LoginPage(driver);
	Pg.getEmailtext().sendKeys(Email);
	Pg.getPasswordtext().sendKeys(Password);
	Pg.getLoginButton().click();
	String Time = LocalDateTime.now().toString().replace(":", "-");
	 WebElement ele = driver.findElement(By.xpath("//button[@id='loginbutton']"));
	 if(ele.isDisplayed())
	 {
		 	TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest= new File("./Screenshots/"+Time+".png");
			FileHandler.copy(temp, dest);
			
	 }
	}
}
