package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsAndNotebooksPageObject extends Base{
	
	public LaptopsAndNotebooksPageObject() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homeNavigateIcon;

}
