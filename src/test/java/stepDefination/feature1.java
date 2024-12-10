package stepDefination;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class feature1 {
	
	@Before
	@Given("Lauch the browser in chrome application")
	public void Lauch_the_browser_in_chrome_application()
	{
		System.out.println("Lauch the browser in chrome application");
	}
	@Given("Enter the username and password")
	public void enter_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Enter the UserName and Password");
	}
	@Given("Click on submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Click on Submit Button");
	}
	@Then("User should be navigate to dashboard")
	public void user_should_be_navigate_to_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User should be naviagte to DashBoard");
	}

	// Verify the user able to login with wrong password
	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Error message should be displayed");
	}


}
