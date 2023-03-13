package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
	private POMFactory factory = new POMFactory();
	
	
	@When("User click on Sign in option")
	public void userClickOnSignInBtn() {
		click(factory.homePage().signInButton);
		logger.info("user clicked on sign in option");
		
	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passwordValue);
		logger.info("User Entered email " + emailValue + "user Entered password " + passwordValue );
	}
	
	@And("User click on login button")
	public void userClickOnLoginButton() {
		fluientwaitforElement(factory.signInPage().loginPageButton, 10, 1);
		click(factory.signInPage().loginPageButton);
		logger.info("Login button is enabled");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInintoAccount() {
		waitTillPresence(factory.homePage().LogOutButton);
	Assert.assertTrue(isElementDisplayed(factory.homePage().LogOutButton));
	}

	@When("User click on create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountButton);
		logger.info("user clicked on create new acount button");
	    
	}

	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameField, signUpInformation.get(0).get("name"));
		sendText(factory.signInPage().EmailFieldForAccountCreation, signUpInformation.get(0).get("email"));
		sendText(factory.signInPage().passwordForAccountCreation, signUpInformation.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordForAccountCreatio, signUpInformation.get(0).get("confirmPassword"));
	   
	}

	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().SignUpBtnAccountCreation);
		logger.info("User clicked on sign up button");
	 
	}

	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillPresence(factory.signInPage().accountbtnForAssertion);
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountbtnForAssertion));
		logger.info("user is logged in into account page");
	    
	}
}
