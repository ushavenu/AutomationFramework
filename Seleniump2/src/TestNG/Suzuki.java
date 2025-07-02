package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Suzuki {
	
	@Test(groups="smoke")
	public void launch()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.suzukimotorcycle.co.in/");
		Reporter.log("Suzuki Launched",true);
	}
	

}
