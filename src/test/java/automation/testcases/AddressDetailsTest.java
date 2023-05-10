package automation.testcases;

import org.testng.annotations.Test;

import automation.base.BaseClass;
import automation.dataprovider.DataProviders;
import automation.pageobjects.addressDetailsPage;

public class AddressDetailsTest extends BaseClass {

	@Test(priority = 1, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertFirstname(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		addressDetailsPage reg = new addressDetailsPage();
		reg.addfristname(First_name);
	}

	@Test(priority = 2, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertLastname(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		addressDetailsPage reg = new addressDetailsPage();
		reg.addLastname(Last_name);
	}

	@Test(priority = 3, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertCompany(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		addressDetailsPage reg = new addressDetailsPage();
		reg.addCompany(Company);
	}

	@Test(priority = 4, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertprimaryAddress(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		addressDetailsPage reg = new addressDetailsPage();
		reg.addPrimaryAddress(Address);
	}

	@Test(priority = 5, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertSecondaryAddress(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		addressDetailsPage reg = new addressDetailsPage();
		reg.addSecondaryAddress(Address2);
		reg.scrolltoActionstate();
	}

	@Test(priority = 6, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertCounrty(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		addressDetailsPage reg = new addressDetailsPage();
		reg.addCountry(Company);
	}
	@Test(priority = 7, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertState(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		addressDetailsPage reg = new addressDetailsPage();
		reg.addState(State);
	}

	@Test(priority = 8, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertCity(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		addressDetailsPage reg = new addressDetailsPage();
		reg.addCity(City);
	}

	@Test(priority = 9, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertZipcode(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		addressDetailsPage reg = new addressDetailsPage();
		reg.addZipcode(Zipcode);
	}
	
	@Test(priority = 10, dataProvider = "Account", dataProviderClass = DataProviders.class)
	public void insertMobile_Number(String Name, String Email, String Password, String First_name, String Last_name,
			String Company, String Address, String Address2, String Country, String State, String City, String Zipcode,
			String Mobile_Number) {

		addressDetailsPage reg = new addressDetailsPage();
		reg.addMobile_Number(Mobile_Number);
	}
	
	@Test(priority = 11)
	public void CreateAccount() {

		addressDetailsPage reg = new addressDetailsPage();
		reg.clickCreateAccount();
	}
}
