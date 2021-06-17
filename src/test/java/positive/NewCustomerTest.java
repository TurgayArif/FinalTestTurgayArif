package positive;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterForm;

public class NewCustomerTest extends BaseTest {

    @Test
    public void registerNewCustomerTest() {
        MainPage.goToUrl();
        MainPage.clickRegisterButton();
        RegisterForm.registerNewCustomer();
        RegisterForm.verifySuccessfulCreateOfNewCustomer();
    }
}
