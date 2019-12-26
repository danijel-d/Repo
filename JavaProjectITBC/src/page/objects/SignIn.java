package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	public static final String SignInURL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	
	WebDriver driver;
	@FindBy(xpath = "//input[@name='signon']")
	WebElement SignInBtn;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]")
	WebElement SignInInputUser;
	@FindBy(xpath = "//input[@name='password']")
	WebElement PasswordInput;
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	WebElement SignOut;
	
	
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.get(SignInURL);
	}
	
	public static void wait2() {
		try {
			Thread.sleep(2999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void navigateLoginPage(WebDriver driver) {
		wait2();
		driver.navigate().to(SignInURL);
	}
	
	
	public   WebElement SingInInputUser() {
		return SignInInputUser;
	}
	
	public WebElement PasswordInput() {
		return PasswordInput;
	}
	public   void  clickSingInInputUser() {
		SignInInputUser.click();
	}
	
	public void InputUser(String str) {
		SingInInputUser().sendKeys(str);
	}
	public void InputPassword(String str) {
		PasswordInput().sendKeys(str);
	}

	public WebElement takeSigninBtn() {
		return SignInBtn;
	}
	
	public void clickSignInBtn() {
		takeSigninBtn().click();
	}
	
	
	public WebElement takeSignOutBtn() {
		return SignOut;
	}
	
	public void clickSignOutBtn() {
		takeSignOutBtn().click();
	}
	
	
	
	
}
