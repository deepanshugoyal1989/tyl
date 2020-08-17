package org.natwest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 *  It runs all the scenarios mentioned in feature file using cucumber, juit and
 *  selenium
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/natwest/tests/features",  // path to feature file
        glue = {"org/natwest/hooks", "org/natwest/tests/step_definitions"}, // path to step definitions
        plugin = {
                "pretty",
                "json:target/cucumber-json-report/CucumberReport.json",
                "html:target/cucumber-html-report/index.html",
                "rerun:target/rerun.txt"
        }, // generate reports in various format. Last plugin is used to re run failed test cases
        monochrome = true, // format readable output on console
        tags = "@sanity" //controls execution of feature, scenario and examples
)
public class TestRunner {
}