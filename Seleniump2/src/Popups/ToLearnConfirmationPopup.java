package Popups;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("submit")).click();
		Alert PopUp = driver.switchTo().alert();
		System.out.println(PopUp.getText());
		PopUp.accept();
		Thread.sleep(2000);
		System.out.println(PopUp.getText());
		PopUp.accept();
		
	}
	

}
