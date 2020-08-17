package org.natwest.pages;

import org.natwest.pages.object_repo.OverviewPageOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It represents overview Page and identified all web elements on overview page
 * using Page Factory and its functions represent actions that can be performed
 * on overview page web elements
 * @extends BasePage
 * @implements OverviewPageOR
 */
public class OverviewPage extends BasePage implements OverviewPageOR{


    // using Page Factory to initialize web elements
    @FindBy(xpath = OverviewPageOR.FINISH_BUTTON_XPATH)
    WebElement finishButton;

    /**
     * Constructor to call BasePage constructor to initialize
     * overview page web elements with web driver using Page Factory.
     * @param driver WebDriver instance
     */
    public OverviewPage(WebDriver driver){
        super(driver);

    }

    /**
     * It clicks on finish button on overview page
     * @return Object of overview page
     */
    public OverviewPage clickFinishButton() {
        clickButton(finishButton);
        log.info("Finish Button is clicked on overview page");
        return this;
    }

    /**
     * @return title of overview page
     */
    public String getOverviewPageTitle(){
        log.info("Returning title of Overview Page");
        return getTitle();
    }
}
