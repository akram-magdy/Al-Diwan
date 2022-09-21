package Automation.El_Diwan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IngredientsCategoriesPage  extends PageBase{

	public IngredientsCategoriesPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(className = "mat-button-wrapper")
	WebElement AddNewCategoryBtn;
	
	
	@FindBy(id = "mat-input-12")
	WebElement CategoryTitleInEnTxt;
	
	@FindBy(id = "mat-input-13")
	WebElement CategoryTitleInArTxt;
	
	@FindBy (linkText = " Save & Add New ")
	WebElement SaveADDNewBtn;
	
	
	public void AddNewIngredient( String CategoryTitleInEN , String CategoryTitleInAR )
	{
		clickButton(AddNewCategoryBtn);
		setTextElementText(CategoryTitleInEnTxt, CategoryTitleInEN);
		setTextElementText(CategoryTitleInArTxt, CategoryTitleInAR);
		clickButton(SaveADDNewBtn);
		
	}
	
	

}
