package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ComputersTestScript extends DemoWorkShopBaseClass {
	@Test
	
	public void ClickOnComputers()
	{
		driver.findElement(By.partialLinkText("Computers")).click();	
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "Computer page is not displayed");
		Reporter.log("Computer page is displayed",true);
				
	}

}
