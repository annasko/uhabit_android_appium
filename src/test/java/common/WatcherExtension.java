package common;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WatcherExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private AndroidDriver driver;

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        Method testMethod = extensionContext.getRequiredTestMethod();
        Boolean testFailed = extensionContext.getExecutionException().isPresent();
        if (testFailed) {
            takeScreenShot(testMethod.getName());
        }
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {

    }


    public void takeScreenShot(String testName) throws IOException {
        String folder_name = "screenshots";
        File srcFile = driver.getScreenshotAs(OutputType.FILE);
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy__hh_mm");
        new File(folder_name).mkdir();
        String file_name = testName + "_" + dateFormat.format(new Date()) + ".png";
        FileUtils.copyFile(srcFile, new File(folder_name + "/" + file_name));
    }

    public void setCurrentDriver(AndroidDriver driver) {
        this.driver = driver;
    }
}
