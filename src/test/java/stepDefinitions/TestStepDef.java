package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.TestPageObject;

public class TestStepDef extends Base {
	TestPageObject obj = new TestPageObject();

	@When("user search for {string}")
	public void user_search_for(String string) {
		obj.enterValue(string);
		obj.clickSearchButton();
	}

	@Then("iphone sould be displayed")
	public void iphone_sould_be_displayed() {
	Assert.assertTrue(obj.isIphoneDisplyed());
	}
}
