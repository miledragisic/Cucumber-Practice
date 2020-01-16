package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage2;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContactsStepDefs2 {

    @Then("user should see following menu options")
    public void user_should_see_following_menu_options(List<String> list) {

        System.out.println("list: "+list.size());
        System.out.println(list);

        DashboardPage dashboardPage= new DashboardPage();

        List<String> actualList= new ArrayList<>();

        for(WebElement each : dashboardPage.menuOptions){
            actualList.add(each.getText());
        }
        Assert.assertEquals(list, actualList);
    }
    @When("User logs in using following credentials")
    public void user_logs_in_using_following_credentials(Map<String, String> userData) {

        LoginPage2 loginPage2= new LoginPage2();

        loginPage2.login(userData.get("username"), userData.get("password"));


    }

}
