package Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)

public class TestScript  extends BaseClass{
	@Test
	public void Login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("virat18rcb@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("virat@1");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","home Page is not displayed" );
		Reporter.log("home Page is Displayed",true);
		
		
		
		
		
	}

}
