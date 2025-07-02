package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript3 extends BaseClass{
	@Test(groups = "integration")
	public void ClickOnGiftCards()
	{
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards", "Gift Cards page is not displayed");
		Reporter.log("Gift Cards page is displayed",true);			
		
	}

}
