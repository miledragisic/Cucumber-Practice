package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage2;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    LoginPage2 loginPage2= new LoginPage2();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Opening the Login Page!");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @When("User logs in as driver")
    public void user_logs_in_as_a_driver() {
        System.out.println("User enters username and password");

        loginPage2.login(ConfigurationReader.getProperty("driver"), ConfigurationReader.getProperty("driver_pass"));

    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        System.out.println("User should be on the Home page!");
    }

    @When("User enters the store manager information")
    public void user_enters_the_store_manager_information() {
        System.out.println("Entering store manager login info");
        loginPage2.login(ConfigurationReader.getProperty("store_manager"), ConfigurationReader.getProperty("store_manager_pass"));
    }

    @When("User enters the sales manager infromation")
    public void user_enters_the_sales_manager_infromation() {
        System.out.println("Entering sales manager login info.");
        loginPage2.login(ConfigurationReader.getProperty("sales_manager"), ConfigurationReader.getProperty("sales_manager_pass"));
    }
}
