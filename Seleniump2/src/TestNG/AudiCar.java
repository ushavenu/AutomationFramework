package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AudiCar {
	
	@Test(groups = "smoke")
	public void launchAuduCar()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.audi.in/en/");
		Reporter.log("AudiCar Execution",true);
		
	}

}
