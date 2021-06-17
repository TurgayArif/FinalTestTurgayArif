package pages;

import core.BasePageCommands;
import org.openqa.selenium.By;
import utils.Browser;

public class MainPage extends BasePageCommands {

    private static String url = "http://shop.pragmatic.bg/";

    private static final By MY_ACCOUNT_BUTTON = By.cssSelector(".caret");
    private static final By REGISTER_BUTTON = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a");

    public static void goToUrl() {
        Browser.driver.get(url);
    }

    public static void clickRegisterButton() {

        Browser.driver.findElement(MY_ACCOUNT_BUTTON).click();
        Browser.waitVisibilityOfElementFiveSeconds(REGISTER_BUTTON);
        Browser.driver.findElement(REGISTER_BUTTON).click();
    }


}
