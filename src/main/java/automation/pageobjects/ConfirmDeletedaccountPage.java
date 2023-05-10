package automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.actiondriver.Action;
import automation.base.BaseClass;

public class ConfirmDeletedaccountPage extends BaseClass {

	@FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
	private WebElement deletedAccount;

	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	private WebElement contnue;

	public ConfirmDeletedaccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	Action action = new Action();

	public void checkAccountDeleteTextIsVisiable() {
		// TODO Auto-generated method stub
		action.isDisplayed(getDriver(), deletedAccount);
	}

	public void Contiune() {
		// TODO Auto-generated method stub
		action.click(getDriver(), contnue);
	}

}
