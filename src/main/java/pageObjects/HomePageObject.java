package pageObjects;

import javax.xml.xpath.XPath;

import org.hamcrest.Factory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euroCurrency;
	@FindBy(xpath = "//button[text()='£ Pound Sterling']")
	private WebElement poundCurrency;
	@FindBy(xpath = "//button[text()='$ US Dollar']")
	private WebElement usDollarCurrency;
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[2]")
	private WebElement phone;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "//span[contains(text(),'Wish List (1)')]")
	private WebElement wishList;
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shopingCart;
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	private WebElement checkout;
	
	@FindBy(xpath = "(//img[@alt='iPhone 6'])[2]")
	private WebElement iphone6MovableImage;
	@FindBy(xpath = "(//img[@alt='MacBookAir'])[2]")
	private WebElement mackBookAirMovableImage;
	@FindBy(xpath = "(//div[@class='swiper-button-prev'])[1]")
	private WebElement headerswiperButtonPrev;
	@FindBy(xpath = "(//div[@class='swiper-button-next'])[1]")
	private WebElement headerSwiperButtonNext;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchField;
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchbutton;
	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement cartPreviewOption;
	
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookText;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement macBookAddToCart;
	@FindBy(xpath = "(//button[@type='button'])[8]")
	private WebElement macBookAddToWishList;
	@FindBy(xpath = "(//button[@type='button'])[9]")
	private WebElement macBookCompareThisProduct;
	
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iphoneText;
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement iphoneAddToCart;
	@FindBy (xpath = "(//button[@type='button'])[11]")
	private WebElement iphoneAddToWishList;
	@FindBy(xpath = "(//button[@type='button'])[12]")
	private WebElement iphoneCompareThisProduct;
	
	@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement appleCinemaImage;
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCienmaText;
	@FindBy(xpath = "(//button[@type='button'])[13]")
	private WebElement appleCienmaAddToCart;
	@FindBy(xpath = "(//button[@type='button'])[14]")
	private WebElement appleCienmaAddToWishList;
	@FindBy(xpath = "(//button[@type='button'])[14]")
	private WebElement appleCinemaCompareThisProduct;
	
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement Canon_EOS_5D;
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement Canon_EOS_5D_Text;
	@FindBy(xpath = "(//button[@type='button'])[16]")
	private WebElement Canon_EOS_5D_AddToCart;
	@FindBy(xpath = "(//button[@type='button'])[17]")
	private WebElement Canon_EOS_5D_AddToWishList;
	@FindBy(xpath = "(//button[@type='button'])[18]")
	private WebElement Canon_EOS_5D_CompareThisProduct;
	
	@FindBy(xpath = "(//div[@class='swiper-button-prev'])[2]")
	private WebElement swiperButtonPrev;
	@FindBy(xpath = "(//div[@class='swiper-button-next'])[2]")
	private WebElement swiperButtonNext;
	
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	private WebElement aboutUs;
	@FindBy(xpath = "//a[contains(text(),'Delivery Information')]")
	private WebElement deliveryInformation;
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	private WebElement privacyPolicy;
	@FindBy(xpath = "//a[contains(text(),'Terms & Conditions')]")
	private WebElement termsAndConditions;
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	private WebElement contactUs;
	@FindBy(xpath = "//a[contains(text(),'Returns')]")
	private WebElement returns;
	@FindBy(xpath = "//a[contains(text(),'Site Map')]")
	private WebElement siteMap;
	@FindBy(xpath = "//a[contains(text(),'Brands')]")
	private WebElement brands;
	@FindBy(xpath = "//a[contains(text(),'Gift Certificates')]")
	private WebElement giftCertificates;
	@FindBy(xpath = "//a[contains(text(),'Affiliate')]")
	private WebElement affiliate;
	@FindBy(xpath = "//a[contains(text(),'Specials')]")
	private WebElement specials;
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	private WebElement feadermyAccount;
	@FindBy(xpath = "//a[contains(text(),'Order History')]")
	private WebElement orderHistory;
	@FindBy(xpath = "//a[contains(text(),'Wish List')]")
	private WebElement feaderWishList;
	@FindBy(xpath = "//a[contains(text(),'Newsletter')]")
	private WebElement newsLetter;
	@FindBy(xpath = "//a[contains(text(),'OpenCart')]")
	private WebElement openCart;
	
	
						
	


}
