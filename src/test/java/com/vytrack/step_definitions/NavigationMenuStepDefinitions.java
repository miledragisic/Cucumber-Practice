package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefinitions {

    @When("User goes to Fleet, Vehicles")
    public void user_goes_to_Fleet_Vehicles() {
        System.out.println("Opening Fleet, Vehicles");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/entity\\/Extend_Entity_Carreservation")
    public void the_url_should_be_https_qa_vytrack_com_entity_Extend_Entity_Carreservation(Integer int1) {
        System.out.println("Verifying URL for Vehicles");
    }

    @When("user goes to Marketing, Campaigns")
    public void user_goes_to_Marketing_Campaigns() {
        System.out.println("Opening Marketing, Campaigns");
    }

    @Then("the url should be https:\\/\\/qa{int}.vytrack.com\\/campaign")
    public void the_url_should_be_https_qa_vytrack_com_campaign(Integer int1) {
        System.out.println("Verifying URL for Marketing, Campaigns");
    }

    @When("User goes to Activities, Calendar Events")
    public void user_goes_to_Activities_Calendar_Events() {
        System.out.println("Opening Activities, Calendar Events");
    }

    @Then("the url should be https:qa{int}.vytrack.com\\/calendar\\/event")
    public void the_url_should_be_https_qa_vytrack_com_calendar_event(Integer int1) {
        System.out.println("Verifying URL for Activities, Calendar Events");
    }
}
