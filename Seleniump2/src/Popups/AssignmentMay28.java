package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMay28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//1.Go to demoApp
	driver.get("https://demowebshop.tricentis.com/");
	//2.click on vote button
    driver.findElement(By.xpath("//input[@value='Vote']")).click();
    Alert VotePopUp = driver.switchTo().alert();
    //3.Capture the Alert message
    System.out.println(VotePopUp.getText());
    //4.Then Click on Ok button
    VotePopUp.accept();
	 
		

	}

}
