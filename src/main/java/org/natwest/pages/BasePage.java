package org.natwest.pages;

import org.natwest.utils.Constants;
import org.natwest.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * It is base class which contains functions as actions that
 * can be performed on any web page.
 */
public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;
    protected Log log = new Log(BasePage.class);

    /**
     * Constructor to initialize driver with elements
     * found on a web page using Page Factory.
     * Ajax Element Locator is used to have lazy initialization of web elements
     * Explicit wait is also initialized to be used later.
     * @param driver WebDriver Instance
     */
     BasePage(WebDriver driver) {
        log.info("Base Page Constructor is called from class: "+ Thread.currentThread().getStackTrace()[2].getClassName());
        try{
            this.driver = driver;
            wait = new WebDriverWait(driver, Constants.TIMEOUT_IN_SECONDS, Constants.POLLING_AFTER_EVERY_MILLISECONDS);
            PageFactory.initElements(new AjaxElementLocatorFactory(driver, Constants.TIMEOUT_IN_SECONDS), this);
            log.info(Thread.currentThread().getStackTrace()[2].getClassName()+" web elements are initialized" +
                    " with Web Driver using Page Factory");
        } catch (Exception e){
            log.error("Error occurred while initializing elements for class "+Thread.currentThread().getStackTrace()[2].getClassName()
                    +" with web driver "+e.getMessage());
            log.error("Class : "+Thread.currentThread().getStackTrace()[2].getClassName());
            log.error("Method : "+Thread.currentThread().getStackTrace()[2].getMethodName());
            log.error("Line Number : "+Thread.currentThread().getStackTrace()[2].getLineNumber());
            throw new RuntimeException();
        }
    }

    /**
     * Explicit wait for web element to be visible on web page
     * @param webElement WebElement on which explicit wait is applied
     */
    protected void waitForElementToAppear(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));

    }

    /**
     * Function to click on any web element found on web page
     * @param element Clickable WebElement
     */
    private void clickObject(WebElement element) {
        try{
            element.click();
        } catch (Exception e){
            log.error("Error occurred while clicking on  web element "+e.getMessage());
            log.error("Class : "+Thread.currentThread().getStackTrace()[2].getClassName());
            log.error("Method : "+Thread.currentThread().getStackTrace()[2].getMethodName());
            log.error("Line Number : "+Thread.currentThread().getStackTrace()[2].getLineNumber());
            throw new RuntimeException();
        }
    }

    /**
     * Function to click on button found on web page
     * @param buttonWebElement Button WebElement
     */
    protected void clickButton(WebElement buttonWebElement) {
        clickObject(buttonWebElement);
    }

    /**
     * Function to click on radio button found on web page
     * @param radioButtonWebElement Radio Button WebElement
     */
    protected void clickRadioButton(WebElement radioButtonWebElement) {
        clickObject(radioButtonWebElement);
    }

    /**
     * Function to click on link found on web page
     * @param linkWebElement Link WebElement
     */
    protected void clickLink(WebElement linkWebElement) {
        clickObject(linkWebElement);
    }

    /**
     * Function to write a text in text box web element on web page
     * @param textBoxWebElement Text box WebElement
     * @param txt String to be written in text box
     */
    protected void writeToTextBox(WebElement textBoxWebElement, String txt) {
        try{
            textBoxWebElement.sendKeys(txt);
        } catch (Exception e) {
            log.error("Error occurred while writing text to a web element : "+e.getMessage());
            log.error("Class : "+Thread.currentThread().getStackTrace()[2].getClassName());
            log.error("Method : "+Thread.currentThread().getStackTrace()[2].getMethodName());
            log.error("Line Number : "+Thread.currentThread().getStackTrace()[2].getLineNumber());
            throw new RuntimeException();
        }

    }

    /**
     * Function to select an item from drop down based on its position in the list
     * @param dropdownWebElement Drop down WebElement
     * @param index Position, starting with zero
     */
    protected void selectFromDropDownByIndex(WebElement dropdownWebElement, int index) {
        try{
            Select dropdown = new Select(dropdownWebElement);
            dropdown.selectByIndex(index);
        } catch (Exception e) {
            log.error("Error occurred while selecting drop down index from web element "+e.getMessage());
            log.error("Class : "+Thread.currentThread().getStackTrace()[2].getClassName());
            log.error("Method : "+Thread.currentThread().getStackTrace()[2].getMethodName());
            log.error("Line Number : "+Thread.currentThread().getStackTrace()[2].getLineNumber());
            throw new RuntimeException();
        }


    }

    /**
     * Function to select an item from drop down based on visible text
     * @param dropdownWebElement Drop down WebElement
     * @param visibleText text visible in drop down
     */
    protected void selectFromDropDownByVisibleText(WebElement dropdownWebElement, String visibleText) {
       try{
           Select dropdown = new Select(dropdownWebElement);
           dropdown.selectByVisibleText(visibleText);
       } catch (Exception e) {
           log.error("Error occurred while selecting drop down visible text from web element "+e.getMessage());
           log.error("Class : "+Thread.currentThread().getStackTrace()[2].getClassName());
           log.error("Method : "+Thread.currentThread().getStackTrace()[2].getMethodName());
           log.error("Line Number : "+Thread.currentThread().getStackTrace()[2].getLineNumber());
           throw new RuntimeException();
       }

    }

    /**
     * Function to select an item from drop down based on value of a web element
     * @param dropdownWebElement Drop down WebElement
     * @param value value of a drop down web element
     */
    protected void selectFromDropDownByValue(WebElement dropdownWebElement, String value) {
       try{
           Select dropdown = new Select(dropdownWebElement);
           dropdown.selectByValue(value);
       } catch (Exception e) {
           log.error("Error occurred while selecting drop down value from web element "+e.getMessage());
           log.error("Class : "+Thread.currentThread().getStackTrace()[2].getClassName());
           log.error("Method : "+Thread.currentThread().getStackTrace()[2].getMethodName());
           log.error("Line Number : "+Thread.currentThread().getStackTrace()[2].getLineNumber());
           throw new RuntimeException();
       }

    }

    /**
     * Function to get text of a web element
     * @param element
     * @return
     */
    protected String getWebElementText(WebElement element) {
        try{
            return element.getText();
        } catch (Exception e) {
            log.error("Error while getting text for web element"+e.getMessage());
            log.error("Class : "+Thread.currentThread().getStackTrace()[2].getClassName());
            log.error("Method : "+Thread.currentThread().getStackTrace()[2].getMethodName());
            log.error("Line Number : "+Thread.currentThread().getStackTrace()[2].getLineNumber());
            throw new RuntimeException();
        }

    }

    /**
     * Function to perform hover action on main element and click on sub element
     * using Actions class
     * @param mainElement Web element representing main menu
     * @param subElement Web Element representing sub menu element
     */
    protected void hoverOnMainWebElementAndClickSubWebElement(WebElement mainElement, WebElement subElement) {
        try{
            Actions action = new Actions(driver);
            action.moveToElement(mainElement).perform();
            waitForElementToAppear(subElement);
            action.moveToElement(subElement).click().perform();
        } catch (Exception e) {
            log.error("Error while performing hover on main web element and click action on sub web element"+e.getMessage());
            log.error("Class : "+Thread.currentThread().getStackTrace()[2].getClassName());
            log.error("Method : "+Thread.currentThread().getStackTrace()[2].getMethodName());
            log.error("Line Number : "+Thread.currentThread().getStackTrace()[2].getLineNumber());
            throw new RuntimeException();
        }
    }

    /**
     * Function to get title of a page
     * @return
     */
    protected String getTitle() {
        try{
            return driver.getTitle();
        } catch (Exception e) {
            log.error("Error while getting title of the page"+e.getMessage());
            log.error("Class : "+Thread.currentThread().getStackTrace()[2].getClassName());
            log.error("Method : "+Thread.currentThread().getStackTrace()[2].getMethodName());
            log.error("Line Number : "+Thread.currentThread().getStackTrace()[2].getLineNumber());
            throw new RuntimeException();
        }

    }

}
