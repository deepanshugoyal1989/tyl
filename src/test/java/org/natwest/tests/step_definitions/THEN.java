package org.natwest.tests.step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.natwest.context.TestContext;
import org.natwest.pages.FinishPage;
import org.natwest.pages.OverviewPage;

/**
 * It contain all the Then statements of feature file.
 */
public class THEN {


    private TestContext testContext;
    private final OverviewPage overviewPage;
    private final FinishPage finishPage;

    public THEN(TestContext testContext) {
        this.testContext = testContext;
        overviewPage = testContext.getPageManager().getOverviewPage();
        finishPage = testContext.getPageManager().getFinishPage();
    }

    /**
     * It asserts that order is successfully placed by comparing
     * order completion message on finish page.
     */
    @Then("user should be able to successfully place the purchase order with message {string}")
    public void userShouldBeAbleToSuccessfullyPlaceThePurchaseOrderWithMessage(String expectedMessage) {

       // OverviewPage overviewPage =new OverviewPage(TestBase.getDriver());
        // FinishPage finishPage = new FinishPage(TestBase.getDriver());
        overviewPage.clickFinishButton();
        String actualMessage = finishPage.getSuccessfulOrderMessage();
        Assert.assertEquals(expectedMessage.trim().toLowerCase(),actualMessage.trim().toLowerCase());

    }
}
