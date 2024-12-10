package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class feature2 {

	@Given("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Student do not have access of dashboard" + username + password);
	}

	@Then("Student do not have access of dashboard")
	public void student_do_not_have_access_of_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Student do not have access of dashboard");
	}

	@Then("Admin have access of dashboard")
	public void admin_have_access_of_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Admin have access of dashboard");
	}

}
