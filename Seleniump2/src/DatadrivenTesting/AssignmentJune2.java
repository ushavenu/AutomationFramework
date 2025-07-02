package DatadrivenTesting;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentJune2 {

	public static void main(String[] args) throws IOException {
		
		//Step 1 : Create FileInput Stream Object
		FileInputStream fis = new FileInputStream("./SauceTestData/CommonTestdata.Properties");
		
		//Step 2 :Create respective file type object
		Properties Prop = new Properties();
		
		// Step 3: Call Methods
		  Prop.load(fis);
		  
		  
		//String URL = Prop.getProperty("url");
		//String Username = Prop.getProperty("username");
		//String Password = Prop.getProperty("Password");
		
           String Time=LocalDateTime.now().toString().replace(":", "-");		
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       
	       //Prop.getProperty("username"),Prop.getProperty("Password") fetched from CommonTestdata.Properties
	       driver.get(Prop.getProperty("url"));
	       driver.findElement(By.id("user-name")).sendKeys(Prop.getProperty("username"));
	       driver.findElement(By.id("password")).sendKeys(Prop.getProperty("Password"));
	       driver.findElement(By.id("login-button")).click();
	       
	       //Then Take Screenshot of Web page
	        TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest= new File("./Screenshots/"+Time+".png");
			FileHandler.copy(temp, dest);
			
		

	}

}
