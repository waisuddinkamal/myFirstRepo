package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.owasp.html.examples.EbayPolicyExample;

import core.Base;

public class DesktopsPageObject extends Base {

	DesktopsPageObject() {
		PageFactory.initElements(driver, this);
		
	}
		
		@FindBy(xpath = "//a[text()='Desktops']")
		private WebElement desktops;
		@FindBy(xpath = "//a[text()='Show All Desktops']")
		private WebElement allDesktop;
		
		@FindBy(xpath = "//i[@class='fa fa-home']")
		private WebElement homeNavigation;
		@FindBy(xpath = "//img[@title='Desktops']")
		private WebElement desktopsImage;
		@FindBy(xpath = "//p[contains(text(),'Example of category description text')]")
		private WebElement categoryDescriptionText;
		
		
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
		private WebElement appleCinemaLink;
		@FindBy(xpath = "(//button[@type='button'])[9]")
		private WebElement appleCinemaAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[10]")
		private WebElement appleCinemaAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[11]")
		private WebElement appleCinemaCampareThisProduct;
		
		@FindBy(xpath = "//img[@title='Canon EOS 5D']")
		private WebElement canon_Eos_5D_Image;
		@FindBy(xpath = "//a[text()='Canon EOS 5D']")
		private WebElement canon_Eos_5D_Link;
		@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
		private WebElement canonAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[13]")
		private WebElement canonAddToWishList;
		@FindBy(xpath = "//button[@type='button'and @xpath='1' ]")
		private WebElement canonCampareThisProduct;
		
		@FindBy(xpath = "//img[@title='HP LP3065']")
		private WebElement HP_LP3065_Image;
		@FindBy(xpath = "//a[text()='HP LP3065'and @xpath='1']")
		private WebElement HP_LP3065_Link;
		@FindBy(xpath = "(//button[@type='button'])[16]")
		private WebElement HP_LP3065_AddToCart;
		@FindBy(xpath = "(//button[@type='button'])[17]")
		private WebElement HP_LP3065_AddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[18]")
		private WebElement HP_LP3065_CompareThisproduct;
		
		@FindBy(xpath = "//img[@class='img-responsive'and @title='HTC Touch HD']")
		private WebElement HTC_Touch_HD_Image;
		@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
		private WebElement HTC_Touch_HD_Link;
		@FindBy(xpath = "(//button[@type='button'])[19]")
		private WebElement HTC_Touch_HD_AddCart;
		@FindBy(xpath = "(//button[@type='button'])[20]")
		private WebElement HTC_Touch_HD_AddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[21]")
		private WebElement HTC_Touch_HD_CompareThisProduct;
		
		@FindBy(xpath = "//img[@class='img-responsive'and@title='iPhone']")
		private WebElement iphone;
		@FindBy(xpath = "//a[text()='iPhone']")
		private WebElement iphoneLink;
		@FindBy(xpath = "(//button[@type='button'])[21]")
		private WebElement iphoneAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[22]")
		private WebElement iphoneAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[23]")
		private WebElement iphoneCampareThisProduct;
		
		@FindBy(xpath = "//img[@title='iPod Classic']")
		private WebElement ipodClassicImage;
		@FindBy(xpath = "//a[text()='iPod Classic']")
		private WebElement ipodClassicLink;
		@FindBy(xpath = "(//button[@type='button'])[24]")
		private WebElement ipodClassicAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[25]")
		private WebElement ipodClassicAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[26]")
		private WebElement ipodClassicCampareThisProdacut;
		
		@FindBy(xpath = "//img[@title='MacBook']")
		private WebElement macBookImage;
		@FindBy(xpath = "//a[text()='MacBook']")
		private WebElement macBookLink;
		@FindBy(xpath = "(//button[@type='button'])[27]")
		private WebElement macBookAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[28]")
		private WebElement macBookAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[29]")
		private WebElement macBookCampareThisProduct;
		
		@FindBy(xpath = "//img[@class='img-responsive'and @title='MacBook Air']")
		private WebElement macBookAirImage;
		@FindBy(xpath = "//a[text()='MacBook Air']")
		private WebElement macBookAirLink;
		@FindBy(xpath = "(//button[@type='button'])[30]")
		private WebElement macBookAirAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[31]")
		private WebElement macBookAirAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[32]")
		private WebElement macBookAirCampareThisProduct;
		
		@FindBy(xpath = "//img[@title='Palm Treo Pro']")
		private WebElement plamTreoProImage;
		@FindBy(xpath = "//a[text()='Palm Treo Pro']")
		private WebElement plamTreoProLink;
		@FindBy(xpath = "(//button[@type='button'])[33]")
		private WebElement plamTreoProAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[34]")
		private WebElement plamTreoProAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[34]")
		private WebElement plamTreoProCompareThisProduct;
		
		@FindBy(xpath = "//img[@title='Product 8']")
		private WebElement Product8Image;
		@FindBy(xpath = "//a[text()='Product 8']")
		private WebElement Product8Link;
		@FindBy(xpath = "(//button[@type='button'])[36]")
		private WebElement Product8AddToCart;
		@FindBy(xpath = "(//button[@type='button'])[37]")
		private WebElement Product8AddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[38]")
		private WebElement Product8CompareThisProduct;
		
		@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
		private WebElement SamsungSyncMasterImage;
		@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
		private WebElement SamsungSyncMasterLink;
		@FindBy(xpath = "(//button[@type='button'])[39]")
		private WebElement SamsungSyncMasterAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[40]")
		private WebElement SamsungSyncMasterAddToWishList;
		@FindBy(xpath = "(//button[@type='button'])[41]")
		private WebElement SamsungSyncMasterCompareThisProduct;
		
		@FindBy(xpath = "//img[@title='Sony VAIO']")
		private WebElement SonyVaioImage;
		@FindBy(xpath = "//a[text()='Sony VAIO']")
		private WebElement SonyVaioLink;
		@FindBy(xpath = "(//button[@type='button'])[42]")
		private WebElement SonyVaioAddToCart;
		@FindBy(xpath = "(//button[@type='button'])[43]")
		private WebElement SonyVaioToWishList;
		@FindBy(xpath = "(//button[@type='button'])[44]")
		private WebElement SonyVaioCompareThisProduct;
		
		@FindBy(xpath = "//a[@class='list-group-item active']")
		private WebElement desktopNavigateLink;
		
		@FindBy(xpath = "(//a[@class='list-group-item'])[1]")
		private WebElement pcNavigateLink;
		
		@FindBy(xpath = "(//a[@class='list-group-item'])[2]")
		private WebElement macNavigateLink;
		
		@FindBy(xpath = "(//a[@class='list-group-item'])[3]")
		private WebElement laptopsAndNotebooksVavigateLink;
		
		@FindBy(xpath = "(//a[@class='list-group-item'])[4]")
		private WebElement ComponentsNavigatelink;
		
		@FindBy(xpath = "(//a[@class='list-group-item'])[5]")
		private WebElement TabletsNavigateLink;
		
		@FindBy(xpath = "(//a[@class='list-group-item'])[6]")
		private WebElement SoftwarNavigateLink;
		
		@FindBy(xpath = "(//a[@class='list-group-item'])[7]")
		private WebElement PhonesAndPDAsNavigateLink;
		
		@FindBy(xpath = "(//a[@class='list-group-item'])[8]")
		private WebElement CamerasNavigateLink;
		
		@FindBy(xpath = "(//a[@class='list-group-item'])[9]")
		private WebElement MP3PlayersNavigateLink;
		
		
		
		
				
				
	

}
