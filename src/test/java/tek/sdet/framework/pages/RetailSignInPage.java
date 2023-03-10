package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	// we are implementing PageFactory class to initialize the UI Elements // using
	// initElements method of PageFactory class // this method accepts two
	// parameters, first one is driver and second // is this keyword which referees
	// to variable of this class in this case // we are referring to UI elements
	// that will store in this class }
	
	@FindBy(xpath = "//h1[text()='Sign in']")
	public WebElement signPageLogo;
	@FindBy(id = "email")
	public WebElement emailField;
	@FindBy(id = "password")
	public WebElement passwordField;
	@FindBy(css = "#loginBtn")
	public WebElement loginPageButton;
	@FindBy(linkText = "Create New Account")
	public WebElement createNewAccountButton;
	@FindBy(id = "newCompanyAccount")
	public WebElement wantToSellSomethingLink;
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameField;
	@FindBy(css = "#emailInput")
	public WebElement EmailFieldForAccountCreation;
	@FindBy(xpath = "//input[@id='passwordInput']")
	public WebElement passwordForAccountCreation;
	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement confirmPasswordForAccountCreatio;
	@FindBy(tagName = "button")
	public WebElement SignUpBtnAccountCreation;
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement accountbtnForAssertion;
	

}

