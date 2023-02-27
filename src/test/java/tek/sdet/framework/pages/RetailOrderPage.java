package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage(){
		PageFactory.initElements(getDriver(), this);
		}
	
	@FindBy(xpath = "//a[@id='orderLink']")
	public WebElement orderBtn;
	@FindBy(xpath = "(//*[text()='Show Details'])[1]")
	public WebElement orderShowDetails;
	@FindBy(xpath = "//button[@id='cancelBtn']")
	public WebElement cancelButton;
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement cancellationReason;
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement cancelOderButton;
	@FindBy(xpath = "//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement YourOrderHasBeenCancelledMessage;
	@FindBy(xpath = "//button[@id='returnBtn']")
	public WebElement returnButton;
	@FindBy(xpath = "//*[text()='Show Details']")
	public WebElement showDetailsList;
	@FindBy(xpath = "//select[@id='dropOffInput']")
	public WebElement dropOffLocation;
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement returnOrderButtonSubmition;
	@FindBy(xpath = "//p[contains(text(),'Return was successfull')]")
	public WebElement returnWasSuccessfullMessage;
	@FindBy(xpath = "//*[text()='Review']")
	public WebElement reviewButton;
	@FindBy(xpath = "//input[@id='headlineInput']")
	public WebElement headlineReviewField;
	@FindBy(xpath = "//textarea[@id='descriptionInput']")
	public WebElement reviewDescription;
	@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement addYourReviewButton;
	@FindBy(xpath = "//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewAddedSuccessfullymessage;
	
	

}
