package Automation.El_Diwan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CuisinePageTest extends TestBase {

	LoginPage LoginPageObj;
	SideMenu SideMenuObj;
	CuisinesPage CuisinePageObj;

	String Email = "SuperAdmin@Diwan.com";
	String Password = "asd123A@";

	String CuisineTitleInEN = "";
	String CuisineTitleInAR = " ";

	@Test

	public void AddNewCuisineSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		SideMenuObj = new SideMenu(driver);
		SideMenuObj.OpenCuisines();
		CuisinePageObj = new CuisinesPage(driver);
		CuisinePageObj.AddNewCuisine(CuisineTitleInEN, CuisineTitleInAR);
		Assert.assertTrue(CuisinePageObj.SuccessMessage.getText().contains("Saved"));
	}

}
