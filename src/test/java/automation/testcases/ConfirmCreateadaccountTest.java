package automation.testcases;

import org.testng.annotations.Test;

import automation.base.BaseClass;
import automation.pageobjects.ConfirmCreateadaccountPage;

public class ConfirmCreateadaccountTest extends BaseClass {

	@Test(priority = 1)
	public void VerifyTextisvisable() {

		ConfirmCreateadaccountPage conf = new ConfirmCreateadaccountPage();
		conf.checkAccountCreatedTextIsVisiable();
	}

	@Test(priority = 2)
	public void Contiune() {

		ConfirmCreateadaccountPage conf = new ConfirmCreateadaccountPage();
		conf.Contiune();
	}

}
