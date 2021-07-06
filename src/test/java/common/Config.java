package common;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Config {
    public static String APPIUM_SERVER_URL = "http://localhost:4723/wd/hub";
    public static String APK_PATH = "resources/uhabits-android-debug.apk";

    public static DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "Android 11");
//        caps.setCapability("noReset", false);
//        caps.setCapability("fullReset", false);
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", APK_PATH);
        caps.setCapability("appPackage", "org.isoron.uhabits");
       // caps.setCapability("appActivity", "org.insoro.uhabits.activities.habits.list.ListHabitsActivity");
        caps.setCapability("appActivity", "org.isoron.uhabits.MainActivity");
        return caps;
    }

}
