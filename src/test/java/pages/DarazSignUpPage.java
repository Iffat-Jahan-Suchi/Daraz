package pages;

import org.openqa.selenium.By;

public class DarazSignUpPage extends BasePage {
	
	public String regUrl="https://member.daraz.com.bd/user/register";
	public By phoneNo = By.xpath("//input[@data-meta='Field']");
	public By vefifyCode = By.xpath("(//input[@data-meta='Field'])[2]");
	public By passwordCreate = By.xpath("(//input[@data-meta='Field'])[3]");
	public By selectGender = By.id("gender");
	public By monthPick = By.xpath("//span[text()='Month']");
	public By dayPick = By.xpath("//span[text()='Day']");
	public By yearPick = By.xpath("//span[text()='Year']");
	public By fullName = By.xpath("//label[text()='Full name']/following::input");
	public By clickToSignUp = By.xpath("//button[text()='SIGN UP']");
	public By errorSignUpMsg = By.xpath("//div[@class='next-feedback-content']");

	/*
	 * public void doSignUp(By locator, String text) { writeText(phoneNo,
	 * "01752998415"); writeText(passwordCreate, "123456789");
	 * writeText(vefifyCode,"8080"); getElement(monthPick).click();
	 * getElement(dayPick); getElement(yearPick); }
	 */

}
