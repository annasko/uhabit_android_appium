package tests;

import appObjects.WelcomePage;
import common.Config;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    static AndroidDriver<MobileElement> driver;
    static WebDriverWait wait;

    @BeforeEach
    void setUp() throws MalformedURLException {
        driver = new AndroidDriver<MobileElement>(new URL(Config.APPIUM_SERVER_URL), Config.getDesiredCapabilities());
        wait = new WebDriverWait(driver, 5);
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        driver.quit();
    }

    protected WelcomePage openWelcomePage() {return new WelcomePage(driver,wait);}
}
