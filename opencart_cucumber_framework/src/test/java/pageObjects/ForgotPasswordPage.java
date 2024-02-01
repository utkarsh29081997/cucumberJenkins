package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
	WebElement forgotpassHeading;

	@FindBy(xpath = "//label[@class='oxd-label']")
	WebElement txtusername;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
	WebElement inputUsername;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")
	WebElement btnReset;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
	WebElement confirmationHeading;

	public String getforgotPassHeading() {

		return forgotpassHeading.getText();

	}

	public String getusernameLabel() {

		return txtusername.getText();

	}
	
	public void setUsername(String username) {

		inputUsername.sendKeys(username);;

	}
	
	public String getcnfrmtnHeading() {
		return confirmationHeading.getText();
	}
	
	public void clickReset(){
		btnReset.click();
	}

}