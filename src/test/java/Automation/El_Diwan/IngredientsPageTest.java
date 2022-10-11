package Automation.El_Diwan;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class IngredientsPageTest extends TestBase {

	LoginPage LoginPageObj;
	SideMenu SideMenuObj;
	IngredientsPage IngredientsPageObj;

	String Email = "SuperAdmin@Diwan.com";
	String Password = "asd123A@";

	Faker fakeData = new Faker();
	String IngredientTitleInEN = fakeData.name().firstName();
	String IngredientTitleInAR = "عابفغالارؤ";

	@Test
	public void AddNewIngredientsSuccessfully() throws InterruptedException, AWTException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		SideMenuObj = new SideMenu(driver);
		SideMenuObj.openIngredientsPage();
		IngredientsPageObj = new IngredientsPage(driver);
		IngredientsPageObj.OpenIngredientPage(IngredientTitleInEN, IngredientTitleInAR);
	}

}
