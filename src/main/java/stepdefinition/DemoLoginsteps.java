package stepdefinition;

import Methods.DemoLoginMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoLoginsteps {
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		
		
		
	}

	@When("User enters UserName as {string}")
	public void user_enters_user_name_as(String string) {
		DemoLoginMethod.userName();
	}

	@And("enters password as {string}")
	public void enters_password_as(String string) {
		DemoLoginMethod.password();
	}

	@And("Click on login button")
	public void click_on_login_button() {
		DemoLoginMethod.submit();

	}

	@Then("User should navigate to the home page")
	public void user_should_navigate_to_the_home_page() {
		

	}
}
