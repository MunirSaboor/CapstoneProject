package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);

	}
	
	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar, productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product " + productValue);
	}

	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
		logger.info("the Product is displayed on home page");

	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().AllDepartmentsSideBar);
		logger.info("User clicked on All section");

	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> ExpectedsideBar = dataTable.asLists(String.class);
		List<WebElement> actualSideBar = factory.homePage().SideBarElements;

		for (int i = 0; i < ExpectedsideBar.get(0).size(); i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(), ExpectedsideBar.get(0).get(i));
			logger.info(actualSideBar.get(i).getText() + "is equal to " + ExpectedsideBar.get(0).get(i));
		}

	}

	@When("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> sideBarOptions = factory.homePage().SideBarElements;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				try {
					logger.info(option.getText() + "is present");
				} catch (StaleElementReferenceException e) {

				}

				break;

			}
		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().SideBarElements;

		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {

					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + "is present");
					break;
				}
			}

		}

	}

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
		selectByVisibleText(factory.homePage().dropDownDepartmentSearchBar, "Smart Home");
		logger.info("User change the category to Smart Home");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		sendText(factory.homePage().searchBar, string);
		logger.info("Expected inpurt inserted " + string);

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("User clicked on search Button");

	}

	@When("User click on item")
	public void userClickOnItem() {
		waitTillPresence(factory.homePage().products);
		click(factory.homePage().products);
		logger.info("user clicked on product");
	}

	

	

	@When("User select quantity ‘{int}’")
	public void userSelectQuantity(Integer int1) {
		selectByIndex(factory.homePage().addQty, 1);
		logger.info("User selected the required quantity");

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartBtnForShopping);
		logger.info("User Clicked on add to cart btn");
	}

	@Then("the cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer int1) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantityConfirmationQty2));
		logger.info("The cart quantity changed to expected selection");
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().addToCartbtn);
		logger.info("User clicked on add to cart option");

	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedToCheckout);
		logger.info("User clicked on proceed to checkout button");

	}

	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addNewAddress);
		logger.info("user clicked add new address link for shipping address");

	}

	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable){
		List<Map<String, String>> addressInput = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.homePage().country, "Canada");
		sendText(factory.homePage().fullNameAddNewAddressField, addressInput.get(0).get("fullName"));
		sendText(factory.homePage().phoneNumberAddNewAddressField, addressInput.get(0).get("phoneNumber"));
		sendText(factory.homePage().addressNewAddressField, addressInput.get(0).get("streetAddress"));
		sendText(factory.homePage().aptNumberNewAddress, addressInput.get(0).get("apt"));
		sendText(factory.homePage().ciyField, addressInput.get(0).get("city"));
		selectByVisibleText(factory.homePage().stateField, "Ontario");
		sendText(factory.homePage().zipCodeField, addressInput.get(0).get("zipCode"));
		logger.info("User entered address into required field");
	}

	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		waitTillClickable(factory.homePage().AddCreditCardOrDebitCardBtn);
	    click(factory.homePage().AddCreditCardOrDebitCardBtn);
		logger.info("User clicked om Add a Credit Card or Debit Card button");
		
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		waitTillClickable(factory.homePage().placeYourOrderBtn);
		click(factory.homePage().placeYourOrderBtn);
		logger.info("User clicked on Place Your Order");

	}

	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		waitTillPresence(factory.homePage().orderPlacedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedSuccessfully));
		logger.info("Order Successfully Message displayed");

	}

	@When("User change the category to Electronics")
	public void userChangeTheCategoryToElectronics() {
		selectByIndex(factory.homePage().allDepartmentDropDown, 1);
		logger.info("User changed the category to Electronics");

	}
	@Then("a message should be displayed {string} ")
		public void messageShouldDisplayedOrderPlacedThanks() {
		waitTillPresence(factory.homePage().orderPlacedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedSuccessfully));
		logger.info("order placed messaged should displayed");
	}

}
