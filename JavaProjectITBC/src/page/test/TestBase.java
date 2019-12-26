package page.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(page.test.StringComparatorListener.class)
public class TestBase {
	//public static WebDriver driver = null;
	//public static WebDriver driver = new ChromeDriver();
	// @Test
	
	@Test
	public static void iniklasa(){

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-test\\JavaProjectITBC\\src\\chromedriver.exe");
		// webdriver for Chrome
		WebDriver driver = new ChromeDriver();
		// String ka pocetnoj strani
		// To maximize browser
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String BaseUrl = "https://petstore.octoperf.com/";

		driver.get(BaseUrl);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getCurrentUrl(), BaseUrl);
		sa.assertAll();
	}
	
	 //Test cleanup
//	 public void TeardownTest()
//	    {
//	        TestBase.driver.quit();
//	    }
	 
	}

