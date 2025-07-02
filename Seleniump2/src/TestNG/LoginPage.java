package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration
	@FindBy(name="email")
	private WebElement emailtext;
	
	@FindBy(name ="pass")
	private WebElement passwordtext;
	
	@FindBy(name="login")
	private WebElement LoginButton;
	
	//Initialization	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	//Getters
	
	public WebElement getEmailtext() {
		return emailtext;
	}

	public WebElement getPasswordtext() {
		return passwordtext;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
	
	
	
	

}
