package org.natwest.pages.object_repo;

/**
 * Interface to serve as object repository to store Xpaths
 * of Web elements present on Finish Page.
 * All variables in it are public, static and final
 */
public interface FinishPageOR {

    //It stores xpath of message element that confirms order is successfully placed
    String SUCCESSFUL_ORDER_MESSAGE_XPATH = "//div[@id='checkout_complete_container']/h2";

}
