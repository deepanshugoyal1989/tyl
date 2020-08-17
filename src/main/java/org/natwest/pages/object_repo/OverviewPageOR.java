package org.natwest.pages.object_repo;

/**
 * Interface to serve as object repository to store Xpaths
 * of Web elements present on Overview Page.
 * All variables in it are public, static and final
 */
public interface OverviewPageOR {

    //It stores xpath for finish button on overview page
    String FINISH_BUTTON_XPATH = "//div[@class='summary_info']/div[@class='cart_footer']/a[contains(text(),'FINISH')]";

}
