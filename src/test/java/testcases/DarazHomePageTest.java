package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.DarazHomePage;
import utilities.DriverSetUp;

public class DarazHomePageTest extends DriverSetUp{
	
	DarazHomePage darazHome=new DarazHomePage();
	
	@Test
	public void darazHome() throws InterruptedException {
		getDriver().get(darazHome.DarazDashbOardUrl);
		getDriver().manage().window().maximize();
		getDriver().findElement(darazHome.LoginButton).click();
		Thread.sleep(1000);
		getDriver().findElement(darazHome.donet_page).click();
		Thread.sleep(1000);
		getDriver().findElement(darazHome.become_seller).click();
		getDriver().navigate().back();
		Thread.sleep(1000);
		Actions action=new Actions(getDriver());
		WebElement helpSupportPage=getDriver().findElement(darazHome.helpAndSupport);
		action.moveToElement(helpSupportPage).perform();
		getDriver().findElement(darazHome.CallUs).click();
		Thread.sleep(1000);
		getDriver().findElement(darazHome.signUp).click();
		
	}
	
	@Test
	public void ScrollVisaCard() throws InterruptedException {
		getDriver().get(darazHome.DarazDashbOardUrl);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		darazHome.scrolling(darazHome.aboutDaraz);
		Thread.sleep(3000);
	}

}
