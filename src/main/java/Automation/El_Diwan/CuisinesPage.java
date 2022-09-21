package Automation.El_Diwan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CuisinesPage extends PageBase {

	public CuisinesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Add New Cuisine")
	WebElement AddNewCuisineBtn;

	@FindBy(id = "mat-input-10")
	WebElement CuisineTitleInENTxt;

	@FindBy(id = "mat-input-11")
	WebElement CuisineTitleInARTxt;

	@FindBy(linkText = " Save & Add New ")
	WebElement SaveADDNewBtn;

	@FindBy(className = "swal2-html-container")
	public WebElement SuccessMessage;

	public void AddNewCuisine(String CuisineTitleInEN, String CuisineTitleInAR) {
		clickButton(AddNewCuisineBtn);
		setTextElementText(CuisineTitleInENTxt, CuisineTitleInEN);
		setTextElementText(CuisineTitleInARTxt, CuisineTitleInAR);
		clickButton(SaveADDNewBtn);

	}
}
