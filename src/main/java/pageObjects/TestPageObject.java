package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class TestPageObject extends Base {
	public TestPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;

	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iponeImage;

	public void enterValue(String value) {
		searchBar.sendKeys(value);
	}

	public void clickSearchButton(){
		searchButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isIphoneDisplyed() {

		if (iponeImage.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
}
