package org.natwest.pages;

import org.natwest.pages.object_repo.LoginPageOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It represents login Page and identified all web elements on login page
 * using Page Factory and its functions represent actions that can be performed
 * on login page web elements
 * @extends BasePage
 * @implements LoginPageOR
 */
public class LoginPage extends BasePage implements LoginPageOR {

    // using Page Factory to initialize web elements
    @FindBy(xpath = LoginPageOR.USERNAME_TEXT_BOX_XPATH)
    private WebElement usernameTextBox;

    @FindBy(xpath = LoginPageOR.PASSWORD_TEXT_BOX_XPATH)
    private WebElement passwordTextBox;

    @FindBy(xpath = LoginPageOR.LOGIN_BUTTON_XPATH)
    private WebElement loginButton;

    /**
     * Constructor to call BasePage constructor to initialize
     * login page web elements with web driver using Page Factory.
     * @param driver WebDriver instance
     */
    public LoginPage(WebDriver driver){
        super(driver);

    }

    /**
     * Function to write username in text box on login page
     * @param username login user name
     * @return login page object
     */
    public LoginPage setUserName(String username) {
        writeToTextBox(usernameTextBox,username);
        log.info("Username: "+username+" is written in username text box on login page");
        return this;
    }

    /**
     * Function to write password in text box on login page
     * @param password  login password
     * @return login page object
     */
    public LoginPage setPassword(String password) {
        writeToTextBox(passwordTextBox,password);
        log.info("Password is written in password text box on login page");
        return this;
    }

    /**
     * Function to click on login button on login page
     * @return login page object
     */
    public LoginPage clickLoginButton() {
        clickButton(loginButton);
        log.info("Password is written in password text box on login page");
        return this;
    }

    /**
     * @return title of login page
     */
    public String getLoginPageTitle() {
        log.info("Returning title of Login Page");
        return getTitle();
    }


}
