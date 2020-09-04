package org.natwest.tests.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.natwest.context.TestContext;
import org.natwest.pages.ProductsPage;
import org.natwest.pages.YourCartPage;
import org.natwest.pages.YourInformationPage;

/**
 * It contain all the When statements of feature file.
 */
public class WHEN {

    private TestContext testContext;
    private ProductsPage productsPage;
    private YourCartPage yourCartPage;
    private YourInformationPage yourInformationPage;

    public WHEN(TestContext testContext) {
        this.testContext = testContext;
        productsPage = testContext.getPageManager().getProductsPage();
        yourCartPage = testContext.getPageManager().getYourCartPage();
        yourInformationPage = testContext.getPageManager().getYourInformationPage();
    }

    /**
     * It sorts products by price.
     * It add costliest and cheapest products in cart and then checkout.
     */
    @When("user select the costliest and cheapest products")
    public void userSelectTheCostliestAndCheapestProducts() {

       // ProductsPage productsPage = new ProductsPage(TestBase.getDriver());
        productsPage
                .sortProductsByPriceHighToLow()
                .addCostliestProductToCart()
                .addCheapestProductToCart()
                .clickOnCheckoutTrolleyLink();

    }

    /**
     * It enters information of buyer
     * @param firstName first name of buyer
     * @param lastName last name of buyer
     * @param zipCode zip code of buyer
     */
    @And("user provide with valid firstname {string} lastname {string} and zipcode {string}")
    public void userProvideWithValidFirstnameLastnameAndZipcode(String firstName, String lastName, String zipCode) {

      //  YourCartPage yourCartPage = new YourCartPage(TestBase.getDriver());
      //  YourInformationPage yourInformationPage = new YourInformationPage(TestBase.getDriver());

        yourCartPage
                .clickOnCheckoutButton();
        yourInformationPage
                .setFirstName(firstName)
                .setlastName(lastName)
                .setZipCode(zipCode)
                .clickOnContinueButton();

    }
}
