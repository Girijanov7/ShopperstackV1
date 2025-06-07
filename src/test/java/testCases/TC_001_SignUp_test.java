package testCases;


import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.LoginPage;
import pageObjects.SignUpPage;
import pageObjects.WelcomePage;

public class TC_001_SignUp_test extends BaseClass {

	@Test(groups={"sanity","master"})
	public void verify_account_registration() throws InterruptedException {
		
		log.info("starting TC_001_SignUp_test case");
		
		
//		Thread.sleep(30000);
		WelcomePage wp = new WelcomePage(driver);
		wp.clickLoginBtn();
		log.info("lunching welcome page and clicking Login btn");

		LoginPage lp = new LoginPage(driver);
//		Thread.sleep(3000);
		lp.clickCreateAccBtn();
		log.info("lunching Login page and clicking create acc btn");

		SignUpPage sp = new SignUpPage(driver);
		
		sp.setFirstName("Girija");
		
		sp.setLastName("Nayak");
		
		sp.selectGender();
		
		sp.setPhNum("7978525645");
		
		sp.setEmail("giriija23@gmail.com");
		
		sp.setPassword("Girija$111");
		
		sp.setCnfPassword("Girija$111");
	
		sp.checkTandC();
		
		sp.clickRegisBtn();
		log.info("submiting register btn");

		String wlcMsg = lp.getWlcMsg();
		log.info("compairing welcome msg");
		
		Assert.assertEquals(wlcMsg, "Welcome to ShoppersStack. Enjoy shopping with us.");
		
		log.info("succesfully signin");
	}

}
