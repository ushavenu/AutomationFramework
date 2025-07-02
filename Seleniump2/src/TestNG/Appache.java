package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Appache {
	
	@Test(groups="Regrresion")
	public void launch()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bikedekho.com/tvs-apache-bikes");
		Reporter.log("Appache Launched",true);
	}

}
