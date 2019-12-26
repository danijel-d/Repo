package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static final String RegistrationURL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	public static final String EditInURL = "https://petstore.octoperf.com/actions/Account.action?editAccountForm=";
	
	WebDriver driver;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement UserID;
	@FindBy(xpath = "//input[@name='password']")
	WebElement PasswordInputUser;
	@FindBy(xpath = "//input[@name='repeatedPassword']")
	WebElement RepeatedPasswordInput;

	@FindBy(xpath = "//input[@name='account.firstName']")
	WebElement FirstName;
	@FindBy(xpath = "//input[@name='account.lastName']")
	WebElement LastName;
	@FindBy(xpath = "//input[@name='account.email']")
	WebElement Email;
	@FindBy(xpath = "//input[@name='account.phone']")
	WebElement Phone;
	@FindBy(xpath = "//input[@name='account.address1']")
	WebElement Address1;
	@FindBy(xpath = "//input[@name='account.address2']")
	WebElement Address2;
	@FindBy(xpath = "//input[@name='account.city']")
	WebElement AccountCity;
	@FindBy(xpath = "//input[@name='account.state']")
	WebElement AccountState;
	@FindBy(xpath = "//input[@name='account.zip']")
	WebElement AccountZip;
	@FindBy(xpath = "//input[@name='account.country']")
	WebElement AccountCountry;

	@FindBy(xpath = "//select[@name='account.languagePreference']")
	WebElement Select ;
	
	@FindBy(xpath = "//select[@name='account.favouriteCategoryId']")
	WebElement Selectt;

	@FindBy(xpath = "//input[@name='account.listOption']")
	WebElement ListOption;
	@FindBy(xpath = "//input[@name='account.bannerOption']")
	WebElement BannerOption;
	@FindBy(xpath = "//input[@name='newAccount']")
	WebElement SaveAccountBtn;

	@FindBy(xpath = "//input[@name='editAccount']")
	WebElement EditSaveAccountBtn;
	

	
	
	// sel.selectByVisibleText("SERBIA");

	public Registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.get(RegistrationURL);
	}

	public static void wait2() {
		try {
			Thread.sleep(2999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void navigateRegistrationPage(WebDriver driver) {
		wait2();
		driver.navigate().to(RegistrationURL);
	}

	public static void navigateEditPage(WebDriver driver) {
		wait2();
		driver.navigate().to(EditInURL);
	}
	
	public WebElement userId() {
		return UserID;
	}

	public void enterUserId(String str) {
		userId().sendKeys(str);
		
	}

	// Password input
	public WebElement passwordInputUser() {
		return PasswordInputUser;
	}

	public void passwordInputUserW(String str) {
		passwordInputUser().sendKeys(str);
	}

	// RepeatPassword input
	public WebElement repeatedPasswordInput() {
		return RepeatedPasswordInput;
	}

	public void repeatedPasswordInputW(String str) {
		repeatedPasswordInput().sendKeys(str);
	}

	// FirstName

	public WebElement firstName() {
		return FirstName;
	}

	public void firstNameInput(String str) {
		firstName().sendKeys(str);
	}

	// Last Name
	public WebElement LastName() {
		return LastName;
	}

	public void lastNameInput(String str) {
		LastName().sendKeys(str);
	}

	// email
	public WebElement email() {
		return Email;
	}

	public void emailInput(String str) {
		email().sendKeys(str);
	}

	// phone
	public WebElement phone() {
		return Phone;
	}

	public void phoneInput(String str) {
		phone().sendKeys(str);
	}

	// address1
	public WebElement address1() {
		return Address1;
	}

	// address1 input
	public void address1Input(String str) {
		address1().sendKeys(str);
	}

	// address2
	public WebElement address2() {
		return Address2;
	}

	// address2 input
	public void address2Input(String str) {
		address2().sendKeys(str);
	}

	// AccountCity;
	public WebElement accountCity() {
		return AccountCity;
	}

	// account city input
	public void accountCityInput(String str) {
		accountCity().sendKeys(str);
	}

	// AccountState
	public WebElement accountState() {
		return AccountState;
	}

	// account state input
	public void accountStateInput(String str) {
		accountState().sendKeys(str);
	}

	// AccountCountry 
	public WebElement accountCountry() {
		return AccountCountry;
		
	}

	// account country input
	public void accountCountryInput(String str) {
		accountCountry().sendKeys(str);
		
	}
	
	
	// AccountZip
		public WebElement accountZip() {
			return AccountZip;
		}

		// account zip input
		public void accountZipInput(String str) {
			accountZip().sendKeys(str);
		}

	// Select option 1
	public Select selectOption1() {
		Select dropdown = new Select(Select);
		return dropdown;
	}

	public void clickselectOption1(String str) {
		selectOption1().selectByVisibleText(str);
	}

	// Select option 2
	public Select selectOption2() {
		Select dropdown2 = new Select(Selectt);
		return dropdown2;
	}

	public void clickselectOption2(String str) {
		System.out.println(str);
		selectOption2().selectByVisibleText(str);
	}

	// element Listoption
	public WebElement ListOption() {
		return ListOption;
	}

	// click List option
	public void clickListOption() {
		ListOption().click();
	}

	// element Banneroption
	public WebElement bannerOption() {
		return BannerOption;
	}

	// click Bannner option
	public void clickBennerOption() {
		bannerOption().click();
	}

	public   void  clickRegistration() {
		SaveAccountBtn.click();
	}
	
	public   void  clickSaveEdit() {
		EditSaveAccountBtn.click(); 
	}
	
	
	
}
