package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{

	//constructor
	public WelcomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Locator
	@FindBy(id="loginBtn") 
	WebElement loginBtn;
	
	//Actions
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	

}
