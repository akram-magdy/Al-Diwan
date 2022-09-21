package Automation.El_Diwan;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class AmenityPageTest extends TestBase {

	LoginPage LoginPageObj;
	SideMenu SideMenuObj;
	AmenitiesPage AmenitiesPageObj;

	// String TitleinEN= " Fieldone";
	String TitleinAR = "وانقسلد";
	String Email = "SuperAdmin@Diwan.com";
	String Password = "asd123A@";

	Faker fakeData = new Faker();
	String TitleinEN = fakeData.name().firstName();

	@Test
	public void AddNewAmenitySuccessfully() throws InterruptedException, AWTException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		SideMenuObj = new SideMenu(driver);
		SideMenuObj.OpenAmenityPage();
		AmenitiesPageObj = new AmenitiesPage(driver);
		AmenitiesPageObj.AddNewAmenity(TitleinEN, TitleinAR);
		Assert.assertTrue(AmenitiesPageObj.SuccessMessage.getText().contains("Saved"));
		Thread.sleep(3000);
	}
}
