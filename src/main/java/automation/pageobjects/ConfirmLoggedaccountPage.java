package automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.actiondriver.Action;
import automation.base.BaseClass;

public class ConfirmLoggedaccountPage extends BaseClass {

	@FindBy(xpath = "//a[contains(text(),' Logged in as')]")
	private WebElement loggedaccount;

	@FindBy(xpath = "//a[contains(text(),' Delete Account')]")
	private WebElement Delete;

	public ConfirmLoggedaccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	Action action = new Action();

	public void checkAccountloggedTextIsVisiable() {
		// TODO Auto-generated method stub
		action.isDisplayed(getDriver(), loggedaccount);
	}

	public void Delete() {
		// TODO Auto-generated method stub
		action.click(getDriver(), Delete);
	}

}
