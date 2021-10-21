package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TestRegisterObject extends Base {

	public TestRegisterObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "(//a[text()='Register'])[1]")
	private WebElement register;

	@FindBy(id = "input-firstname")
	private WebElement firstName;

	@FindBy(id = "input-lastname")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailAddress;

	@FindBy(id = "input-telephone")
	private WebElement telephone;

	@FindBy(id = "input-password")
	private WebElement password;

	@FindBy(id = "input-confirm")
	private WebElement confirmPassword;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement subscribe;

	@FindBy(name = "agree")
	private WebElement privacyPolicy;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueButton;

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement YourAccountHasBeenCreated;

	public void myAccount() {
		myAccount.click();
	}

	public void register() {
		register.click();
	}

	public void firstName(String nameValue) {
		firstName.clear();
		firstName.sendKeys(nameValue);
	}

	public void lastName(String lastNameValue) {
		lastName.clear();
		lastName.sendKeys(lastNameValue);
	}

	public void emailAddress(String emailValue) {
		emailAddress.clear();
		emailAddress.sendKeys(emailValue);
	}

	public void telephone(String telephoneValue) {
		telephone.clear();
		telephone.sendKeys(telephoneValue);
	}

	public void password(String passwordkey) {
		password.clear();
		password.sendKeys(passwordkey);
	}

	public void confirmPassword(String confirmPasswordKey) {
		confirmPassword.clear();
		confirmPassword.sendKeys(confirmPasswordKey);

	}

	public void subscribe() {
		subscribe.isSelected();
		subscribe.click();
	}

	public void privacyPolicy() {
		privacyPolicy.isSelected();
		privacyPolicy.click();
	}

	public void continueButton() {
		continueButton.click();
	}

	public boolean Validate() {
		if (YourAccountHasBeenCreated.isDisplayed())
			return true;
		else
			return false;
	}
}
