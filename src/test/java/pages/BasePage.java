package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utilities.DriverSetUp.getDriver;

public class BasePage {
	
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public void writeText(By locator,String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void btnClick(By locator) {
		getElement(locator).click();
	}

}
