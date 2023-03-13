package tek.sdet.framework.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;
public class RetailHomePage extends BaseSetup {
    public RetailHomePage() {
        PageFactory.initElements(getDriver(), this);
    }
    // syntax for finding UI elements and storing them in POM classes    
    /** @FindBy(locatorType = "value")    
    * *public WebElement nameOfElement    
    *  */ 
    
          
    @FindBy(xpath="//a[text()='TEKSCHOOL']")
    public WebElement tekSchoolLogo;
    @FindBy(id ="search")
    public WebElement allDepartmentDropDown;
    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBar;
    @FindBy(xpath = "//button[@id='searchBtn']")
    public WebElement searchButton; 
    @FindBy(linkText = "Sign in")
    public WebElement signInButton;
    @FindBy(id="cartBtn")
    public WebElement cartButton;
    @FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
    public WebElement pokemanProductImage;
	@FindBy(xpath ="//button[@id='logoutBtn']")
	public WebElement LogOutButton;
	@FindBy(xpath = "//button[@id='hamburgerBtn']")
	public WebElement AllDepartmentsSideBar;
	@FindBy(xpath = "//span[contains(text(),'Electronics')]")
	public WebElement electronicsSideBar;
	@FindBy(xpath = "//span[contains(text(),'Computers')]")
	public WebElement computerDeptSideBar;
	@FindBy(xpath = "//span[contains(text(),'Smart Home')]")
	public WebElement smartHomeDeptSideBar;
	@FindBy(xpath = "//span[contains(text(),'Sports')]")
	public WebElement sportDeptSideBar;
	@FindBy(xpath = "//span[contains(text(),'Automative')]")
	public WebElement automativeDeptSideBar;
	@FindBy(xpath = "//div[@class='sidebar_content-item']/Span")
	public List <WebElement> SideBarElements;
	@FindBy(xpath = "//select[@id='search']")
	public WebElement dropDownDepartmentSearchBar;
	@FindBy(xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement KasaOutdoorSmartPlug;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	public WebElement addQty;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	public WebElement addToCartBtnForShopping;
	@FindBy(xpath = "//span[contains(text(),'2')]")
	public WebElement cartQuantityConfirmationQty2;
	@FindBy(xpath = "//p[contains(text(),'Cart')]")
	public WebElement addToCartbtn;
	@FindBy(xpath = "//button[@id='proceedBtn']")
	public WebElement proceedToCheckout;
	@FindBy(xpath = "//button[@id='addAddressBtn']")
	public WebElement addNewAddress;
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement country;
	@FindBy(xpath = "//input[@id='fullNameInput']")
	public WebElement fullNameAddNewAddressField;
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement phoneNumberAddNewAddressField;
	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement addressNewAddressField;
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement aptNumberNewAddress;
	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement ciyField;
	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateField;
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeField;
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addYourAddressBtn;
	@FindBy(xpath = "//button[@id='addPaymentBtn']")
	public WebElement AddCreditCardOrDebitCardBtn;
	@FindBy(css = "#cardNumberInput")
	public WebElement AddCartNumberField;
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement nameOnCardInput;
	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement expirationMonth;
	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement expirationYear;
	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement securityCode;
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement AddYourCardBtn;
	@FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement placeYourOrderBtn;
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement AddressAddedSuccessfullyMessage;
	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement PaymentMethodAddedSuccessfullyMessage;
	@FindBy(xpath = "//div[contains(text(),'Order Placed Successfully')]")
	public WebElement orderPlacedSuccessfully;
	@FindBy(xpath = "//p[contains(text(),'Apex Legends - 1,000 Apex Coins')]")
	public WebElement ApexLegends1000ApexCoins;
	@FindBy(tagName = "img")
	public List<WebElement> electronicsProducts;
	@FindBy(xpath = "//p[@class='products__name']")
	public WebElement products;



}
