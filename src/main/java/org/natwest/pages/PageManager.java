package org.natwest.pages;

import org.openqa.selenium.WebDriver;

public class PageManager {

    private final WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private YourCartPage yourCartPage;
    private OverviewPage overviewPage;
    private YourInformationPage yourInformationPage;
    private FinishPage finishPage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPage getLoginPage() {
        return (loginPage==null)?loginPage=new LoginPage(driver):loginPage;
    }

    public ProductsPage getProductsPage() {
        return (productsPage==null)?productsPage=new ProductsPage(driver):productsPage;
    }

    public YourCartPage getYourCartPage() {
        return (yourCartPage==null)?yourCartPage=new YourCartPage(driver):yourCartPage;
    }

    public OverviewPage getOverviewPage() {
        return (overviewPage==null)?overviewPage=new OverviewPage(driver):overviewPage;
    }

    public YourInformationPage getYourInformationPage() {
        return (yourInformationPage==null)?yourInformationPage=new YourInformationPage(driver):yourInformationPage;
    }

    public FinishPage getFinishPage() {
        return (finishPage==null)?finishPage=new FinishPage(driver):finishPage;
    }
}
