package Automation.El_Diwan;

import com.github.javafaker.Faker;

public class MeasurementUnitPageTest extends TestBase {

	LoginPage LoginPageObj;
	SideMenu SideMenuObj;
	MeasurementUnitsPage MeasurementUnitsPageObj;

	String Email = "SuperAdmin@Diwan.com";
	String Password = "asd123A@";

	Faker fakeData = new Faker();
	String MeasurementUnitsTitleInEn = fakeData.name().firstName();
	String MeasurementUnitsTitleInAR = "وانقسلد";

	public void AddNewMeasurementUnitsSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		SideMenuObj = new SideMenu(driver);
		SideMenuObj.OpenMeasurementUnitsPage();
		MeasurementUnitsPageObj = new MeasurementUnitsPage(driver);
		MeasurementUnitsPageObj.AddNewMeasurementUnits(MeasurementUnitsTitleInEn, MeasurementUnitsTitleInAR);
	}

}
