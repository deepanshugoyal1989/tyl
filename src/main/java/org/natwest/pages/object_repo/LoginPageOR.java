package org.natwest.pages.object_repo;

/**
 * Interface to serve as object repository to store Xpaths
 * of Web elements present on Login Page.
 * All variables in it are public, static and final
 */
public interface LoginPageOR {

    //It stores xpath of username text box on login page
    String USERNAME_TEXT_BOX_XPATH = "//input[@id='user-name']";

    //It stores xpath of password text box on login page
    String PASSWORD_TEXT_BOX_XPATH = "//input[@id='password']";

    //It stores xpath of login button on login page
    String LOGIN_BUTTON_XPATH = "//input[@type='submit' and contains(@id,'login-button')]";

}
