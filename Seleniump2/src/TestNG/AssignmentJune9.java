package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssignmentJune9 {
	
	@Test
	public void AddAccount()
	{
		Reporter.log("Account Added Sucessfuly",true);
	}
	
	@Test(dependsOnMethods = "AddAccount")
	public void EditAccount()
	{
		Reporter.log("Edited Sucessfully",true);
	}
	
	@Test(dependsOnMethods = {"AddAccount","EditAccount"})
	public void DeleteAccount()
	{
		Reporter.log("Account Deleted Sucessfuly",true);
	}

}
