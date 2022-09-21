package Automation.El_Diwan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmenitiesPage extends PageBase {

	public AmenitiesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Add New Amenity")
	WebElement AddNewAmenityBtn;

	@FindBy(id = "mat-input-2")
	WebElement TitleinENTxt;

//	@FindBy(xpath = "//*[@id=\"mat-input-2\"]")
//	WebElement TitleinENTxt ;

	@FindBy(id = "mat-input-3")
	WebElement TitleinARTxt;
	
//	@FindBy(name = "title_EN")
//	WebElement TitleinENTxt;

//	@FindBy(xpath = "//*[@id=\"mat-input-3\"]")
//	WebElement TitleinARTxt ;

//	@FindBy(linkText = "Save & Close")
//	WebElement SaveADDNewBtn;

	@FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-form/form/mat-dialog-actions/button[3]")
	WebElement SaveADDNewBtn;

	String imageName = "Dummy.jpg";
	String imagePath = System.getProperty("user.dir") + "\\Uploads\\" + imageName;

	@FindBy(className = "image-preview")
	WebElement UploadAmenityInput;

	@FindBy(className = "swal2-html-container")
	public WebElement SuccessMessage;

	public void AddNewAmenity(String TitleinEN, String TitleinAR) throws InterruptedException, AWTException {
		clickButton(AddNewAmenityBtn);
		clickButton(UploadAmenityInput);
		Thread.sleep(1000);
		Robot robot = new Robot();
		// CTRL + C copy image path
		StringSelection selection = new StringSelection(imagePath);
		System.out.println(imagePath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		// Click on CTRL + V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		// setTextElementText(UploadAmenityInput, imagePath);
		setTextElementText(TitleinENTxt, TitleinEN);
		setTextElementText(TitleinARTxt, TitleinAR);
		clickButton(SaveADDNewBtn);
	}
}
