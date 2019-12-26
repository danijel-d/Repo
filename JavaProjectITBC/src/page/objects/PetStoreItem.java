package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetStoreItem {

	WebDriver driver;

	@FindBy(xpath="//a[contains(text(),'FI-FW-02')]") WebElement GoldFish;
	@FindBy(xpath="//a[contains(text(),'EST-20')]") WebElement AdultMaleGoldFish;
	@FindBy(xpath="//a[@class='Button']") WebElement AddToCartBtn;
	public static final String GOLD_FISH_URL ="https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=FI-FW-02";
	 
	public PetStoreItem(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.get(GOLD_FISH_URL);
	}
	
	
	
	
	
	

	public WebElement GoldFish() {
		return GoldFish;
	}


	public void clickGoldFish() {
		GoldFish().click();
	}
	
	
	
	//AdultMaleGoldFish button
	public WebElement AdultMaleGoldFish() {
		return AdultMaleGoldFish;
	}

	//click AdultMaleGoldFish button
	public void clickAdultMaleGoldFish() {
		AdultMaleGoldFish().click();
	}
	

	//AddToCart Button
	public WebElement AddToCartBtn() {
		return AddToCartBtn;
	}
	
	//click AddToCart Button
	public void clickAddToCartBtn() {
		AddToCartBtn().click();
	}
	
	
}
