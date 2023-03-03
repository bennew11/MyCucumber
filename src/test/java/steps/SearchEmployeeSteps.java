package steps;

import base.BaseClass;
import io.cucumber.java.en.*;


public class SearchEmployeeSteps extends BaseClass {
    @Given("user opens the browser and navigates to the Exelenter homepage")
    public void user_opens_the_browser_and_navigates_to_the_exelenter_homepage() {
        // Write code here that turns the phrase above into concrete actions
        setUp();

    }

    @Given("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
    loginPage.loginToWebsite("username","password");
    }

    @Given("user navigates to the employee list page")
    public void user_navigates_to_the_employee_list_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("uswe enters an existing employee id in the search-field")
    public void uswe_enters_an_existing_employee_id_in_the_search_field() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("User clicks on the search button")
    public void user_clicks_on_the_search_button() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("the employee information is displayed on the employee list table")
    public void the_employee_information_is_displayed_on_the_employee_list_table() {
        // Write code here that turns the phrase above into concrete actions

    }
}
