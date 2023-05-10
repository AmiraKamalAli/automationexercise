package automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.actiondriver.Action;
import automation.base.BaseClass;


public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//div[1]/ul[1]/li[4]/a[1]")
	private WebElement signup;


	
	Action action = new Action();

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}



	public void signup() {
		// TODO Auto-generated method stub
		action.implicitWait(getDriver(), 1000);
		action.click(getDriver(), signup);
	}



}
