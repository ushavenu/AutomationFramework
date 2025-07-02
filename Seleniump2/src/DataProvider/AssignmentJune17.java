package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentJune17 {
	
	@Test(dataProviderClass =DataStorageAssgnmentJune17.class,dataProvider = "RegisterData")
	public void Register(String[] cred)
	{
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://demowebshop.tricentis.com/");
	   driver.findElement(By.linkText("Register")).click();
	   driver.findElement(By.id("FirstName")).sendKeys(cred[0]);
	   driver.findElement(By.id("LastName")).sendKeys(cred[1]);
	   driver.findElement(By.id("Email")).sendKeys(cred[2]);
	   driver.findElement(By.id("Password")).sendKeys(cred[3]);
	   driver.findElement(By.id("ConfirmPassword")).sendKeys(cred[4]);
	   
	}
}
