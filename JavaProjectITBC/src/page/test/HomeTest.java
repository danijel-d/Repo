package page.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;

public class HomeTest {

//	WebDriver driver;
//	HomePage objHomePage;
	// @Parameters("browser")
//	@BeforeTest
//	public static void setup(WebDriver driver){
//			
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://petstore.octoperf.com/");
//	}

	public static void wait2() {
		try {
			Thread.sleep(4999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public static void clickToHome(WebDriver driver) {
		// driver.get("https://petstore.octoperf.com/");

		// HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		HomePage homepage = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait myWait = new WebDriverWait(driver, 10);
		wait2();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), homepage.URL);
		homepage.clickOnHomeLink();
		sa.assertAll();
	}
}
