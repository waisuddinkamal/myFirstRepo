package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPageObject;
import utilities.UtilityClass;

public class LoginStepDef extends Base {
	// each step in scenario should have
	// one java method associated with that step.
	// we cant have duplicate methods for steps in
	// scenario steps.
	// in Order to get access to POM class methods we need to create
	// object of LoginPageObject class

	loginPageObject loginPageObj = new loginPageObject();

	@Given("^user is on Retail website$")
	public void user_is_on_Retail_website() {
		String actualPageTitile = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		// Assertion is to verify actual meets the expected
		// if actual does not equals to expected value then execution will stop
		// and test step will fail.
		Assert.assertEquals(expectedPageTitle, actualPageTitile);
		logger.info("Expected Title is much with Actual Title");

	}

	@When("^user click on Myaccount$")
	public void user_click_on_Myaccount() {
		loginPageObj.clickOnMyAccount();
		logger.info("User Able Click On MyAccount");
		
	}

	@And("^user click on Login option$")
	public void user_click_on_Login_option() {
		loginPageObj.clickOnLogin();
		logger.info("User Able Click on Login Option");
	}

	@And("^user enter userName '(.+)' and password '(.+)'$")
	public void user_enter_userName_and_password(String uName, String pass) {
		loginPageObj.enterEmailAndPassword(uName, pass);
		logger.info("User Enter " + uName + "And Password" + pass);
		UtilityClass.takeScreenShot();
	}

	@And("^user click on Login Button$")
	public void user_click_login_Button() {
		loginPageObj.clickOnLoginButton();
		logger.info("User be able click on Login button");
		
	}

	@Then("^user should be logged in to Myaccount dashboard$")
	public void user_should_be_logged_in_to_Myaccount_dashbaord() {
		// if MyAccountText is present it will pass
		// if myAccountText is not present or displayed it will fail
		Assert.assertTrue(loginPageObj.myAccountTextisPresent());
		logger.info("User sould login in to MyAccount dashboard");
		UtilityClass.takeScreenShot();

	}
}
