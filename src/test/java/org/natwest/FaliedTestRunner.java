package org.natwest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/**
 * It runs only failed test cases to see if there is any flaky tests, that
 * could can pass in this run
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = {"org/natwest/hooks", "org/natwest/tests/step_definitions"},
        plugin = {
                "pretty",
                "json:target/cucumber-json-report/CucumberRerunReport.json",
                "html:target/cucumber-rerun-html-report/index.html",
        },
        monochrome = true,
        tags = "@sanity"
)
public class FaliedTestRunner {
}
