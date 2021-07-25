package appObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage extends BasePage {

    @AndroidFindBy(id = "org.isoron.uhabits:id/description")
    AndroidElement welcomeDescription;

    @AndroidFindBy(id = "org.isoron.uhabits:id/title")
    AndroidElement title;

    @AndroidFindBy(id = "org.isoron.uhabits:id/skip")
    AndroidElement skipButton;

    @AndroidFindBy(id = "org.isoron.uhabits:id/next")
    AndroidElement nextButton;

    @AndroidFindBy(id = "org.isoron.uhabits:id/done")
    AndroidElement doneButton;

    public WelcomePage(AndroidDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public boolean isWelcomePageDisplayed(String text) {
        wait.until(ExpectedConditions.visibilityOf(welcomeDescription));
       // System.out.print(welcomeDescription.getText());
        return welcomeDescription.getText().equals(text);
    }

    public MainHabitsPage goToMainHabitsPage() {
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
        nextButton.click();
        doneButton.click();
        return new MainHabitsPage(driver,wait);
    }


}
