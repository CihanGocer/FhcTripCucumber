package com.FhcTrip.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt",
                "html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features ="src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@first",
        dryRun = false
)

public class Runner {

}
