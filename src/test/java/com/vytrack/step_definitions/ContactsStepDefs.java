package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.LoginPage2;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactsStepDefs {



    @Given("a driver is logged in")
    public void a_driver_is_logged_in() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        String userName= ConfigurationReader.getProperty("driver");
        String passWord= ConfigurationReader.getProperty("driver_pass");
        new LoginPage2().login(userName, passWord);

    }

    @When("the user goes to {string} and {string}")
    public void the_user_goes_to_and(String module, String submodule) {
        new BasePage().navigateTo(module, submodule);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer count) {
        System.out.println("count= "+count);

        ContactsPage contactsPage= new ContactsPage();
        BrowserUtils.wait(3);
        String text= contactsPage.pageCount.getAttribute("value");
        System.out.println("String text= "+text);
        Integer actualCount= Integer.parseInt(text);
        System.out.println("actualCount parseInt= "+actualCount);
        Assert.assertEquals(count, actualCount);

    }

}
