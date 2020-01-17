package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage2;
import io.cucumber.java.en.Then;

public class TopMenuStepDefinitions {

    LoginPage2 loginPage2= new LoginPage2();

    // And user navigates to "Dashboards" then to "Manage Dashboards"
    @Then("user navigates to {string} then to {string}")
    public void user_navigates_to_then_to(String module, String submodule) {
        loginPage2.navigateTo(module, submodule);
    }

}
