package Automation.El_Diwan;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class ElDiwanTeamPageTest extends TestBase{
	
	
	LoginPage LoginPageObj;
	SideMenu SideMenuObj;
	ELDiwanTeamPage ELDiwanTeamPageObj;
	
	String Email = "SuperAdmin@Diwan.com";
	String Password = "asd123A@";
	
	Faker fakeData = new Faker();
	String FirstName = fakeData.name().firstName();
	String LastName = fakeData.name().lastName();
	//String Phone= fakeData.phoneNumber().phoneNumber();
	String Phone = "115497156";
	String REmail = fakeData.internet().emailAddress();
	
	
	
	@Test
	public void AddNewMemberSuccessfully() throws InterruptedException, AWTException
	{
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		SideMenuObj = new SideMenu(driver);
		SideMenuObj.OpenAldiwanTeamPage();
		ELDiwanTeamPageObj = new ELDiwanTeamPage(driver);
		ELDiwanTeamPageObj.AddNewMember(FirstName, LastName, Phone, REmail);
	}
}
