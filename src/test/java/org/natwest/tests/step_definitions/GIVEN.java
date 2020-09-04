package org.natwest.tests.step_definitions;

import io.cucumber.java.en.Given;
import org.natwest.context.TestContext;
import org.natwest.pages.LoginPage;

/**
 * It contain all the Given statements of feature file.
 */
public class GIVEN {

    private TestContext testContext;
    private LoginPage loginPage;

    public GIVEN(TestContext testContext) {
        this.testContext = testContext;
        loginPage = testContext.getPageManager().getLoginPage();
    }


    /**
     * It enters login credentials on login page and clicks on continue button.
     * @param username login credential
     * @param password login credential
     */
    @Given("user enters valid username {string} and password {string} on loginPage")
    public void userEntersValidUsernameAndPasswordOnLoginPage(String username, String password) {
       // LoginPage loginPage = new LoginPage(TestBase.getDriver());
        loginPage
                .setUserName(username)
                .setPassword(password)
                .clickLoginButton();

    }

}
