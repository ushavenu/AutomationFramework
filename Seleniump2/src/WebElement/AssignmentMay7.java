package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMay7 {
	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtige gbhyhrcrm/");
		WebElement UserNameTF = driver.findElement(By.id("username"));
		UserNameTF.clear();
		UserNameTF.sendKeys("selenium");
		WebElement PasswordTF = driver.findElement(By.id("password"));
		PasswordTF.clear();
		PasswordTF.sendKeys("test@1234");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}

}
