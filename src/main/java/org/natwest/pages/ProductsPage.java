package org.natwest.pages;

import org.natwest.pages.object_repo.ProductsPageOR;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * It represents Products Page and identified all web elements on Products page
 * using Page Factory and its functions represent actions that can be performed
 * on Products page web elements
 * @extends BasePage
 */
public class ProductsPage extends BasePage {


    // using Page Factory to initialize web elements
    @FindBy(xpath = ProductsPageOR.PRODUCT_SORT_DROPDOWN_XPATH)
    private WebElement productSortDropDown;

    @FindBy(xpath = ProductsPageOR.COSTLIEST_PRODUCT_BUTTON_XPATH)
    private WebElement costliestProductButton;

    @FindBy(xpath = ProductsPageOR.CHEAPEST_PRODUCT_BUTTON_XPATH)
    private WebElement cheapestProductButton;

    @FindBy(xpath = ProductsPageOR.CHECKOUT_TROLLEY_LINK_XPATH)
    private WebElement checkoutTrolleyLink;

    /**
     * Constructor to call BasePage constructor to initialize
     * products page web elements with web driver using Page Factory.
     * @param driver WebDriver instance
     */
     ProductsPage(WebDriver driver) {
        super(driver);

    }

    /**
     * It sorts products by price (high to low)
     * @return Object of products page
     */
    public ProductsPage sortProductsByPriceHighToLow() {
        selectFromDropDownByValue(productSortDropDown,"hilo");
        log.info("Products are sorted by price (high to low)");
        return this;
    }

    /**
     * It sorts products by price (low to high)
     * @return Object of products page
     */
    public ProductsPage sortProductsByPriceLowToHigh() {
        selectFromDropDownByValue(productSortDropDown,"lohi");
        log.info("Products are sorted by price (low to high)");
        return this;
    }

    /**
     * It sorts products by name (A to Z)
     * @return Object of products page
     */
    public ProductsPage sortProductsByNameAToZ() {
        selectFromDropDownByValue(productSortDropDown,"az");
        log.info("Products are sorted by name (A to Z)");
        return this;
    }

    /**
     * It sorts products by name (Z to A)
     * @return Object of products page
     */
    public ProductsPage sortProductsByNameZToA() {
        selectFromDropDownByValue(productSortDropDown,"za");
        log.info("Products are sorted by name (Z to A)");
        return this;
    }

    /**
     * It adds costliest product in the cart
     * @return Object of products page
     */
    public ProductsPage addCostliestProductToCart() {
        clickButton(costliestProductButton);
        log.info("Add costliest product in cart");
        return this;
    }

    /**
     * It adds cheapest product in the cart
     * @return Object of products page
     */
    public ProductsPage addCheapestProductToCart() {
        clickButton(cheapestProductButton);
        log.info("Add cheapest product in cart");
        return this;
    }

    /**
     * It clicks on checkout trolley icon
     * @return Object of products page
     */
    public ProductsPage clickOnCheckoutTrolleyLink() {
        clickLink(checkoutTrolleyLink);
        log.info("Click on checkout trolley icon");
        return this;
    }

    /**
     * @return title of products page
     */
    public String getProductsPageTitle() {
        log.info("Returning title of Products Page");
        return getTitle();
    }
}
