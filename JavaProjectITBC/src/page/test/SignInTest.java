package page.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.PetStoreManu;
import page.objects.SignIn;
import page.utilites.ExcelUtils;

@Listeners(page.test.StringComparatorListener.class)
public class SignInTest {
	
	
	@Test
	
	//@Parameters({ "driver", "1" }) something worked
	public static void clickManuFQ(WebDriver driver, int i) {
		SignIn signIn = new SignIn(driver);
		signIn.navigateLoginPage(driver);
		
		
		ExcelUtils.setExcell("test3.xlsx");
		ExcelUtils.setWorkSheet("Sheet1");
		String data;
		
		
		
		data = ExcelUtils.getDataAt(i, 0);
		signIn.InputUser(data);
		data = ExcelUtils.getDataAt(i, 1);
		signIn.PasswordInput().clear();
		signIn.InputPassword(data);
		//wait2();
		
	
		signIn.clickSignInBtn();
		
		WebElement isSgnOut = signIn.takeSignOutBtn();
		int num = driver.findElements(By.xpath("//a[contains(text(),'Sign Out')]")).size();
		//sa.assertTrue(!signIn.takeSignOutBtn().equals(null));
		
		
		///try {
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(num, 1);
			sa.assertAll();
	//	} catch (Exception e) {

		//	System.out.println("You are not logged");

			
		}
		//System.out.println("Yeah, you are logged!");
		
//		wait2();
//		String s = driver.getCurrentUrl();
//		sa.assertEquals(s, signIn.SignInURL);
//		
		
//	}
	
}
