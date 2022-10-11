package Automation.El_Diwan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VoucherAndPromoCode extends PageBase {

	public VoucherAndPromoCode(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input[formcontrolname='voucherCode']")
	WebElement PromoCodeTxt;

	@FindBy(css = "input[formcontrolname='description']")
	WebElement DesInEnText;

	@FindBy(css = "input[formcontrolname='descriptionAR']")
	WebElement DesInArText;

	@FindBy(css = "input[formcontrolname='discountAmount']")
	WebElement DicountAmountText;

	@FindBy(xpath = "//*[@id=\"html\"]/body/app-root/app-admin-layout/div[2]/div/div/div[2]/div/app-user-form/form/div/div/div[1]/div[6]/div[2]/div[2]/div[1]/app-datepicker/div/div/div[1]/label")
	WebElement StartFrom;

	@FindBy(xpath = "//*[@id=\"html\"]/body/app-root/app-admin-layout/div[2]/div/div/div[2]/div/app-user-form/form/div/div/div[1]/div[6]/div[2]/div[2]/div[1]/app-datepicker/div/div/div[1]/ngb-datepicker/div[3]/button[1]")
	WebElement Today;

	@FindBy(css = "input[formcontrolname='startTime']")
	WebElement StartTime;

	@FindBy(xpath = "//*[@id=\"html\"]/body/ngx-material-timepicker-container/div[2]/ngx-material-timepicker-content/div/div/div[2]/div[2]/ngx-material-timepicker-button/button")
	WebElement Ok;

	@FindBy(xpath = "//*[@id=\"html\"]/body/app-root/app-admin-layout/div[2]/div/div/div[2]/div/app-user-form/form/div/div/div[1]/div[7]/div[2]/div[1]/mat-selection-list/mat-list-option[1]")
	WebElement TextMessage;

	@FindBy(linkText = "Add New Voucher/Promo Code")
	WebElement AddNewVoucherOrPromoCode;

	@FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	WebElement AddPromoCodeBtn;

	@FindBy(id = "swal2-html-container")
	public WebElement SuccessMessage;

	public void AddNewVoucher(String AddPromoCodeTxt, String DesInENTxr, String DesInArTxt, String DicountAmountTxt)
			throws AWTException {
		clickButton(AddNewVoucherOrPromoCode);
		setTextElementText(PromoCodeTxt, AddPromoCodeTxt);
		setTextElementText(DesInEnText, DesInENTxr);
		setTextElementText(DesInArText, DesInArTxt);
		setTextElementText(DicountAmountText, DicountAmountTxt);
		clickButton(StartFrom);
		clickButton(Today);
		clickButton(StartTime);
		clickButton(Ok);
		clickButton(TextMessage);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		clickButton(AddPromoCodeBtn);
	}

}
