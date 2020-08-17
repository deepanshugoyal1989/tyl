package org.natwest.pages;

import org.natwest.pages.object_repo.FinishPageOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It represents finish Page and identified all web elements on finish page
 * using Page Factory and its functions represent actions that can be performed
 * on finish page web elements
 * @extends BasePage
 * @implements FinishPageOR
 */
public class FinishPage extends BasePage implements FinishPageOR {

    //It finds web element for message that confirms successful order using Page Factory.
    @FindBy(xpath = FinishPageOR.SUCCESSFUL_ORDER_MESSAGE_XPATH)
    WebElement successfulOrderMessage;

    /**
     * Constructor to call BasePage constructor to initialize
     * finish page web elements with web driver using Page Factory.
     * @param driver WebDriver instance
     */
    public FinishPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Function to get text for message web element on finish page
     * @return message that confirms successful order
     */
    public String getSuccessfulOrderMessage() {
        log.info("Returning text for order");
        return getWebElementText(successfulOrderMessage);
    }

    /**
     * @return title of finish page
     */
    public String getFinishPageTitle() {
        log.info("Returning title of Finish Page");
        return getTitle();
    }

}
