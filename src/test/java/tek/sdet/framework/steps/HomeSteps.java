package tek.sdet.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{
	private POMFactory factory = new POMFactory();
	
	
	@When("User click on All section")
	public void userClickOnAllSection() {

	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
	   
	}
	
}
