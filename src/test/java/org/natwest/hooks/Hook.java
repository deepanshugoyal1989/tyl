package org.natwest.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.natwest.context.TestContext;
import org.natwest.tests.TestBase;

public class Hook {

    private TestContext testContext;
    private TestBase testBase;

    public Hook(TestContext testContext) {
        this.testContext = testContext;
        testBase = testContext.getTestBase();
    }

    @After
    public void closeBrowser(Scenario scenario) {
        testBase.tearDown(scenario);
    }
}
