package Automation.El_Diwan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MeasurementUnitsPage extends PageBase {

	public MeasurementUnitsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Add New Measurement Unit")
	WebElement AddNewMeasurementUnitBtn;

	@FindBy(id = "mat-input-8")
	WebElement MeasurementUnitsTitleInEnTxt;

	@FindBy(id = "mat-input-9")
	WebElement MeasurementUnitsTitleInARTxt;

	@FindBy(linkText = " Save & Add New ")
	WebElement SaveADDNewBtn;

	public void AddNewMeasurementUnits(String MeasurementUnitsTitleInEn, String MeasurementUnitsTitleInAR) {
		clickButton(AddNewMeasurementUnitBtn);
		setTextElementText(MeasurementUnitsTitleInEnTxt, MeasurementUnitsTitleInEn);
		setTextElementText(MeasurementUnitsTitleInARTxt, MeasurementUnitsTitleInAR);
		clickButton(SaveADDNewBtn);
	}

}
