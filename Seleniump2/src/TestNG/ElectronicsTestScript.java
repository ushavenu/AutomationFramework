package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ElectronicsTestScript extends DemoWorkShopBaseClass {
	
	@Test(groups = "smoke")
	public void ClickOnElectronics()
	{
		driver.findElement(By.partialLinkText("Electronics")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics", "Electronics page is not displayed");
		Reporter.log("Electronics page is displayed",true);	
							
	}

}
