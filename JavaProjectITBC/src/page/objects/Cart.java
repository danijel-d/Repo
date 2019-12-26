package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Cart {
	
	
	public static final String CART_URL = "https://petstore.octoperf.com/actions/Cart.action?viewCart=";

	@FindBy(xpath = "//img[@name='img_cart']")
	WebElement enterCart;
	WebDriver driver;
	
	public Cart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.get(CART_URL);
	}
	
		
		//Cart Button
		public WebElement CartBtn() {
			return enterCart;
		}

		//click Cart Button
		public void clickCartBtn() {
			CartBtn().click();
		}
	}


