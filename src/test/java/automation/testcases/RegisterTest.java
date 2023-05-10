package automation.testcases;

import org.testng.annotations.Test;

import automation.base.BaseClass;
import automation.dataprovider.DataProviders;
import automation.pageobjects.RegisterPage;

public class RegisterTest extends BaseClass {

	@Test(priority = 1)
	public void validateTextisDisplayed() {

		RegisterPage reg = new RegisterPage();
		reg.ValidateTextisFound();
	}
	@Test(priority = 2)
	public void selectTitle() {

		RegisterPage Title = new RegisterPage();
		Title.SelectTitle();
	}
	
	@Test(priority = 3, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertpassword(String Name, String Email, String Password, String First_name, String Last_name, String Company,
			String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		RegisterPage reg = new RegisterPage();
		reg.SelectTitle(Password);
	}
	
	@Test(priority = 4)
	public void selectDay() {

		RegisterPage reg = new RegisterPage();
		reg.SelectDay();
	}
	
	@Test(priority = 5)
	public void selectMonth() {

		RegisterPage reg = new RegisterPage();
		reg.SelectMonth();
	}
	
	@Test(priority = 6)
	public void selectYear() {

		RegisterPage reg = new RegisterPage();
		reg.SelectYear();
	}
	
	
	@Test(priority = 7)
	public void checkNewsletter() {

		RegisterPage reg = new RegisterPage();
		reg.scrolltoActionNews();
		reg.SelectNewsletter();
	}
	
	@Test(priority = 8)
	public void checkOptin() {

		RegisterPage reg = new RegisterPage();
		reg.Selectoptin();
	}
	@Test(priority = 9)
	public void scrollAction() {

		RegisterPage reg = new RegisterPage();
		reg.scrolltoAction();
	}}
