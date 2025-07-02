package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class honda {
	

	@Test(groups="Regrresion")
	public void launch()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hondacarindia.com/");
		Reporter.log("honda Launched",true);
	}

}
