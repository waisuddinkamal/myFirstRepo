package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.TestRegisterObject;

public class RegisterStepDef extends Base {

	TestRegisterObject TestRegister = new TestRegisterObject();

//	@When("user click on Register")
//	public void user_click_on_register() {
//		TestRegister.register();
//	}

	@When("user enter the First Name {string}")
	public void user_enter_the_first_name(String nameValue) {
		TestRegister.firstName(nameValue);
		
	}

	@When("user enter the Last Name {string}")
	    public void user_enter_the_last_name(String lastNameValue) {
		TestRegister.lastName(lastNameValue);
	}
	
	@When("user enter the email {string}")
	public void user_enter_the_email(String eamilValue) {
		TestRegister.emailAddress(eamilValue);
	}

	@When("user enter the telephone {string}")
	public void user_enter_the_telephone(String telephoneValue) {
		
		TestRegister.telephone(telephoneValue);
	}

	@When("user enter the Password {string}")
	public void user_enter_the_password(String passwordkey) {
		TestRegister.password(passwordkey);
	}

	@When("user enter Password Confirm {string}")
	public void user_enter_password_confirm(String confirmPasswordKey) {
		TestRegister.confirmPassword(confirmPasswordKey);
	}

	@When("Subscribe should check no by default")
	public void subscribe_should_check_no_by_default() {
		TestRegister.subscribe();
	}

	@When("user check the Privacy Policy")
	public void user_check_the_privacy_policy() {
		TestRegister.privacyPolicy();
	}

	@Then("user click on Continue button")
	public void user_click_on_continue_button() throws InterruptedException {
		TestRegister.continueButton();
		Thread.sleep(5000);
	}
	@Then("user should be logged in to Account Has Been Created dashboard")
	public void user_should_be_logged_in_to_Account_Has_Been_Created_dashboard() {
		Assert.assertTrue(TestRegister.Validate());
	}
}
