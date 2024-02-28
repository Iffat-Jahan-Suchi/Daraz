package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
	
	@DataProvider(name="invalid credentials")
	public static Object dataSet() {
		Object[][] objects= {
				{"123456789","password","Please enter a valid phone number."},
				{"abc@gmail.com","9999999999","Incorrect username or password."},
				{"96587456222","......987456","Please enter a valid phone number."},
				{"iffat@gmsil.com","passpasspass","Incorrect username or password."},
				};
		return objects;
	}

}
