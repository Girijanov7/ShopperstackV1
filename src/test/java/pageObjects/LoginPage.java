package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	//constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//Locator
	@FindBy(id="Create Account") 
	WebElement createAccBtn; 
	
	@FindBy(xpath="//h3[text()=\'Welcome to ShoppersStack. Enjoy shopping with us.\']")
	WebElement wlc_msg;
	
	@FindBy(id="Email")
	WebElement email_input;
	
	@FindBy(id="Password")
	WebElement password_input;
	
	@FindBy(id="Login")
	WebElement login_btn;
	
	
	//Actions
	public void clickCreateAccBtn() {
		createAccBtn.click();
	}
	
	public String getWlcMsg() {
		try {
			return wlc_msg.getText();
		}
		catch(Exception e) {
		return	e.getMessage();
		}
	}
	
	public void setEmail(String email) {
		email_input.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		password_input.sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		login_btn.click();
	}
	
	

}
