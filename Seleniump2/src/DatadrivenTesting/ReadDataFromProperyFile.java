package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Step 1: Create FileInputStream object
		FileInputStream fis = new FileInputStream("./TestData/commondata.properties");
		
		//Step 2: Create respective file type object
		Properties prop = new Properties();
		
		//Step 3: Call read Methods
		prop.load(fis);
		String URL = prop.getProperty("url");
		
		//String Email = prop.getProperty("email");
		//String Passord = prop.getProperty("password");
		
		//System.out.println(URL);
		//System.out.println(Email);		
		//System.out.println(Passord); 
		
		
		//without making hardcode we use datadriven 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
		
		
		
		
		

	}

}
