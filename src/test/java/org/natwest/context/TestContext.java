package org.natwest.context;


import org.natwest.tests.TestBase;
import org.natwest.pages.PageManager;

public class TestContext {

    private TestBase testBase;
    private PageManager pageManager;

    public TestContext() {
        testBase = new TestBase();
        pageManager = new PageManager(testBase.getDriver());
    }

    public TestBase getTestBase() {
        return testBase;
    }

    public PageManager getPageManager() {
        return pageManager;
    }
}
