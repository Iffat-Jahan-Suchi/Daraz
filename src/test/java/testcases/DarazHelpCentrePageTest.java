package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHelpCenterPage;
import utilities.DriverSetUp;

public class DarazHelpCentrePageTest extends DriverSetUp {
	DarazHelpCenterPage darazHelpPage=new DarazHelpCenterPage();
	@Test
	public void testHelpCenter() {
		getDriver().get(darazHelpPage.HelpCenter);
		assertEquals(getDriver().getTitle(),darazHelpPage.Title);
	}

}
