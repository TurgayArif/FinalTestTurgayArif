package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;

public abstract class BaseTest {

    @BeforeMethod
    public static void setupBrowser() {
        Browser.setup();
    }

    @AfterMethod
    public static void quitBrowser() {
        Browser.tearDown();
    }

}
