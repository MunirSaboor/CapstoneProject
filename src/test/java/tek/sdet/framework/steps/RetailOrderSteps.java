package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.handler.codec.http.multipart.Attribute;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{

	POMFactory factory = new POMFactory();

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(factory.orderPage().orderBtn);
	    logger.info("User Clicked on order's button");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().orderShowDetails);
		logger.info("user clicked on first item in list");

	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelButton);
		logger.info("User clicked on cancel button");

	}
	@When("User select the cancelation Reason ‘Bought wrong item’")
	public void userSelectTheCancelationReasonBoughtWrongItem() {
		selectByIndex(factory.orderPage().cancellationReason, 1);
		logger.info("User selected the cancelation Reason ‘Bought wrong item");
	

	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOderButton);
		logger.info("User clicked on Cancel Order button");

	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().YourOrderHasBeenCancelledMessage));
		logger.info("a cancelation message should be displayed ‘Your Order Has Been Cancelled’");

	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnButton);
		logger.info("User clicked on Return Items button");

	}
	@When("User select the Return Reason ‘Item damaged’")
	public void userSelectTheReturnReasonItemDamaged() {
		selectByIndex(factory.orderPage().cancellationReason, 2);
		logger.info("User selected the Return Reason ‘Item damaged’");

	}
	@When("User select the drop off service ‘FedEx’")
	public void userSelectTheDropOffServiceFedEx() {
		selectByIndex(factory.orderPage().dropOffLocation, 2);
		logger.info("User selected the drop off service ‘FedEx’");
		
	   
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderButtonSubmition);
		logger.info("User clicked on Return Order button");

	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnWasSuccessfullMessage));
		logger.info("a cancelation message should be displayed ‘Return was successful’");
	   }
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("User clicked on Review button");
	  
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText(String headline, String description) {
		sendText(factory.orderPage().headlineReviewField, headline);
		sendText(factory.orderPage().reviewDescription, description);
		logger.info("User write a review headline and description");
	   
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addYourReviewButton);
		logger.info("User click Add your Review button");
	   
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		waitTillPresence(factory.orderPage().reviewAddedSuccessfullymessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewAddedSuccessfullymessage));
		logger.info("a review message has been displayed ‘Your review was added successfully’");
	 
	}
}
