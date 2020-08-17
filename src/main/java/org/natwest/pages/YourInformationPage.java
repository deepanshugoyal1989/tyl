package org.natwest.pages;

import org.natwest.pages.object_repo.YourInformationPageOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It represents Your Information Page and identified all web elements on Your Information page
 * using Page Factory and its functions represent actions that can be performed
 * on Your Information page web elements
 * @extends BasePage
 * @implements YourInformationPageOR
 */
public class YourInformationPage extends BasePage implements YourInformationPageOR {

    // using Page Factory to initialize web elements
    @FindBy(xpath = YourInformationPageOR.FIRSTNAME_TEXT_BOX_XPATH)
    private WebElement firstNameTextBox;

    @FindBy(xpath = YourInformationPageOR.LASTNAME_TEXT_BOX_XPATH)
    private WebElement lastNameTextBox;

    @FindBy(xpath = YourInformationPageOR.ZIPCODE_TEXT_BOX_XPATH)
    private WebElement zipCodeTextBox;

    @FindBy(xpath = YourInformationPageOR.CONTINUE_BUTTON_XPATH)
    private WebElement continueButton;

    /**
     * Constructor to call BasePage constructor to initialize
     * your information page web elements with web driver using Page Factory.
     * @param driver WebDriver instance
     */
    public YourInformationPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Writes first name in first name text box on your information page
     * @param firstName
     * @return Object of your information page
     */
    public YourInformationPage setFirstName(String firstName) {
        writeToTextBox(firstNameTextBox,firstName);
        log.info("First name is written in first name text box on Your Information page");
        return this;
    }

    /**
     * Writes last name in last name text box on your information page
     * @param lastName
     * @return Object of your information page
     */
    public YourInformationPage setlastName(String lastName) {
        writeToTextBox(lastNameTextBox,lastName);
        log.info("Last name is written in last name text box on Your Information page");
        return this;
    }

    /**
     * Writes zip code in zip code text box on your information page
     * @param zipCode
     * @return Object of your information page
     */
    public YourInformationPage setZipCode(String zipCode) {
        writeToTextBox(zipCodeTextBox,zipCode);
        log.info("Zip code is written in zip code text box on Your Information page");
        return this;
    }

    /**
     * It clicks on continue button on your information page
     * @return Object of your information page
     */
    public YourInformationPage clickOnContinueButton(){
        clickButton(continueButton);
        log.info("Continue button is clicked on Your Information page");
        return this;
    }

    /**
     * @return Title of your information page
     */
    public String getYourInformationPageTitle() {
        log.info("Returning title of Your Information Page");
        return getTitle();
    }
}
