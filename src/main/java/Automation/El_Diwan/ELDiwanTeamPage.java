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
import org.openqa.selenium.support.ui.Select;

public class ELDiwanTeamPage extends PageBase{

	public ELDiwanTeamPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Add New Team Member")
	WebElement  AddNewTeamMemberBTn;
	
	@FindBy(xpath = "//*[@id=\"html\"]/body/app-root/app-admin-layout/div[2]/div/div/div[2]/div/app-user-form/form/div/div/div[1]/div[2]/div[1]/div/div[1]/label/div")
	WebElement Pic;
	
	@FindBy(css = "input[formcontrolname='fName']")
	WebElement firstNameTxt;
	
	@FindBy(css = "input[formcontrolname='lName']")
	WebElement LastNameTxt;
	
	
	@FindBy(css = "input[id='phone']")
	WebElement PhoneTxt;
	
	@FindBy(css = "input[formcontrolname='email']")
	WebElement EmailTxt;
	
	@FindBy(xpath = "//*[@id=\"html\"]/body/app-root/app-admin-layout/div[2]/div/div/div[2]/div/app-user-form/form/div/div/div[1]/div[2]/div[2]/div/div[5]/mat-form-field/div/div[1]/div[3]")
	WebElement NationalityList;
	
//	@FindBy(css = "input[formcontrolname='nationalityId']")
//	WebElement NationalityList;
	
	
	
	@FindBy(linkText = "Egyption")
	WebElement EgyptionChoice;
	
	@FindBy(linkText = "Date of birth")
	WebElement DateofbirthInput;
	
	@FindBy(linkText = "2")
	WebElement Day;
	
	@FindBy(className = "mat-radio-label-content")
	WebElement Male;
	
	@FindBy(className = "mat-form-field-infix ng-tns-c150-50")
	WebElement WorkInformationDropDown;
	
	@FindBy(linkText = " Add AlDiwan Team Member ")
	WebElement  AddAlDiwanTeamMemberBtn;
	
	@FindBy(css = "mat-select[formcontrolname='NationalityList']")
	WebElement NationalityDropDown;
	
	String imageName = "Dummy.jpg";
	String imagePath = System.getProperty("user.dir") + "\\Uploads\\" + imageName;
	
	
	public void AddNewMember(String FirstName , String LastName , String Phone , String REmail) throws InterruptedException, AWTException
	{
		clickButton(AddNewTeamMemberBTn);
		clickButton(Pic);
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
		setTextElementText(firstNameTxt, FirstName);
		setTextElementText(LastNameTxt, LastName);
		setTextElementText(PhoneTxt, Phone);
		setTextElementText(EmailTxt, REmail);
		clickButton(NationalityList);
//		clickButton(EgyptionChoice);
		
		Select select = new Select(NationalityDropDown);
		select.selectByVisibleText("Egyption");
		Thread.sleep(5000);
		
		
	}
	
	
	
	
	
	
}
