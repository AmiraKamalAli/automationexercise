package automation.testcases;

import org.testng.annotations.Test;

import automation.base.BaseClass;
import automation.pageobjects.ConfirmDeletedaccountPage;

public class ConfirmDeletedaccountTest extends BaseClass {

	@Test(priority = 1)
	public void VerifyTextisvisable() {

		ConfirmDeletedaccountPage conf = new ConfirmDeletedaccountPage();
		conf.checkAccountDeleteTextIsVisiable();
	}

	@Test(priority = 2)
	public void Contiune() {

		ConfirmDeletedaccountPage conf = new ConfirmDeletedaccountPage();
		conf.Contiune();
	}

}
