package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
	

	// constructor
	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	// locators
	@FindBy(id = "First Name")
	WebElement firstName_input;
	@FindBy(id = "Last Name")
	WebElement lastName_input;
	@FindBy(id = "Male")
	WebElement gender_btn;
	@FindBy(id = "Phone Number")
	WebElement phone_num_input;
	@FindBy(id = "Email Address")
	WebElement email_input;
	@FindBy(id = "Password")
	WebElement password_input;
	@FindBy(id = "Confirm Password")
	WebElement cnfPassword_input;
	@FindBy(id = "Terms and Conditions")
	WebElement term_condition_check;
	@FindBy(xpath = "//button[@id=\'Register\' or @id=\'btnDisabled\']")
	WebElement registerBtn;
	
	//Actions
	public void setFirstName(String fname) {
		firstName_input.sendKeys(fname);
	}
	public void setLastName(String lname) {
		lastName_input.sendKeys(lname);
	}
	public void selectGender() {
		gender_btn.click();;
	}
	public void setPhNum(String phNum) {
		phone_num_input.sendKeys(phNum);
	}
	public void setEmail(String email) {
		email_input.sendKeys(email);
	}
	public void setPassword(String pwd) {
		password_input.sendKeys(pwd);
	}
	public void setCnfPassword(String cPwd) {
		cnfPassword_input.sendKeys(cPwd);
	}
	public void checkTandC() {
		term_condition_check.click();;
	}
	public void clickRegisBtn() {
		registerBtn.click();;
	}

}


