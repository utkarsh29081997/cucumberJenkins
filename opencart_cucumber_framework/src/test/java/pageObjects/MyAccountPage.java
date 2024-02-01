package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']") // MyAccount Page heading
	WebElement dashboardHeading;
	
	@FindBy(xpath = "//div[@class='orangehrm-dashboard-widget-header']//p[@class='oxd-text oxd-text--p']")
	WebElement timeatWorkHeading;
	

	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (dashboardHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public String clickLogout() {
		String heading = timeatWorkHeading.getText();
		return heading;

	}
	
}
