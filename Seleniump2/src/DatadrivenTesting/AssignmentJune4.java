package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentJune4 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Create FileInputStream Object
		FileInputStream fis = new FileInputStream("./TestData/TestScriptData.xlsx");
		FileInputStream fis1 = new FileInputStream("./TestData/commondata.properties");
		
		//Create respective FileType object
		Properties Prop = new Properties();
		Workbook Wb = WorkbookFactory.create(fis);
		
		//Call Methods
		Prop.load(fis1);
		
		     String Url = Prop.getProperty("url");
		     String FirstName = Wb.getSheet("Sheet4").getRow(1).getCell(0).getStringCellValue();
		     System.out.println(FirstName);
		     String LastName = Wb.getSheet("Sheet4").getRow(1).getCell(1).getStringCellValue();	    
		     String Email = Wb.getSheet("Sheet4").getRow(1).getCell(2).getStringCellValue();    
		     String Password = Wb.getSheet("Sheet4").getRow(1).getCell(3).getStringCellValue();	     
		     String ConfirmPassword = Wb.getSheet("Sheet4").getRow(1).getCell(4).getStringCellValue();
		     
		    
		     WebDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		     driver.get(Url);
		     
		     driver.findElement(By.linkText("Register")).click();
		     driver.findElement(By.id("gender-male")).click();
		     driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		     driver.findElement(By.id("LastName")).sendKeys(LastName);
		     driver.findElement(By.id("Email")).sendKeys(Email);
		     driver.findElement(By.id("Password")).sendKeys(Password);
		     driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
		     
		     
		
		
				
		
	}

}
