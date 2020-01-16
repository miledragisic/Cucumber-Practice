package com.vytrack.step_definitions;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

   @Before
    public void setUp(){

        System.out.println("\tThis is coming from Hooks, before Scenario");
    }

   @After
    public void tearDown() throws InterruptedException {

        System.out.println("\nThis is coming from Hooks, after Scenario");
        BrowserUtils.wait(3);
        Driver.close();
    }

   // @After("@sales_manager")
    public void tearDownSalesManager(){
        System.out.println("\tThis is coming from after scenario for sales manager");
    }

}
