package org.natwest.pages.object_repo;

/**
 * Interface to serve as object repository to store Xpaths
 * of Web elements present on YourCart Page.
 * All variables in it are public, static and final
 */
public interface YourCartPageOR {

    //It stores xpath for checkout button on your cart page
    String CHECKOUT_BUTTON_XPATH = "//div[@id='cart_contents_container']//div[@class='cart_footer']/a[contains(@class,'checkout_button')]";

}
