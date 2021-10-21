package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPageObject extends Base {

	DesktopsPageObject() {
		PageFactory.initElements(driver, this);
		
	}
		
		@FindBy(xpath = "//a[text()='Desktops']")
		private WebElement desktopButton;
		@FindBy(xpath = "//a[text()='Show All Desktops']")
		private WebElement allDesktop;
		
		@FindBy(xpath = "//i[@class='fa fa-home']")
		private WebElement homeNavigation;
		
		@FindBy(xpath = "(//a[text()='PC (0)'])[2]")
		private WebElement pcRefineSearch;
		@FindBy(xpath = "(//a[text()='Mac (1)'])[2]")
		private WebElement macRefineSearch;
		
		@FindBy(id = "grid-view")
		private WebElement gridView;
		@FindBy(id = "list-view")
		private WebElement listView;
		
		@FindBy(id = "compare-total")
		private WebElement compareTotal;
		
		@FindBy(id = "input-sort")
		private WebElement sortBy;
		@FindBy(id = "input-limit")
		private WebElement show;
		
		@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
		private WebElement appleCinemaImage;
		@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
		private WebElement appleCinemaText;
		@FindBy(xpath = "(//button[@type='button'])[9]")
		private WebElement appleCinemaAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[10]")
		private WebElement appleCinemaAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[11]")
		private WebElement appleCinemaCampareThisProduct;
		
		@FindBy(xpath = "//img[@title='Canon EOS 5D']")
		private WebElement canon_Eos_5D_Image;
		@FindBy(xpath = "//a[text()='Canon EOS 5D']")
		private WebElement canon_Eos_5D_Text;
		
				
				
	

}
