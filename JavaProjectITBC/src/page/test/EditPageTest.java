package page.test;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.PetStoreManu;
import page.objects.Registration;
import page.objects.SignIn;
import page.utilites.ExcelUtils;

public class EditPageTest {

  public static void wait2() {
		try {
			Thread.sleep(2999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test //SignIn test
	public static void editUserInfo(WebDriver driver, int i) {
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
		wait2();
		
	
		signIn.clickSignInBtn();
		
		PetStoreManu petstorem = new PetStoreManu(driver);
		Registration registration = new Registration(driver);

		registration.navigateEditPage(driver);
		
		ExcelUtils.setExcell("test3.xlsx");
		ExcelUtils.setWorkSheet("Sheet1");
		
		
		
		Scanner sc = new Scanner(System.in);
		//data = ExcelUtils.getDataAt(i, 0);
		data =sc.nextLine();
		signIn.InputPassword(data);
		ExcelUtils.setDataAt(i, 1, data);
		data =sc.nextLine();
		registration.repeatedPasswordInputW(data);
		ExcelUtils.setDataAt(i, 2, data);
		//data = ExcelUtils.getDataAt(i, 1);
		//signIn.PasswordInput().clear();
		wait2();
		
	
		registration.clickSaveEdit();
		
		driver.navigate().back();
		driver.navigate().back();
		wait2();
		petstorem.clickToEnterFImenu();
		wait2();
		registration.navigateEditPage(driver);
		signIn.clickSignOutBtn();
		
	/*	WebElement isSgnOut = signIn.takeSignOutBtn();
		int num = driver.findElements(By.xpath("//a[contains(text(),'Sign Out')]")).size();
		//sa.assertTrue(!signIn.takeSignOutBtn().equals(null));
		
		try {
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(num, 1);
			sa.assertAll();
		} catch (Exception e) {

			System.out.println("You are not logged");

			
		}
		System.out.println("Yeah, you are logged!");
		
//		wait2();
//		String s = driver.getCurrentUrl();
//		sa.assertEquals(s, signIn.SignInURL);
//		
		*/
	}
	
}
  
  
  
  
  
  

