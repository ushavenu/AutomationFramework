package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMay9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//1.Go To Demoworkshop app
		driver.get("https://demowebshop.tricentis.com/");
		//2.check Excellent button is displayed or not
	    boolean status = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']")).isDisplayed();	
		System.out.println(status);
		
		//3.Then click on that Radio button 
		 WebElement radioBtn = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']"));
		 radioBtn.click();
		 
		 //4.then Check it is selected or not
		 
		 System.out.println(radioBtn.isSelected());
		
		
		
	}

}
