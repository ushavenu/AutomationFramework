package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToHandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(2000);
         Alert Popup = driver.switchTo().alert();
         System.out.println(Popup.getText());//To Capture Popup Message
        // Popup.accept();//To click on ok button
         Popup.dismiss();//Similar to accept
		

	}

}
