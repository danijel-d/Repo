package page.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreManu;

public class PetStoreTest {
	
	
	public static void wait2() {
		try {
			Thread.sleep(3200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public static void clickManuF(WebDriver driver) {
		
		PetStoreManu petstorem = new PetStoreManu(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//WebDriverWait myWait = new WebDriverWait(driver, 10);
		
		SoftAssert sa = new SoftAssert();
		
		petstorem.clickToEnterFmenu();
		
		
		String s = driver.getCurrentUrl();
		boolean b =true;
		b =s.contains("viewCategory=&categoryId=FISH");
		if(s.contains("viewCategory=&categoryId=FISH")){
		System.out.println("Meni je uspesno otvoren");
		}else {
			System.out.println("Meni nije uspesno otvoren");
		}
		//sa.assertEquals(b, true );
		sa.assertTrue(b);
		sa.assertAll();
	}
	
	
	
	@Test
	public static void clickManuD(WebDriver driver) {
		
		PetStoreManu petstorem = new PetStoreManu(driver);
		
		SoftAssert sa = new SoftAssert();

		petstorem.clickToEnterDmenu();
		
		wait2();
		String s = driver.getCurrentUrl();
		boolean b =true;
		b =s.contains("viewCategory=&categoryId=FISH");
		if(s.contains("viewCategory=&categoryId=FISH")){
		System.out.println("Meni je uspesno otvoren");
		}else {
			System.out.println("Meni nije uspesno otvoren");
		}
		sa.assertEquals(b, true );
		sa.assertAll();
	}
	
	@Test
	public static void clickManuC(WebDriver driver) {
		
		PetStoreManu petstorem = new PetStoreManu(driver);
		
		SoftAssert sa = new SoftAssert();

		petstorem.clickToEnterCmenu();
		
		wait2();
		String s = driver.getCurrentUrl();
		boolean b =true;
		b =s.contains("viewCategory=&categoryId=FISH");
		if(s.contains("viewCategory=&categoryId=FISH")){
		System.out.println("Meni je uspesno otvoren");
		}else {
			System.out.println("Meni nije uspesno otvoren");
		}
		sa.assertEquals(b, true );
		sa.assertAll();
	}
	
	@Test
	public static void clickManuR(WebDriver driver) {
		
		PetStoreManu petstorem = new PetStoreManu(driver);
		
		SoftAssert sa = new SoftAssert();

		petstorem.clickToEnterRmenu();
		
		wait2();
		String s = driver.getCurrentUrl();
		boolean b =true;
		b =s.contains("viewCategory=&categoryId=FISH");
		if(s.contains("viewCategory=&categoryId=FISH")){
		System.out.println("Meni je R uspesno otvoren");
		}else {
			System.out.println("Meni R nije uspesno otvoren");
		}
		sa.assertEquals(b, true );
		sa.assertAll();
	}
	
	@Test
	public static void clickManuB(WebDriver driver) {
		
		PetStoreManu petstorem = new PetStoreManu(driver);
		
		SoftAssert sa = new SoftAssert();

		petstorem.clickToEnterBmenu();
		
		wait2();
		String s = driver.getCurrentUrl();
		boolean b =true;
		b =s.contains("viewCategory=&categoryId=FISH");
		if(s.contains("viewCategory=&categoryId=FISH")){
		System.out.println("Meni je B uspesno otvoren");
		}else {
			System.out.println("Meni B nije uspesno otvoren");
		}
		sa.assertTrue(b);
		sa.assertAll();
	}
	
	//Manu with Quick links uppper manu
	
	@Test //FI Manu test
	public static void clickManuFQ(WebDriver driver) {
		
		PetStoreManu petstorem = new PetStoreManu(driver);
		
		SoftAssert sa = new SoftAssert();

		petstorem.clickToEnterUFmenu();
		
		wait2();
		String s = driver.getCurrentUrl();
		boolean b =true;
		b =s.contains("viewCategory=&categoryId=FISH");
		if(s.contains("viewCategory=&categoryId=FISH")){
		System.out.println("Meni je FQ uspesno otvoren");
		}else {
			System.out.println("Meni FQ nije uspesno otvoren");
		}
		sa.assertTrue(b);
		sa.assertAll();
	}
	
	//Manu with images
	
	@Test //FI Manu test
	public static void clickManuFI(WebDriver driver) {
		
		PetStoreManu petstorem = new PetStoreManu(driver);
		
		SoftAssert sa = new SoftAssert();

		petstorem.clickToEnterFImenu();
		
		wait2();
		String s = driver.getCurrentUrl();
		boolean b =true;
		b =s.contains("viewCategory=&categoryId=FISH");
		if(s.contains("viewCategory=&categoryId=FISH")){
		System.out.println("Meni je FI uspesno otvoren");
		}else {
			System.out.println("Meni FI nije uspesno otvoren");
		}
		sa.assertTrue(b);
		sa.assertAll();
	}
	
	
	@Test
	public static void randomManuTest(WebDriver driver) {
		PetStoreManu petstorem = new PetStoreManu(driver);
		petstorem.clickToEnterFmenu();
		wait2();
		driver.navigate().back();
		petstorem.clickToEnterUDmenu();
		wait2();
		driver.navigate().back();
		petstorem.clickToEnterFImenu();
		wait2();
		driver.navigate().back();
		petstorem.clickToEnterCImenu();
		wait2();
		driver.navigate().back();
		petstorem.clickToEnterRImenu();
	
	}
}
