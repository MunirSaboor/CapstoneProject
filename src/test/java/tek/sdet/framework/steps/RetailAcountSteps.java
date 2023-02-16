package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAcountSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void user_click_on_account_option() {
		click(factory.accountPage().AccountBtn);
		logger.info("User clicked on Account Button");

	}

	@And("User update Name and Phone")
	public void userUpdateNameAndPhoneValue(DataTable dataTable) {
		List<Map<String, String>> profileInformation = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().NameAccountInput);
		clearTextUsingSendKeys(factory.accountPage().PhoneNumberInput);
		sendText(factory.accountPage().NameAccountInput, profileInformation.get(0).get("name"));
		sendText(factory.accountPage().PhoneNumberInput, profileInformation.get(0).get("phone number"));
		logger.info("User Entered the required values");

	}

	@And("User click on Update button")
	public void user_click_on_update_button() {
		waitTillClickable(factory.accountPage().UpdateButton);
		fluientwaitforElement(factory.accountPage().UpdateButton, 15, 1);
		click(factory.accountPage().UpdateButton);
		logger.info("User clicked on update button");

	}

	@Then("user profile information should be updated")
	public void user_profile_information_should_be_updated() {
		waitTillPresence(factory.accountPage().UpdatedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().UpdatedSuccessfullyMessage));
		logger.info("user profile information should be updated");
	}

	@When("User enter below information")
	public void user_enter_below_information(DataTable dataTable) {
		List<Map<String, String>> PasswordChangeField = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassword, PasswordChangeField.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPassword, PasswordChangeField.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPassword, PasswordChangeField.get(0).get("confirmPassword"));
		logger.info("User entered required information");

	}

	@When("User click on Change Password button")
	public void user_click_on_change_password_button() {
		waitTillClickable(factory.accountPage().changePasswordBtn);
		click(factory.accountPage().changePasswordBtn);
		logger.info("User clicked on Change Password button");

	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void a_message_should_be_displayed_password_updated_successfully() {
		waitTillPresence(factory.accountPage().passwordUpdateSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdateSuccessfullyMessage));
		logger.info("a message should be displayed ‘Password Updated Successfully’");

	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().AddPaymentMethodLink);
		logger.info("User clicked on add a payment method link");

	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> creditCardInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().CardNumberFieldAccountPage, creditCardInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().NameOnCardField, creditCardInfo.get(0).get("nameOnCard"));
		selectByIndex(factory.accountPage().CardExpirationMonth, 3);
		selectByIndex(factory.accountPage().CardExpiratonYearInput, 1);
		sendText(factory.accountPage().SecurityCodeInput, creditCardInfo.get(0).get("securityCode"));
		logger.info("User filled Debit or credit card information");
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().AddYourCardButton);
		logger.info("User clicked on add your card button");

	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(factory.accountPage().PaymentMethodAddedSuccesfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodAddedSuccesfullyMessage));
		logger.info("a message should be displayed ‘Payment Method added successfully’");

	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().EditCardAccessButton);
		click(factory.accountPage().CardEditButton);
		logger.info("User clicked on Edit option of card section");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> EditCardInfo = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().updateCardNumberField);
		sendText(factory.accountPage().updateCardNumberField, EditCardInfo.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().updateNameOnCardField);
		sendText(factory.accountPage().updateNameOnCardField, EditCardInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().updateCardExpirationMonthInput, "12");
		selectByValue(factory.accountPage().UpdateCardExpirationYearInput, "2026");
		clearTextUsingSendKeys(factory.accountPage().updateCardSecurityCodeInnput);
		sendText(factory.accountPage().updateCardSecurityCodeInnput, EditCardInfo.get(0).get("securityCode"));
		logger.info("user successfully edited information with required data");

	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardButton);
		logger.info("user clicked on Update Your Card button");

	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().paymentMethodUpdatedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodUpdatedSuccessfullyMessage));
		logger.info("a message should be displayed ‘Payment Method updated Successfully’");

	}
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().EditCardAccessButton);
		click(factory.accountPage().removeCardButton);
		logger.info("User clicked on remove option of card section");
	  
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().EditCardAccessButton));
		logger.info("payment details should be removed");
	   
	}
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAdressButtonAccountPage);
		logger.info("User clicked on Add address option");
	   
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> AddressInformation = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryAddNewAddressWindow, AddressInformation.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().FullNameAddAddressWindow);
		sendText(factory.accountPage().FullNameAddAddressWindow, AddressInformation.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberAddAddressWindow);
		sendText(factory.accountPage().phoneNumberAddAddressWindow, AddressInformation.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().AddressFieldAddAddressWindow);
		sendText(factory.accountPage().AddressFieldAddAddressWindow, AddressInformation.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().aptNumberAddAddressWindow);
		sendText(factory.accountPage().aptNumberAddAddressWindow, AddressInformation.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityFieldAddAddressWindow);
		sendText(factory.accountPage().cityFieldAddAddressWindow, AddressInformation.get(0).get("city"));
		clearTextUsingSendKeys(factory.accountPage().stateAddAddressWindow);
		selectByVisibleText(factory.accountPage().stateAddAddressWindow, AddressInformation.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeAddAddressWindow);
		sendText(factory.accountPage().zipCodeAddAddressWindow, AddressInformation.get(0).get("zipCode"));
		logger.info("user filled new address form with below information");
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addYourAddressButtonAddAddressWindow);
		logger.info("User click Add Your Address button");
	 
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.accountPage().AddressAddedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().AddressAddedSuccessfullyMessage));
		logger.info("a message should be displayed ‘Address Added Successfully’");
	 
	}
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().AddressEditButton);
		logger.info("User clicked on edit address option");
	}
	
	
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateYourAddressButton);
		logger.info("User clicked update Your Address button");
	   
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().addressUpdatedSuccessfullyMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedSuccessfullyMessage));
		logger.info("a message should be displayed ‘Address Updated Successfully’");
		  
	}
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressButton);
        logger.info("User click on remove option of Address section");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementEnabled(factory.accountPage().removeAddressButton));
		logger.info("Address details should be removed");
	
	}

}
