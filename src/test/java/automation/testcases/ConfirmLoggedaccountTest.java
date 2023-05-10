package automation.testcases;

import org.testng.annotations.Test;

import automation.base.BaseClass;
import automation.pageobjects.ConfirmLoggedaccountPage;

public class ConfirmLoggedaccountTest extends BaseClass {

	@Test(priority = 1)
	public void VerifyTextisvisable() {

		ConfirmLoggedaccountPage conf = new ConfirmLoggedaccountPage();
		conf.checkAccountloggedTextIsVisiable();
	}

	@Test(priority = 2)
	public void Contiune() {

		ConfirmLoggedaccountPage conf = new ConfirmLoggedaccountPage();
		conf.Delete();
	}

}
