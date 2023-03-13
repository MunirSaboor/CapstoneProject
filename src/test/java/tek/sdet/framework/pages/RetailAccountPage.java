package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(css = "#profileImage")
	public WebElement yourProfileImage;
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement AccountBtn;
	@FindBy(xpath = "//input[@id = 'nameInput']")
	public WebElement NameAccountInput;
	@FindBy(css = "#personalPhoneInput")
	public WebElement PhoneNumberInput;
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement UpdateButton; 
	@FindBy(xpath = "//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement UpdatedSuccessfullyMessage;
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPassword;
	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public WebElement newPassword;
	@FindBy(name = "confirmPassword")
	public WebElement confirmPassword;
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement changePasswordBtn;
	@FindBy(xpath = "//div[contains(text(),'Password Updated Successfully')]")
	public WebElement passwordUpdateSuccessfullyMessage;
	@FindBy(xpath = "//*[text()='Add a payment method']")
	public WebElement AddPaymentMethodLink;
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement CardNumberFieldAccountPage;
	@FindBy(xpath = "//*[@id='nameOnCardInput']")
	public WebElement NameOnCardField;
	@FindBy(css = "#expirationMonthInput")
	public WebElement CardExpirationMonth;
	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement CardExpiratonYearInput;
	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement SecurityCodeInput;
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement AddYourCardButton;
	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement PaymentMethodAddedSuccesfullyMessage;
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement CardEditButton;
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement updateCardNumberField;
	@FindBy(css = "#nameOnCardInput")
	public WebElement updateNameOnCardField;
	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement updateCardExpirationMonthInput;
	@FindBy(css = "#expirationYearInput")
	public WebElement UpdateCardExpirationYearInput;
	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement updateCardSecurityCodeInnput;
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement updateYourCardButton;
	@FindBy(xpath = "//*[contains(text(),'Payment Method updated Successfully')]")
	public WebElement paymentMethodUpdatedSuccessfullyMessage;
	@FindBy(xpath = "(//p[text()='Master Card'])[1]")
	public WebElement EditCardAccessButton;
	@FindBy(xpath = "//*[text()='remove']")
	public WebElement removeCardButton;
	@FindBy(xpath = "//p[contains(text(),'Add Address')]")
	public WebElement addAdressButtonAccountPage;
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement countryAddNewAddressWindow;
	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement FullNameAddAddressWindow;
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberAddAddressWindow;
	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement AddressFieldAddAddressWindow;
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement aptNumberAddAddressWindow;
	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement cityFieldAddAddressWindow;
	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateAddAddressWindow;
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeAddAddressWindow;
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addYourAddressButtonAddAddressWindow;
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement AddressAddedSuccessfullyMessage;
	@FindBy(xpath = "//*[text()='Edit']")
	public WebElement AddressEditButton;
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement updateYourAddressButton;
	@FindBy(xpath = "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressUpdatedSuccessfullyMessage;
	@FindBy(xpath = "//*[text()='Remove']")
	public WebElement removeAddressButton;
	@FindBy(xpath = "(//*[contains(@class, 'w-full undefined')])[1]")
	public WebElement cardAssertion;
	
	
	
	



}
