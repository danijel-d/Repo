package page.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.utilites.ExcelUtils;
import page.objects.HomePage;
import page.objects.PetStoreManu;
import page.objects.Registration;
import page.objects.SignIn;



public class RegistrationTest {

	@Test //Registration test
	public static void clickOptionBtn(WebDriver driver) {
		Registration registration = new Registration(driver);
		registration.navigateRegistrationPage(driver);
		//SoftAssert sa = new SoftAssert();
		
		String str="NekiString";
		String psw="123STR";
		System.out.println(str);
		
		
		
		registration.enterUserId(str);
		registration.clickListOption();
		
		
		}
	
	
		@Test
		public static void testExcelRegistration(WebDriver driver, int i)  {
			Registration registration = new Registration(driver);
			registration.navigateRegistrationPage(driver);
			
			ExcelUtils.setExcell("test3.xlsx");
			ExcelUtils.setWorkSheet("Sheet1");
			String data;
			data = ExcelUtils.getDataAt(i, 0);
			registration.enterUserId(data);
			data = ExcelUtils.getDataAt(i, 1);
			registration.passwordInputUserW(data);
			data = ExcelUtils.getDataAt(i, 2);
			registration.repeatedPasswordInputW(data);
			
			
			data = ExcelUtils.getDataAt(i, 3);
			registration.firstNameInput(data);
			data = ExcelUtils.getDataAt(i, 4);
			registration.lastNameInput(data);
			data = ExcelUtils.getDataAt(i, 5);
			registration.emailInput(data);
			int intdata = ExcelUtils.getDataNum(i, 6);
			registration.phoneInput(String.valueOf(intdata));
			data = ExcelUtils.getDataAt(i, 7);
			registration.address1Input(data);
			data = ExcelUtils.getDataAt(i, 8);
			registration.address2Input(data);
			data = ExcelUtils.getDataAt(i, 9);
			registration.accountCityInput(data);
			data = ExcelUtils.getDataAt(i, 10);
			registration.accountStateInput(data);
			 intdata = ExcelUtils.getDataNum(i, 11);
			registration.accountZipInput(String.valueOf(intdata));
			data = ExcelUtils.getDataAt(i, 12);
			registration.accountCountryInput(data);
			System.out.println(".....");
			
			
			registration.clickBennerOption();
			registration.clickListOption();
			System.out.println(".....nastavak3");
			data=ExcelUtils.getDataAt(i, 13);
			registration.clickselectOption1(data);
			data=ExcelUtils.getDataAt(i, 14);
			System.out.println(".....nastavak");
			registration.clickselectOption2(data);
			System.out.println(".....nastavak2");
			registration.clickRegistration();
			System.out.println(".....nastavak3");
			
			SoftAssert sa = new SoftAssert();
			 
			sa.assertEquals(driver.getCurrentUrl(),PetStoreManu.URL);
			//sa.fail("Nije uspelo");
			sa.assertAll();
			
		

		}
		
		//System.out.println("Doslo je do clicka");
		
		
		//SA VISE USERA REGISTRACIJA
		@BeforeMethod
	    private void privateBeforeMethod() {
	        System.out.println("private beforeMethod called");
	    }
		@Test
		public static void testExcelRegistrationSeveralUsers(WebDriver driver)  {
			Registration registration = new Registration(driver);
			int n=10;
			registration.navigateRegistrationPage(driver);
//			WebStorage webStorage = (WebStorage) driver;
//	        SessionStorage sessionStorage = webStorage.getSessionStorage();
//	        LocalStorage localStorage = webStorage.getLocalStorage();
			for (int i = 1; i < n; i++) {
			
			
			ExcelUtils.setExcell("test3.xlsx");
			ExcelUtils.setWorkSheet("Sheet1");
			String data;
			data = ExcelUtils.getDataAt(i, 0);
			registration.enterUserId(data);
			//int intdata = ExcelUtils.getDataNum(i, 0);
			//registration.enterUserId(String.valueOf(intdata));
			data = ExcelUtils.getDataAt(i, 1);
			registration.passwordInputUserW(data);
			data = ExcelUtils.getDataAt(i, 2);
			registration.repeatedPasswordInputW(data);
			data = ExcelUtils.getDataAt(i, 3);
			registration.firstNameInput(data);
			data = ExcelUtils.getDataAt(i, 4);
			registration.lastNameInput(data);
			data = ExcelUtils.getDataAt(i, 5);
			registration.emailInput(data);
			int intdata = ExcelUtils.getDataNum(i, 6);
			registration.phoneInput(String.valueOf(intdata));
			data = ExcelUtils.getDataAt(i, 7);
			registration.address1Input(data);
			data = ExcelUtils.getDataAt(i, 8);
			registration.address2Input(data);
			data = ExcelUtils.getDataAt(i, 9);
			registration.accountCityInput(data);
			data = ExcelUtils.getDataAt(i, 10);
			registration.accountStateInput(data);
			 intdata = ExcelUtils.getDataNum(i, 11);
			registration.accountZipInput(String.valueOf(intdata));
			data = ExcelUtils.getDataAt(i, 12);
			registration.accountCountryInput(data);
			System.out.println(".....");
			
			
			registration.clickBennerOption();
			registration.clickListOption();
			System.out.println(".....nastavak3");
			data=ExcelUtils.getDataAt(i, 13);
			registration.clickselectOption1(data);
			data=ExcelUtils.getDataAt(i, 14);
			System.out.println(".....nastavak");
			registration.clickselectOption2(data);
			System.out.println(".....nastavak2");
			registration.clickRegistration();
			SoftAssert sa = new SoftAssert();

			//sa.assertEquals(driver.getCurrentUrl(),PetStoreManu.URL);
			
			String s = driver.getCurrentUrl();
			boolean b =true;
			b =s.contains("https://petstore.octoperf.com/actions/Catalog.action");
			if(s.contains("https://petstore.octoperf.com/actions/Catalog.action")){
			System.out.println("Registracija je uspesna");
			}else {
				System.out.println("Registracija nije uspesna");
			}
			sa.assertTrue(b);
			sa.assertAll();
		
			
			registration.navigateRegistrationPage(driver);
			registration.accountCity().clear();
			registration.accountCountry().clear();
			registration.accountState().clear();
			registration.accountZip().clear();
			registration.address1().clear();
			registration.address2().clear();
			registration.email().clear();
			registration.firstName().clear();
			registration.LastName().clear();
			registration.phone().clear();
			registration.passwordInputUser().clear();
			registration.userId().clear();
			registration.repeatedPasswordInput().clear();
			
			driver.manage().deleteAllCookies();
		System.out.println("cookies are gone");
			//storage.clear();
			if(i+1==n) {
			
				System.out.println("All users are registred");
				
			}else {
				System.out.println("Some users are not registred");
			}
			
			}
		
		}
	
  }
  
