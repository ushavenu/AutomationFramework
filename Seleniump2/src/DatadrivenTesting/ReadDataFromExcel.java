
package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1: Create FileInputStream Object
		FileInputStream fis = new FileInputStream("./TestData/TestScriptData.xlsx");
		
		//Step 2: Create respective file type Object
		Workbook Wb = WorkbookFactory.create(fis);
     
		//Step 3: Call read methods
		String Url = Wb.getSheet("Sheet3").getRow(1).getCell(0).getStringCellValue();
		System.out.println(Url);
		
		double Price = Wb.getSheet("Sheet3").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(Price);
		
		boolean Status = Wb.getSheet("Sheet3").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(Status);
		
		  LocalDateTime date = Wb.getSheet("Sheet3").getRow(1).getCell(5).getLocalDateTimeCellValue();
		  System.out.println(date.getDayOfMonth());
		  System.out.println(date.getMonth());
		  System.out.println(date.getYear());

	}

}
