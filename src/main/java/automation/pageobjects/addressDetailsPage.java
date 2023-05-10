package automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.actiondriver.Action;
import automation.base.BaseClass;

public class addressDetailsPage extends BaseClass {
		
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement first_name;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lstname;

	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address1;
	
	@FindBy(xpath = "//input[@id='address2']")
	private WebElement address2;

	@FindBy(xpath = "//input[@id='state']")
	private WebElement state;
		
	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;
	@FindBy(xpath = "//input[@id='zipcode']")
	private WebElement zipcode;
		
	@FindBy(xpath = "//select[@id='country']")
	private WebElement country;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	private WebElement mobile_number;
	
	@FindBy(xpath = "//button[contains(text(),'Create Account')]")
	private WebElement submit;



	public addressDetailsPage() {
		PageFactory.initElements(getDriver(), this);
	}

	Action action = new Action();


	public void addfristname(String First_name) {
		// TODO Auto-generated method stub
		action.type(first_name, First_name);

	}

	public void addLastname(String Lastname) {
		// TODO Auto-generated method stub
		action.type(lstname, Lastname);
	}

	public void addCompany(String Company) {
		// TODO Auto-generated method stub
		action.type(company, Company);
	}

	public void addPrimaryAddress(String address4) {
		// TODO Auto-generated method stub
		action.type(address1, address4);
	}

	public void addSecondaryAddress(String address) {
		// TODO Auto-generated method stub
		action.type(address2, address);

	}

	public void addCountry(String Country) {
		// TODO Auto-generated method stub
		action.type(country, Country);	
	}

	public void addCity(String City) {
		// TODO Auto-generated method stub
		action.type(city, City);
	}



	public void addState(String State) {
		// TODO Auto-generated method stub
		action.type(state, State);

	}

	public void addZipcode(String Zipcode) {
		// TODO Auto-generated method stub
		action.type(zipcode, Zipcode);
	}

	public void addMobile_Number(String Mobile_Number) {
		// TODO Auto-generated method stub
		action.type(mobile_number, Mobile_Number);
	}

	public void clickCreateAccount() {
		// TODO Auto-generated method stub
		action.click(getDriver(), submit);
		
	}
	public void scrolltoActionstate() {
		// TODO Auto-generated method stub
		action.scrollByVisibilityOfElement(getDriver(), state);
	}


}
