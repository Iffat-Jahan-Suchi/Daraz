package testcases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import pages.DarazHomePage;
import pages.DarazLoginPage;
import utilities.DriverSetUp;

public class DarazLoginPageTest extends DriverSetUp{
	DarazLoginPage darazLogin=new DarazLoginPage();
	DarazHomePage darazHome=new DarazHomePage();
	
	@Test
	public void testLoginInvalidData() throws InterruptedException {
		getDriver().get(darazHome.DarazDashbOardUrl);
		darazHome.btnClick(darazHome.LoginButton);
		darazLogin.writeText(darazLogin.emailOrPhoneNumber,"123456789");
		darazLogin.writeText(darazLogin.userPassword, "password");
		darazLogin.btnClick(darazLogin.loginBtn);
		assertEquals(darazLogin.getElement(darazLogin.ErrorMsg).getText(),"Please enter a valid phone number.");
		Thread.sleep(2000);
	}

}
