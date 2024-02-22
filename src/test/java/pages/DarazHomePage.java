package pages;

import org.openqa.selenium.By;

public class DarazHomePage extends BasePage{
	public By LoginButton=By.xpath("//a[@class='bld-txt']");
	public By signUpButton=By.xpath("//a[contains(@class,'grey bld-txt')]");
	public By helpAndSupport=By.xpath("//span[text()='Help & Support']");
	public By donet_page=By.xpath("(//a[@class='grey'])[2]");
	public By become_seller=By.xpath("//a[@class='grey']");
	public String DarazDashbOardUrl="https://www.daraz.com.bd/";
	public By CallUs=By.xpath("(//a[@class='care-item-anchor'])[3]");
	public By signUp=By.xpath("//a[contains(@class,'grey bld-txt')]");
	
	

}
