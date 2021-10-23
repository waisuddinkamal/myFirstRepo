package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.UtilityClass;

public class DropDownPageObjects extends Base {

	public DropDownPageObjects() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement howAllDesktops;

	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement sortBy;

	@FindBy(xpath = "//a[contains(text(),'Apple Cinema 30\"')]")
	private WebElement validationText;

	public void desktopsMenue() {
		desktops.click();
	}

	public void showAllDesktopsList() {
		howAllDesktops.click();
	}

	public void sortByList() {
		UtilityClass.selectByVisibleText(sortBy, "Name (A - Z)");
		sortBy.click();
	}

	public boolean validation() {
		if (validationText.isDisplayed())
			return true;
		else
			return false;
	}

}
