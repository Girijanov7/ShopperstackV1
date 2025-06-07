package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText="Home")
	WebElement home_breadcrum;
	
	
	//actions
	public String getBreadcrumText() {
		return home_breadcrum.getText();
	}
	
	
}
