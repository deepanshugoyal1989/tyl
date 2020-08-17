package org.natwest.pages.object_repo;

/**
 * Interface to serve as object repository to store Xpaths
 * of Web elements present on YourInformation Page.
 * All variables in it are public, static and final
 */
public interface YourInformationPageOR {

    // It stores xpath for first name text box on your information page
    String FIRSTNAME_TEXT_BOX_XPATH = "//div[@class='checkout_info']/input[@id='first-name']";

    // It stores xpath for last name text box on your information page
    String LASTNAME_TEXT_BOX_XPATH = "//div[@class='checkout_info']/input[@id='last-name']";

    // It stores xpath for zip code text box on your information page
    String ZIPCODE_TEXT_BOX_XPATH = "//div[@class='checkout_info']/input[@id='postal-code']";

    // It stores xpath for continue button on your information page
    String CONTINUE_BUTTON_XPATH = "//div[@class='checkout_buttons']/input[contains(@value,'CONTINUE')]";

}
