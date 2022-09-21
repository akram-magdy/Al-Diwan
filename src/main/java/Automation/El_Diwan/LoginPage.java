package Automation.El_Diwan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}


//	@FindBy(id = "mat-input-16")
//	WebElement EmailTxt;
	
	@FindBy(xpath = "//*[@id=\"mat-input-0\"]")
	WebElement EmailTxt;
	
	
//	@FindBy(id = "mat-input-17")
//	WebElement PasswordTxt;
	
	@FindBy(xpath = "//*[@id=\"mat-input-1\"]")
	WebElement PasswordTxt;
	
	@FindBy(xpath = "//*[@id=\"rc-anchor-container\"]/div[3]/div[1]/div/div")
	WebElement Captcha;
	
//	@FindBy(linkText = " login ")
//	WebElement LoginBtn;
	
	@FindBy(xpath = "//*[@id=\"html\"]/body/app-root/app-basic-layout/div/div/div[2]/app-login/form/div[2]/button")
	WebElement LoginBtn;
	
	
	public void UserCanLogin( String Email , String Password) throws InterruptedException
	{
		setTextElementText(EmailTxt, Email);
		setTextElementText(PasswordTxt, Password);
		//clickButton(Captcha);
		Thread.sleep(8000);
		clickButton(LoginBtn);
	}

}
