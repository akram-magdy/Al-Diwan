package Automation.El_Diwan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideMenu extends PageBase {

	public SideMenu(WebDriver driver) {
		super(driver);

	}

//	@FindBy (linkText = "General Configuration")
//	WebElement GeneralConfigurationDropDown;

	@FindBy(xpath = "//*[@id=\"html\"]/body/app-root/app-admin-layout/div[2]/div/div/div[1]/app-sidebar/div[1]/div[2]/ul/li[3]/a/div/div[2]/span[1]")
	WebElement GeneralConfigurationDropDown;

//	@FindBy (linkText = "Amenities")
//	WebElement AmenitiesLinkTxt;

	@FindBy(xpath = "//*[@id=\"html\"]/body/app-root/app-admin-layout/div[2]/div/div/div[1]/app-sidebar/div[1]/div[2]/ul/li[3]/ul/li[1]/a")
	WebElement AmenitiesLinkTxt;

	@FindBy(linkText = "Cuisines")
	WebElement CuisinesLinkTxt;

	@FindBy(linkText = "ٍSeatings")
	WebElement SeatingsLinkTxt;

	@FindBy(linkText = "ٍPayment Settings")
	WebElement PaymentSettingsLinkTxt;

	@FindBy(linkText = "Reviews Options")
	WebElement PReviewsOptionsLinkTxt;

	@FindBy(linkText = "Ingredients Configuration")
	WebElement IngredientsConfigurationDropDown;

	@FindBy(linkText = "Ingredients' Categories")
	WebElement IngredientsCategoriesLinkTxt;

	@FindBy(linkText = "Ingredients")
	WebElement IngredientsLinkTxt;
	
	@FindBy(linkText = "Measurement Units")
	WebElement MeasurementUnitsLinkTxt;
	

	public void OpenAmenityPage() {
		clickButton(GeneralConfigurationDropDown);
		clickButton(AmenitiesLinkTxt);
	}

	public void OpenCuisines() {
		clickButton(GeneralConfigurationDropDown);
		clickButton(CuisinesLinkTxt);
	}

	public void OpenSeatingPage() {
		clickButton(GeneralConfigurationDropDown);
		clickButton(SeatingsLinkTxt);
	}
	
	public void OpenIngredientsCategoriesPage() {
		clickButton(IngredientsConfigurationDropDown);
		clickButton(IngredientsCategoriesLinkTxt);
	}
	
	public void openIngredientsPage()
	{
		clickButton(IngredientsConfigurationDropDown);
		clickButton(IngredientsLinkTxt);
	}
	
	public void OpenMeasurementUnitsPage()
	{
		clickButton(IngredientsConfigurationDropDown);
		clickButton(MeasurementUnitsLinkTxt);
	}
	
	

}
