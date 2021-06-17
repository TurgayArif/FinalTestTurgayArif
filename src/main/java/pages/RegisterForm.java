package pages;


import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class RegisterForm  {

    protected static final By FIRST_NAME_INPUT_FIELD = By.id("input-firstname");
    protected static final By LAST_NAME_INPUT_FIELD = By.id("input-lastname");
    protected static final By EMAIL_INPUT_FIELD = By.id("input-email");
    protected static final By PHONE_INPUT_FIELD = By.id("input-telephone");
    protected static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    protected static final By PASSWORD_CONFIRM_INPUT_FIELD = By.id("input-confirm");
    protected static final By POLICY_CHECKBOX = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
    protected static final By CONTINUE_BUTTON = By.cssSelector("input.btn.btn-primary");
    protected static final By VERIFY_CONTINUE_BUTTON = By.cssSelector("#content > div > div > a");
    protected static final By DASHBOARD_HEADER = By.cssSelector("#content > h1");
    protected static final String password = "123qwe";

    public static void registerNewCustomer() {
        Browser.driver.findElement(FIRST_NAME_INPUT_FIELD).sendKeys("Turgay");
        Browser.driver.findElement(LAST_NAME_INPUT_FIELD).sendKeys("Arif");
        Browser.driver.findElement(EMAIL_INPUT_FIELD).sendKeys("TurgayArif@turgay.bg");
        Browser.driver.findElement(PHONE_INPUT_FIELD).sendKeys("0888999333");
        Browser.driver.findElement(PASSWORD_INPUT_FIELD).sendKeys(password);
        Browser.driver.findElement(PASSWORD_CONFIRM_INPUT_FIELD).sendKeys(password);
        Browser.driver.findElement(POLICY_CHECKBOX).click();
        Browser.driver.findElement(CONTINUE_BUTTON).click();
    }

    public static void verifySuccessfulCreateOfNewCustomer() {
        Browser.waitVisibilityOfElementFiveSeconds(VERIFY_CONTINUE_BUTTON);
        String actualDashboardHeaderText = Browser.driver.findElement(DASHBOARD_HEADER).getText();
        Assert.assertEquals(actualDashboardHeaderText, "Your Account Has Been Created!");
    }


}
