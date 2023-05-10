package automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.actiondriver.Action;
import automation.base.BaseClass;

public class ConfirmCreateadaccountPage extends BaseClass {

	@FindBy(xpath = "//b[contains(text(),'Account Created!')]")
	private WebElement accountCreated;

	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	private WebElement contnue;

	public ConfirmCreateadaccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	Action action = new Action();

	public void checkAccountCreatedTextIsVisiable() {
		// TODO Auto-generated method stub
		action.isDisplayed(getDriver(), accountCreated);
	}

	public void Contiune() {
		// TODO Auto-generated method stub
		action.click(getDriver(), contnue);
	}

}
