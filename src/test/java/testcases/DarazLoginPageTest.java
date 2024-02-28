package testcases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import pages.DarazHomePage;
import pages.DarazLoginPage;
import utilities.DataSet;
import utilities.DriverSetUp;

public class DarazLoginPageTest extends DriverSetUp{
	DarazLoginPage darazLogin=new DarazLoginPage();
	DarazHomePage darazHome=new DarazHomePage();
	
	@Test(dataProvider="invalid credentials",dataProviderClass=DataSet.class)
	public void testLoginInvalidData(String name,String password,String ErrorMessage) throws InterruptedException {
		getDriver().get(darazHome.DarazDashbOardUrl);
		darazHome.btnClick(darazHome.LoginButton);
		darazLogin.writeText(darazLogin.emailOrPhoneNumber,name);
		darazLogin.writeText(darazLogin.userPassword, password);
		darazLogin.btnClick(darazLogin.loginBtn);
		darazHome.getScreenShot("login page");
		assertEquals(darazLogin.getElement(darazLogin.ErrorMsg).getText(),ErrorMessage);
		Thread.sleep(2000);
	}

}
