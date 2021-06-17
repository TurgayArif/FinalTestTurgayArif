package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    public static WebDriver driver;

    public static void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lando\\OneDrive\\Работен плот\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public static void tearDown() {
        driver.quit();
    }

    public static void waitVisibilityOfElementFiveSeconds(By locator) {
        WebDriverWait waitFiveSeconds = new WebDriverWait(driver, 10);
        waitFiveSeconds.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }


}
