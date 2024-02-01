package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ForgotPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ForgotPageSteps {
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	ForgotPasswordPage fp;

	@Given("the user navigates to Login page")
	public void the_user_navigates_to_login_page() {
		
		BaseClass.getLogger().info("Goto my account-->Click on Login.. ");
    	lp=new LoginPage(BaseClass.getDriver());
    	String title = lp.loginTitlecheck();
    	assertEquals(title, "Login");
    	lp.clickforgotPasswordLink();
		
	}
	@When("the user enters the details into below fields")
	public void the_user_enters_the_details_into_below_fields(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		fp = new ForgotPasswordPage(BaseClass.getDriver());
		fp.setUsername(dataMap.get("userName"));
		Thread.sleep(5000);
		
	}

	@When("the user clicks Reset Password")
	public void the_user_clicks_reset_password() {
		fp.clickReset();
	}
	
	
	@Then("Check the confirmation page")
	public void check_the_confirmation_page() throws InterruptedException {
	    
		String cnfrmHeading = fp.getcnfrmtnHeading();
		Assert.assertEquals(fp.getcnfrmtnHeading(), "Reset Password link sent successfully");
		Thread.sleep(5000);
	}

}
