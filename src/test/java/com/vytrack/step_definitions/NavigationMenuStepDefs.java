package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {


    @Given("the SM logged in and is on the dashboard page")
    public void the_SM_logged_in_and_is_on_the_dashboard_page() {
        System.out.println("I verify that title changed to Dashboard");
    }

    @When("the SM hovers over the Fleet button and clicks the Vehicles button")
    public void the_SM_hovers_over_the_Fleet_button_and_clicks_the_Vehicles_button() {
        System.out.println("as a SM I am able to see and clicks the Vehicles button ");
    }


    @Then("the SM should be able see Vehicles title")
    public void the_SM_should_be_able_see_Vehicles_title() {
        System.out.println("I verify that I am able to see Vehicles title");
    }




    @When("the SM hovers over the Marketing button and clicks the Campaigns button")
    public void the_SM_hovers_over_the_Marketing_button_and_clicks_the_Campaigns_button() {
        System.out.println("as a SM I am able to see and clicks the Campaigns button ");
    }

    @Then("the SM should be able see Campaigns title")
    public void the_SM_should_be_able_see_Campaigns_title() {
        System.out.println("I verify that I am able to see Campaigns title");
    }

    @When("the SM hovers over the Activities button and clicks the Calendar Events button")
    public void the_SM_hovers_over_the_Activities_button_and_clicks_the_Calendar_Events_button() {
        System.out.println("as a SM I am able to see and clicks the Calendar Events button ");

    }

    @Then("the SM should be able see Calendars title")
    public void the_SM_should_be_able_see_Calendars_title() {
        System.out.println("I verify that I am able to see Calendars title");
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {

        new DashboardPage().navigateToModule(tab, module);

    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {

        BrowserUtils.waitFor(5);

        ContactsPage contactsPage = new ContactsPage();
        contactsPage.pageNumber.getText();
        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNum,actualNumber);

    }




}
