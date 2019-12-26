package page.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Cart;
import page.objects.PetStoreItem;
import page.objects.PetStoreManu;
import page.objects.SignIn;
import page.utilites.ExcelUtils;

public class CartTest {

	public static void wait2() {
		try {
			Thread.sleep(2999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public static void getItemInCart(WebDriver driver, int i) {

		// SignIn part
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
		// wait2();

		signIn.clickSignInBtn();

		PetStoreManu petstorem = new PetStoreManu(driver);

		// Cart cart = new Cart(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		SoftAssert sa = new SoftAssert();
		// clicksto Fish manu
		petstorem.clickToEnterFmenu();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait2();
		// clicks to Gold Fish items
		PetStoreItem petstoremI = new PetStoreItem(driver);
		//petstoremI.clickGoldFish();
		petstoremI.clickAdultMaleGoldFish();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait2();
		
		petstoremI.clickAddToCartBtn();
		int someInt = driver.findElements(By.xpath("//a[contains(text(),'EST-20')]")).size();
		
		sa.assertEquals(someInt, 1);
		sa.assertAll();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 wait2();
//		//click to add to cart button
//		petstoremI.clickAddToCartBtn();
//		

		// String s = driver.getCurrentUrl();
		// boolean b =true;
		// b =s.contains("viewCategory=&categoryId=FISH");
		// if(s.contains("viewCategory=&categoryId=FISH")){
		// System.out.println("Meni je uspesno otvoren");
		// }else {
		// System.out.println("Meni nije uspesno otvoren");
		// }
		// sa.assertEquals(b, true );
		// sa.assertTrue(b);
		// sa.assertAll();
	}

}
