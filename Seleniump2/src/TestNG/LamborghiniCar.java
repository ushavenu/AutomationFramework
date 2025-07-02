package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LamborghiniCar {
	
	@Test(groups = "integration")
	
	public void launchLamborghiniCar()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carwale.com/lamborghini-cars/");
		Reporter.log("LamborghiniCar Execution",true);
	}

}
