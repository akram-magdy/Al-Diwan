package Automation.El_Diwan;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class VoucherAndPromoCodeTest extends TestBase {

	LoginPage LoginPageObj;
	SideMenu SideMenuObj;
	VoucherAndPromoCode VoucherAndPromoCodeObj;

	String Email = "SuperAdmin@Diwan.com";
	String Password = "asd123A@";

	String DesINEn = "TestDes";

	String DesInArTxt = " تيست";
	String DicountAmountTxt = "50";
	Faker fakeData = new Faker();
	String AddPromoCodeTxt = fakeData.name().firstName();

	@Test

	public void AddVoucherSuccessfully() throws InterruptedException, AWTException {
		LoginPageObj = new LoginPage(driver);
		LoginPageObj.UserCanLogin(Email, Password);
		SideMenuObj = new SideMenu(driver);
		SideMenuObj.OpenVoucherPage();
		VoucherAndPromoCodeObj = new VoucherAndPromoCode(driver);
		VoucherAndPromoCodeObj.AddNewVoucher(AddPromoCodeTxt, DesINEn, DesInArTxt, DicountAmountTxt);
		Assert.assertTrue(VoucherAndPromoCodeObj.SuccessMessage.getText().contains("Saved "));
		Thread.sleep(3000);
	}

}
