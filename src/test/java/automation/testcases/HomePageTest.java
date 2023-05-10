package automation.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.base.BaseClass;
import automation.pageobjects.HomePage;
import automation.utility.Log;

/**
 *
 */
public class HomePageTest extends BaseClass {

	@Parameters("browser")
	@Test(priority = 1)
	public void setup(String browser) {
		Log.info("launch chrome browser");
		launchApp(browser);

	}

	@Test(priority = 2)
	public void clickSignup() {
		HomePage home = new HomePage();
		home.signup();
	}

}
