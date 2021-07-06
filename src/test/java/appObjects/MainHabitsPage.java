package appObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainHabitsPage extends BasePage{

    @AndroidFindBy (id = "org.isoron.uhabits:id/actionCreateHabit")
    AndroidElement addHabitButton;

    @AndroidFindBy(id = "org.isoron.uhabits:id/action_filter")
    AndroidElement filterButton;

    @AndroidFindBy(id = "More options")
    AndroidElement moreOptionsButton;

    @AndroidFindBy(id = "org.isoron.uhabits:id/buttonYesNo")
    AndroidElement yesNoButton;

    @AndroidFindBy(id = "org.isoron.uhabits:id/buttonMeasurable")
    AndroidElement measurableButton;

    public MainHabitsPage(AndroidDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public CreateHabitPage goToCreateHabitPage () {
        wait.until(ExpectedConditions.elementToBeClickable(addHabitButton));
        addHabitButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(moreOptionsButton));
        moreOptionsButton.click();
        return new CreateHabitPage(driver,wait);
    }

}
