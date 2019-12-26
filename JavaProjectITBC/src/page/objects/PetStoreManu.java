package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetStoreManu {
	WebDriver driver;
	public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action";
	public static final String FMENU_URL = "//div[@id='Content']//a[1]//img[1]";
	public static final String DMENU_URL = "//div[@id='Content']//a[2]//img[1]";
	public static final String CMENU_URL = "//div[@id='Content']//a[3]//img[1]";
	public static final String RMENU_URL = "//div[@id='Content']//a[4]//img[1]";
	public static final String BMENU_URL = "//div[@id='Content']//a[5]//img[1]";

	@FindBy(xpath = "//div[@id='Content']//a[1]//img[1]")
	WebElement enteFMenu;
	@FindBy(xpath = "//div[@id='Content']//a[2]//img[1]")
	WebElement enteDMenu;
	@FindBy(xpath = "//div[@id='Content']//a[3]//img[1]")
	WebElement enteCMenu;
	@FindBy(xpath = "//div[@id='Content']//a[4]//img[1]")
	WebElement enteRMenu;
	@FindBy(xpath = "//div[@id='Content']//a[5]//img[1]")
	WebElement enteBMenu;

	@FindBy(xpath = "//div[@id='QuickLinks']//a[1]//img[1]")
	WebElement enteFQMenu;
	@FindBy(xpath = "//div[@id='Header']//a[2]//img[1]")
	WebElement enteDQMenu;
	@FindBy(xpath = "//div[@id='Header']//a[3]//img[1]")
	WebElement enteRQMenu;
	@FindBy(xpath = "//div[@id='Header']//a[4]//img[1]")
	WebElement enteCQMenu;
	@FindBy(xpath = "//div[@id='Header']//a[5]//img[1]")
	WebElement enteBQMenu;
	
	@FindBy(xpath = "//body//area[2]")
	static
	WebElement enteFIMenu;
	@FindBy(xpath = "//body//area[3]")
	static
	WebElement enteDIMenu;
	@FindBy(xpath = "//body//area[4]")
	static
	WebElement enteRIMenu;
	@FindBy(xpath = "//body//area[5]")
	static
	WebElement enteCIMenu;
	@FindBy(xpath = "//body//area[6]")
	static
	WebElement enteBIMenu;
	
	
	public PetStoreManu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.get(URL);
	}
	
	
	
		//Manu on the left side
	public void clickToEnterFmenu() {
		enteFMenu.click();
	}

	public void clickToEnterDmenu() {
		enteDMenu.click();
	}

	public void clickToEnterCmenu() {
		enteCMenu.click();
	}

	public void clickToEnterRmenu() {
		enteRMenu.click();
	}

	public void clickToEnterBmenu() {
		enteBMenu.click();
	}
	
	//Upper Manu Quick methods
	
	public void clickToEnterUFmenu() {
		enteFQMenu.click();
	}
	public void clickToEnterUDmenu() {
		enteDQMenu.click();
	}
	public void clickToEnterUCmenu() {
		enteCQMenu.click();
	}
	public void clickToEnterURmenu() {
		enteRQMenu.click();
	}
	public void clickToEnterUBmenu() {
		enteBQMenu.click();
	}
	
	
	
	
	
	//Manu with image methods
	
	public static void clickToEnterFImenu() {
		enteFIMenu.click();
	}
	public static void clickToEnterDImenu() {
		enteDIMenu.click();
	}
	public static void clickToEnterCImenu() {
		enteCIMenu.click();
	}
	public static void clickToEnterRImenu() {
		enteRIMenu.click();
	}
	public static void clickToEnterBImenu() {
		enteBIMenu.click();
	}
}
