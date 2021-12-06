package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println(" i am inside Given");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		System.out.println(" i am inside When");
		System.out.println(username+"|"+password);
	}

	@And("user clicks on login button")
	public void clicks_on_login_button() {
		System.out.println(" i am inside And");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_home_page() {
		System.out.println(" i am inside Then");
	}


}
