package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage2;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithParametersStepDefs {

    @When("User logs in using {string} and {string}")
    public void user_logs_in_using_and(String username, String password) {
        System.out.println("username: "+username);
        System.out.println("password: "+password);

        LoginPage2 loginPage2= new LoginPage2();
        loginPage2.login(username, password);
    }

    @Then("the title should contain {string}")
    public void the_title_should_contain(String title) {
        System.out.println("Title: "+title);
        Assert.assertTrue(Driver.get().getTitle().contains(title));

    }

    @When("User logs in as a {string}")
    public void user_logs_in_as_a(String userType) {

       Driver.get().get(ConfigurationReader.getProperty("url"));
       String userName;
       String password;
       LoginPage2 loginPage2= new LoginPage2();

       switch (userType){
           case "driver":
               userName= ConfigurationReader.getProperty("driver");
               password= ConfigurationReader.getProperty("driver_pass");
               loginPage2.login(userName, password);
               break;

           case "sales manager":
               userName= ConfigurationReader.getProperty("sales_manager");
               password= ConfigurationReader.getProperty("sales_manager_pass");
               loginPage2.login(userName, password);
               break;

           case "store manager":
               userName= ConfigurationReader.getProperty("store_manager");
               password= ConfigurationReader.getProperty("store_manager_pass");
               loginPage2.login(userName, password);
               break;

           default:
               Assert.fail("Wrong User Type");
       }

//        switch (userType){
//            case "driver":
//                userName= ConfigurationReader.getProperty("driver");
//                password= ConfigurationReader.getProperty("driver_pass");
//                loginPage2.login(userName, password);
//                break;
//
//            case "customer":
//                userName= ConfigurationReader.getProperty("driver");
//                password= ConfigurationReader.getProperty("driver_pass");
//                loginPage2.login(userName, password);
//                break;
//
//            case "sales manager":
//                userName= ConfigurationReader.getProperty("sales_manager");
//                password= ConfigurationReader.getProperty("sales_manager_pass");
//                loginPage2.login(userName, password);
//                break;
//
//            case "store manager":
//                userName= ConfigurationReader.getProperty("store_manager");
//                password= ConfigurationReader.getProperty("store_manager_pass");
//                loginPage2.login(userName, password);
//                break;
//
//            default:
//                Assert.fail("Wrong user type");
//
//
//        }

    }

}
