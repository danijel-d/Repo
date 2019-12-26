package page.main;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.internal.Classes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.annotations.Listeners;

import page.objects.PetStoreManu;
import page.objects.Registration;
import page.objects.SignIn;
import page.test.CartTest;
import page.test.EditPageTest;
import page.test.HomeTest;
import page.test.PetStoreTest;
import page.test.RegistrationTest;
import page.test.SignInTest;
import page.test.StringComparatorListener;


public class JustStatrtingClass {
	

	public static void main(String[] args) {
		System.out.println("Welcome to my testing applicaiton");
		System.out.println("Testing will start in 3..2..1");
		System.setProperty("webdriver.chrome.driver",
				"src\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// Scanner for User input
		Scanner sc = new Scanner(System.in);
		//enlarge browser window

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Please uncomment lines for Testing methods you want to do");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		//*SIGNIN*/	
		
		SignInTest.clickManuFQ(driver,1);
		
		
		//Test to Insert item in cart 
		
		//CartTest.getItemInCart(driver, 1);
		
		
		
		//hOME PAGE TEST
		//		HomeTest.clickToHome(driver);
		
		
		
		//Random Manu test		
		//PetStoreTest.randomManuTest(driver);
		
		//   *REGISTRATION TEST*/		
		//RegistrationTest.testExcelRegistration(driver, 6);
		
		//    *REGISTRATION TEST FOR SEVERAL USERS*/	
		//RegistrationTest.testExcelRegistrationSeveralUsers(driver);
		
		//EDIT PAGE TEST		
		//EditPageTest.editUserInfo(driver, 3);
		
		//message for User
		//	System.out.println("Ako hoces da pocnes samo testiranje jednog testa\n menija ukucaj : ManuTest");


		// probe with testSuite pokusao sa testSuite
		/*TestNG testSuite = new TestNG();
		testSuite.setTestClasses(new Class[] { SignInTest.class});
		testSuite.addListener(new StringComparatorListener());
		testSuite.setDefaultSuiteName("My Test Suite");
		testSuite.setDefaultTestName("My Test");
		testSuite.setOutputDirectory("C:/Users/Lenovo/Downloads/testng-output");
		testSuite.run();*/
	
		
/*		String s = sc.nextLine();
		String ManuTest ="manutImage";
		if(s.equals(ManuTest)){
		
			System.exit(0);
		}
		else
		try {
			

//			PetStoreTest.clickManuF(driver);
Category		PetStoreTest.clickManuFI(driver);
//						PetStoreTest.clickManuFQ(driver);
			//PetStoreTest.clickManuFQ(driver);
	//*SIGNIN*/		//SignInTest.clickManuFQ(driver,1);

			//RegistrationTest.clickOptionBtn(driver);
			//RegistrationTest.testExcelRegistration(driver, i);
	//REG		RegistrationTest.testExcelRegistrationSeveralUsers(driver);
			//SignIn.navigateLoginPage(driver);
//			WebElement element12 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]"));
//			element12.sendKeys("radii");
			
	
			
//		}
		
//		catch (Exception e) {
//			System.out.println("HM... Prekinuli ste test u toku rada" +  e.toString());
//		}

	}
}
