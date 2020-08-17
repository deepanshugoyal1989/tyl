package org.natwest.tests.step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.natwest.hooks.TestBaseHooks;
import org.natwest.pages.FinishPage;
import org.natwest.pages.OverviewPage;

/**
 * It contain all the Then statements of feature file.
 */
public class THEN {

    /**
     * It asserts that order is successfully placed by comparing
     * order completion message on finish page.
     */
    @Then("user should be able to successfully place the purchase order with message {string}")
    public void userShouldBeAbleToSuccessfullyPlaceThePurchaseOrderWithMessage(String expectedMessage) {

        OverviewPage overviewPage =new OverviewPage(TestBaseHooks.getDriver());
        FinishPage finishPage = new FinishPage(TestBaseHooks.getDriver());
        overviewPage.clickFinishButton();
        String actualMessage = finishPage.getSuccessfulOrderMessage();
        Assert.assertEquals(expectedMessage.trim().toLowerCase(),actualMessage.trim().toLowerCase());

    }
}
