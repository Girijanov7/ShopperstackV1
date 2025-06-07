package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;

public class TC002_Login_test extends BaseClass {

	@Test(groups= {"reggretion","master"})
	public void verifyLoginTest() {
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLoginBtn();

		LoginPage lp = new LoginPage(driver);
		lp.setEmail(prop.getProperty("emailId"));
		lp.setPassword(prop.getProperty("password"));
		lp.clickLoginBtn();

		HomePage hp = new HomePage(driver);
		String homeBreadcrum = hp.getBreadcrumText();
//		System.out.println(homeBreadcrum);
		
		Assert.assertEquals(homeBreadcrum, "Home");

		log.info("Login test pass");

	}

}
