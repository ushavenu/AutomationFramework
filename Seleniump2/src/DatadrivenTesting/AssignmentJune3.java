package DatadrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentJune3 {
	public static void main(String[] args) throws IOException {
		
		//Step 1: Create FileInputStream Object
		FileInputStream fis = new FileInputStream("./TestData/TestScriptData.xlsx");
		FileInputStream fis1 = new FileInputStream("./TestData/commondata.properties");
		
		//Step 2: Create respective File Type Object
	     Properties prop = new Properties();
	     Workbook Wb = WorkbookFactory.create(fis);
	     
	    // Step 3: Call Methods
	     prop.load(fis1);
	    String Url = (prop.getProperty("url"));
	   
	    
	     String FirstName = Wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
	     System.out.println(FirstName);
	     String LastName = Wb.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();	    
	     String Email = Wb.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();    
	     String Password = Wb.getSheet("Sheet2").getRow(1).getCell(3).getStringCellValue();	     
	     String ConfirmPassword = Wb.getSheet("Sheet2").getRow(1).getCell(4).getStringCellValue();	     
	     String Time = LocalDateTime.now().toString().replace(":", "-");
	     
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
	     
	        TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest= new File("./Screenshots/"+Time+".png");
			FileHandler.copy(temp, dest);
	     
	     
	     
	     
	   
      
	}

}
