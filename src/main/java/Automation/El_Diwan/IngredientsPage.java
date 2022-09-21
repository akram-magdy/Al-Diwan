package Automation.El_Diwan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IngredientsPage extends PageBase {

	public IngredientsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Add New Ingredient")
	WebElement AddNewIngredientBtn;

	@FindBy(id = "mat-input-6")
	WebElement IngredientTitleInEnTxt;

	@FindBy(id = "mat-input-7")
	WebElement IngredientTitleInArTxt;
	
	@FindBy(linkText = "smoke - سموك")
	WebElement Smoke;

	@FindBy(linkText = " Save & Add New ")
	WebElement SaveADDNewBtn;

	public void OpenIngredientPage(String IngredientTitleInEN, String IngredientTitleInAR) {
		clickButton(AddNewIngredientBtn);
		setTextElementText(IngredientTitleInEnTxt, IngredientTitleInEN);
		setTextElementText(IngredientTitleInArTxt, IngredientTitleInAR);
		clickButton(Smoke);
		clickButton(SaveADDNewBtn);
	}

}
