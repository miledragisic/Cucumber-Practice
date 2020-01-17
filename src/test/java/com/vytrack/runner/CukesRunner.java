package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json", // it is cucumber plugin used for reporting purposes
        "html:target/default-cucumber-reports", // place where to save the report
        "rerun:target/rerun.txt"}, // it will remember only the failed tests

        features = "src/test/resources/features",

        glue = "com/vytrack/step_definitions",

        dryRun = false,

        tags = "@wip"


)

public class CukesRunner {

}
