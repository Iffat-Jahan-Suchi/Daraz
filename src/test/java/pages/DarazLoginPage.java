package pages;

import org.openqa.selenium.By;

public class DarazLoginPage extends BasePage{
	
	public String Daraz_login="https://member.daraz.com.bd/user/login";
	public String Login_PageTitle="Daraz.com.bd: Online Shopping Bangladesh - Mobiles, Tablets, Home Appliances, TV, Audio &amp; More";
	public By emailOrPhoneNumber=By.xpath("//input[@data-meta='Field']");
	public By userPassword=By.xpath("(//input[@data-meta='Field'])[2]");
	public By loginBtn=By.xpath("//button[text()='LOGIN']");
	public By ErrorMsg=By.xpath("//div[@class='next-feedback-content']");
	
	public void doLogin(String email,String password) {
		writeText(emailOrPhoneNumber,email);
		writeText(userPassword,password);
		btnClick(loginBtn);
	}

}
