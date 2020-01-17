package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.LoginPage2;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage2 loginPage2= new LoginPage2();

    @Given("user is on the login page")
    public void user_is_on_the_login_page(){
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as store manager")
    public void user_logs_in_as_store_manager(){

        System.out.println("Login as store manager");
        String userName= ConfigurationReader.getProperty("store_manager_user_name");
        String password= ConfigurationReader.getProperty("store_manager_password");
        loginPage2.login(userName, password);
    }

    //any string in "word" will become a parameter for step definition method
    //  And user verifies that "Dashboard" page subtitle is displayed

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {

        BasePage basePage= new BasePage();
        Assert.assertEquals(string, Driver.get().getTitle());
        System.out.println("Verifying page subtitle: " + string);

    }

    @Then("user logs in as driver")
    public void user_logs_in_as_driver(){

        System.out.println("Login as driver");
        String userName= ConfigurationReader.getProperty("driver_username");
        String pasword= ConfigurationReader.getProperty("driver_password");
        loginPage2.login(userName, pasword);

    }

    @Then("user logs in as sales manager")
    public void user_logs_in_as_sales_manager() {

        System.out.println("Login as sales manager");
        String userName= ConfigurationReader.getProperty("sales_manager_username");
        String password= ConfigurationReader.getProperty("sales_manager_password");
        loginPage2.login(userName, password);
    }

    // Then user enters "storemanager85" userename and "wrong" password
    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {

        System.out.println("Login with "+string+" username and "+string2+" password.");
        loginPage2.login(string, string2);
        Assert.assertNotEquals(Driver.get().getTitle(), "Dashboard");

    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {

        System.out.println("Verified that warning message is displayed: "+string);
    }

    @Given("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        System.out.println(userType);
    }

}
