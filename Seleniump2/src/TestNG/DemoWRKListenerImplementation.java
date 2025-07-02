package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import TestNG.DemoWorkShopBaseClass;

public class DemoWRKListenerImplementation extends DemoWorkShopBaseClass implements ITestListener 
{

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test script is Passed",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/demoerror.png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("Test Script is Skipped",true);
		
	}
	
	
	

}
