package Automation.El_Diwan;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class SeatingPageTest extends TestBase {

	LoginPage LoginPageObj;
	SideMenu SideMenuObj;
	SeatingPage SeatingPageObj;
	String Email = "SuperAdmin@Diwan.com";
	String Password = "asd123A@";
	Faker fakeData = new Faker();
	String TitleinEN = fakeData.name().firstName();
	String TitleinAR = "وانقسلد";

	@Test

	public void AddNewSeatingSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		SideMenuObj = new SideMenu(driver);
		SideMenuObj.OpenSeatingPage();
		SeatingPageObj = new SeatingPage(driver);
		SeatingPageObj.AddNewSeating(TitleinEN, TitleinAR);

	}

}
