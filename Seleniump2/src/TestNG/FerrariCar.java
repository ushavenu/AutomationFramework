package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FerrariCar {
	
	@Test(groups = "smoke")
	
	public void Ferrarilaunch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ferrari.com/en-IN");
		Reporter.log("FerrariCar Execution",true);
	}

}
