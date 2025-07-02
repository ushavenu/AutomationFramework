package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationConfiguration {
	@BeforeSuite
	public void beforesuite()
	{
		Reporter.log("@BeforeSuite",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("@BeforeTest",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("@BeforeClass",true);
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		Reporter.log("@BeforeMethod",true);
	}
	
	@Test
	public void demo()
	{
		Reporter.log("@Test(demo) execeuted",true);
	}
	
	@Test
	public void sample()
	{
		Reporter.log("@Test(sample) execeuted",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("@AfterMethod",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("@AfterClass",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("@AfterTest",true);
	}

	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("@AfterSuite",true);
	}
}
