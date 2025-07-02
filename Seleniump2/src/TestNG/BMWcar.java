package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BMWcar {
	@Test(groups = "Reggression")
	
	public void BMWlaunchCar()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("BMWcar Execution,true");
	}

}
