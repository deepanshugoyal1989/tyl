package org.natwest.pages.object_repo;

/**
 * Interface to serve as object repository to store Xpaths
 * of Web elements present on Products Page.
 * All variables in it are public, static and final
 */
public interface ProductsPageOR {

    //It stores xpath for product sort drop down on products page
    String PRODUCT_SORT_DROPDOWN_XPATH = "//div[@id='inventory_filter_container']/select";

    //It stores xpath of costliest product on products page
    String COSTLIEST_PRODUCT_BUTTON_XPATH = "//div[@id='inventory_container']/child::div[@class='inventory_list']/div[position()=1]/div[@class='pricebar']/button";

    //It stores xpath of cheapest product on products page
    String CHEAPEST_PRODUCT_BUTTON_XPATH = "//div[@id='inventory_container']/child::div[@class='inventory_list']/div[last()]/div[@class='pricebar']/button";

    //It stores xpath of checkout trolley icon on products page
    String CHECKOUT_TROLLEY_LINK_XPATH = "//div[@id='shopping_cart_container']/a/node()";

}
