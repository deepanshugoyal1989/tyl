package org.natwest.pages;

import org.natwest.pages.object_repo.YourCartPageOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It represents Your Cart Page and identified all web elements on Your Cart page
 * using Page Factory and its functions represent actions that can be performed
 * on Your Cart page web elements
 * @extends BasePage
 */
public class YourCartPage extends BasePage {


    // using Page Factory to initialize web elements
    @FindBy(xpath = YourCartPageOR.CHECKOUT_BUTTON_XPATH)
    private WebElement checkoutButton;


    /**
     * Constructor to call BasePage constructor to initialize
     * your cart page web elements with web driver using Page Factory.
     * @param driver WebDriver instance
     */
     YourCartPage(WebDriver driver) {
        super(driver);

    }

    /**
     * It clicks on checkout button on your cart page.
     * @return Object of your cart page
     */
    public YourCartPage clickOnCheckoutButton(){
        clickButton(checkoutButton);
        log.info("Checkout button is clicked on Your Cart Page");
        return this;
    }

    /**
     * @return title of your cart page
     */
    public String getYourCartPageTitle() {
       return getTitle();
    }

}
