package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BooksTestScript extends DemoWorkShopBaseClass {
	@Test(groups = "smoke")
	public void ClickOnBooks()
	{
		driver.findElement(By.partialLinkText("Books")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page is not displayed");
		Reporter.log("Books page is displayed",true);		
		
	}
	

}
