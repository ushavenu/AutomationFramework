package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yemaha {
	
	@Test(groups="smoke")
	public void launch()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Reporter.log("Yemaha Launched",true);
	}
	

}
