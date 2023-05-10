package automation.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import automation.base.BaseClass;
import automation.dataprovider.DataProviders;
import automation.pageobjects.SignupPage;


public class SignupPageTest extends BaseClass {
	@Test(priority = 1)

	public void CreateRandomData() throws IOException {

		SignupPage signup = new SignupPage();
		signup.createRandomData();
	}
	


	@Test(priority = 2, dataProvider = "Account", dataProviderClass = DataProviders.class)

	public void addname(String Name, String Email, String Password, String First_name, String Last_name, String Company,
			String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		SignupPage signup = new SignupPage();
		signup.addName(Name);
	}

	@Test(priority = 3, dataProvider = "Account", dataProviderClass = DataProviders.class)

	public void addEmail(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {
		SignupPage signup = new SignupPage();
		signup.addEmail(Email);
	}

	@Test(priority = 4)
	public void Click_signup_Button() {
		SignupPage signup = new SignupPage();
		signup.clickSignupButton();
	}

}
