package Automation.El_Diwan;

import com.github.javafaker.Faker;

public class IngredientsCategoriesPageTest extends TestBase {

	LoginPage LoginPageObj;
	SideMenu SideMenuObj;
	IngredientsCategoriesPage IngredientsCategoriesObj;

	String Email = "SuperAdmin@Diwan.com";
	String Password = "asd123A@";

	Faker fakeData = new Faker();
	String CategoryTitleInEN = fakeData.name().firstName();
	String CategoryTitleInAR = "وانقسلد";

	public void AddNewIngredientsCategoriesSuccessfully() throws InterruptedException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		SideMenuObj = new SideMenu(driver);
		SideMenuObj.OpenIngredientsCategoriesPage();
		IngredientsCategoriesObj = new IngredientsCategoriesPage(driver);
		IngredientsCategoriesObj.AddNewIngredient(CategoryTitleInEN, CategoryTitleInAR);
	}

}
