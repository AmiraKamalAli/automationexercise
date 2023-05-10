package automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.actiondriver.Action;
import automation.base.BaseClass;

public class RegisterPage extends BaseClass {
	@FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
	private WebElement AccountInfo;

	@FindBy(xpath = "//input[@id='id_gender1']")
	private WebElement Title;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//select[@id='days']")
	private WebElement days;

	@FindBy(xpath = "//select[@id='months']")
	private WebElement months;

	@FindBy(xpath = "//select[@id='years']")
	private WebElement years;
	
	@FindBy(xpath = "//input[@id='newsletter']")
	private WebElement newsletter;

	@FindBy(xpath = "//input[@id='optin']")
	private WebElement options;
	
	@FindBy(xpath = "//button[contains(text(),'Create Account')]")
	private WebElement submit;
	Action action = new Action();

	public RegisterPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void ValidateTextisFound() {
		action.isDisplayed(getDriver(), AccountInfo);
	}

	public void SelectTitle() {
		// TODO Auto-generated method stub
		action.click(getDriver(), Title);

	}

	public void SelectTitle(String Password) {
		// TODO Auto-generated method stub
		action.type(password, Password);
	}

	public void SelectDay() {
		// TODO Auto-generated method stub
		action.selectByValue(days, "1");
	}

	public void SelectMonth() {
		// TODO Auto-generated method stub
		action.selectByIndex(months, 3);
	}

	public void SelectYear() {
		// TODO Auto-generated method stub
		action.selectByIndex(years, 5);

	}

	public void SelectNewsletter() {
		// TODO Auto-generated method stub
		action.click(getDriver(), newsletter);
	}

	public void Selectoptin() {
		// TODO Auto-generated method stub
		action.click(getDriver(), options);

	}

	public void scrolltoAction() {
		// TODO Auto-generated method stub
		action.scrollByVisibilityOfElement(getDriver(), newsletter);
	}

	public void scrolltoActionNews() {
		// TODO Auto-generated method stub
		action.scrollByVisibilityOfElement(getDriver(), newsletter);
	}
	
	
}
