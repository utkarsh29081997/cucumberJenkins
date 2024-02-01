package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	static WebElement loginTitle;

	@FindBy(xpath = "//input[@name='username']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement btnLogin;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotPasswordLink;


	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	
	public String loginTitlecheck(){
		return loginTitle.getText();
	}
	
	public void clickforgotPasswordLink() {
		forgotPasswordLink.click();
	}

	

}
