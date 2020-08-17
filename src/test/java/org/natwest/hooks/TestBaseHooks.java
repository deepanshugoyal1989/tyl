package org.natwest.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.natwest.utils.Constants;
import org.natwest.utils.Log;
import org.natwest.utils.ReadProperties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * It serves as Hooks as well Test Base class.
 * WebDriver is initialized here with given browser.
 * @Before and @After Hooks are used to set up and tear up browser after each scenario.
 */
public class TestBaseHooks {

    private static WebDriver driver;
    private final Log log = new Log(TestBaseHooks.class);

    /**
     * Cucumber @Before hook is used to set web driver and open application url in browser
     */
    @Before
    public void setUp() {

        try{
            ReadProperties readProperties = new ReadProperties();
            switch (readProperties.getProperty("BROWSER").toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", readProperties.getProperty("CHROME_DRIVER"));
                    driver = new ChromeDriver();
                    log.info("Driver is initialized with chrome");
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", readProperties.getProperty("FIREFOX_DRIVER"));
                    driver = new FirefoxDriver();
                    log.info("Driver is initialized with firefox");
                    break;
                default:
                    log.info("Invalid browser name is given");
                    throw new RuntimeException("Please give valid browser name -> chrome or firefox");

            }

            driver.get(readProperties.getProperty("APPLICATION_URL"));
            log.info("Application url: "+readProperties.getProperty("APPLICATION_URL")+" is opened in browser");
            driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
            log.info("Implicit wait of "+Constants.TIMEOUT_IN_SECONDS+" seconds are attached to the driver");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        } catch (Exception e){
            log.error("Error occured while initializing driver"+e.getMessage());
        }


    }

    /**
     * It closes all browser windows opened by web driver.
     * It also checks if there is a failed scenario, attaches screenshot to it.
     * @param scenario To check status of scenario
     */
    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
            log.info("Screenshot is attached to a failed scenario");
        }
        driver.quit();
        log.info("Browser is closed");
    }


    /**
     * @return WebDriver instance
     */
    public static WebDriver getDriver() {
        return driver;
    }

}
