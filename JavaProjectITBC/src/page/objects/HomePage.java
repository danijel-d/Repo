package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public static final String URL = "https://petstore.octoperf.com/" ;
	@FindBy(xpath="//a[contains(text(),'Enter the Store')]") WebElement enterSite;
	
	 
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.get(URL);
	}

	
	
	 public  void clickOnHomeLink(){
		 enterSite.click();
		 }
	

}
