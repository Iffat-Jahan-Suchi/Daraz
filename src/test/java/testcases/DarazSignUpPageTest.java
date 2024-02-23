package testcases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DarazHomePage;
import pages.DarazSignUpPage;
import utilities.DriverSetUp;

public class DarazSignUpPageTest extends DriverSetUp {

	DarazSignUpPage darazSignUp = new DarazSignUpPage();
	DarazHomePage homePage = new DarazHomePage();

	@Test(priority = 1)
	public void clickSignUpBlandData() {
		getDriver().get(darazSignUp.regUrl);
		darazSignUp.btnClick(darazSignUp.clickToSignUp);
		assertEquals(darazSignUp.getElement(darazSignUp.errorSignUpMsg).getText(), "Please enter the sms code");

	}

	@Test(priority = 2)
	public void validDataSignUp() throws InterruptedException {
		getDriver().get(darazSignUp.regUrl);
		darazSignUp.writeText(darazSignUp.phoneNo, "01752998415");
		darazSignUp.writeText(darazSignUp.passwordCreate, "pass987654321");

		Thread.sleep(1000);
		darazSignUp.getElement(darazSignUp.selectGender).click();
		getDriver().findElement(By.xpath("//li[@value='male']")).click();
		Thread.sleep(1000);

		darazSignUp.getElement(darazSignUp.monthPick).click();
		getDriver().findElement(By.xpath("(//li[@role='menuitem'])[3]")).click();
		Thread.sleep(1000);

		darazSignUp.getElement(darazSignUp.dayPick).click();
		getDriver().findElement(By.xpath("//li[text()='05']")).click();
		Thread.sleep(1000);

		darazSignUp.getElement(darazSignUp.yearPick).click();
		List<WebElement> yrs = getDriver().findElements(By.xpath("//li[@class='next-menu-item']"));
		Thread.sleep(3000);
		for (WebElement yr : yrs) {
			if (yr.getText().equalsIgnoreCase("2011")) {
				System.out.println(yr.getText());
				yr.click();
				Thread.sleep(3000);
				break;

			}
		}
		darazSignUp.writeText(darazSignUp.fullName, "iffat jahan");
		darazSignUp.btnClick(darazSignUp.clickToSignUp);
		Thread.sleep(3000);

	}

}
