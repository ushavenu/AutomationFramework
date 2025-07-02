package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	//Declaration
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(name="Gender")
	private WebElement Radiobutton;
	
	@FindBy(name="FirstName")
	private WebElement FirstNametext;
	
	@FindBy(name="LastName")
	private WebElement LastNametext;
	
	@FindBy(name="Email")
	private WebElement Emailtext;
	
	@FindBy(name="Password")
	private WebElement Passwordtext;
	
	@FindBy(name="ConfirmPassword")
	private WebElement ConfirmPasswordtext;
	
	
	//Initialization press control space for RegisterPage
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}


	//getters
	
	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getRadiobutton() {
		return Radiobutton;
	}


	public WebElement getFirstNametext() {
		return FirstNametext;
	}


	public WebElement getLastNametext() {
		return LastNametext;
	}


	public WebElement getEmailtext() {
		return Emailtext;
	}


	public WebElement getPasswordtext() {
		return Passwordtext;
	}


	public WebElement getConfirmPasswordtext() {
		return ConfirmPasswordtext;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
