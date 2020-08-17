package org.natwest.tests.step_definitions;

import io.cucumber.java.en.Given;
import org.natwest.hooks.TestBaseHooks;
import org.natwest.pages.LoginPage;

/**
 * It contain all the Given statements of feature file.
 */
public class GIVEN {


    /**
     * It enters login credentials on login page and clicks on continue button.
     * @param username login credential
     * @param password login credential
     */
    @Given("user enters valid username {string} and password {string} on loginPage")
    public void userEntersValidUsernameAndPasswordOnLoginPage(String username, String password) {
        LoginPage loginPage = new LoginPage(TestBaseHooks.getDriver());
        loginPage
                .setUserName(username)
                .setPassword(password)
                .clickLoginButton();

    }

}
