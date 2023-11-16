package Cucumber.Activity5_6;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepDefinitions"},
        tags = "@activity5",

// Activity6
        //pretty reports
        plugin = {"pretty"},
        monochrome = true,
        //HTML report
        plugin = {"html: test-reports"},
        //JSON report
        plugin = {"json: test-reports/json-report.json"}
)
public class ActivitiesRunner5 {}

