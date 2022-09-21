package Automation.El_Diwan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeatingPage extends PageBase{

	public SeatingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Add New Seating")
	WebElement AddNewSeatingBtn;
	
	@FindBy(xpath = "//*[@id=\"mat-input-38\"]")
	WebElement SeatingTitleInENTxt;
	
	@FindBy(xpath = "//*[@id=\"mat-input-39\"]")
	WebElement SeatingTitleInARTxt;
	
	@FindBy (linkText = " Save & Add New ")
	WebElement SaveADDNewBtn;
	
	
	public void AddNewSeating(String SeatingTitleInEN , String SeatingTitleInAR)
	{
		clickButton(AddNewSeatingBtn);
		setTextElementText(SeatingTitleInENTxt, SeatingTitleInEN);
		setTextElementText(SeatingTitleInARTxt, SeatingTitleInAR);
		clickButton(SaveADDNewBtn);
	}
	
	
}
