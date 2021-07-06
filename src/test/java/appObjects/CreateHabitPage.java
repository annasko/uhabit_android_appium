package appObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateHabitPage extends BasePage{

    @AndroidFindBy(id = "org.isoron.uhabits:id/buttonSave")
    AndroidElement saveButton;

    @AndroidFindBy(id = "org.isoron.uhabits:id/colorButton")
    AndroidElement colorButton;

    @AndroidFindBy(id = "org.isoron.uhabits:id/nameInput")
    AndroidElement nameInput;

    @AndroidFindBy(id = "org.isoron.uhabits:id/questionInput")
    AndroidElement questionInput;

    @AndroidFindBy(id ="org.isoron.uhabits:id/unitInput")
    AndroidElement unitInput;

    @AndroidFindBy(id = "org.isoron.uhabits:id/targetInput")
    AndroidElement targetInput;

    @AndroidFindBy(id = "org.isoron.uhabits:id/notesInput")
    AndroidElement notesInput;

    @AndroidFindBy(id = "org.isoron.uhabits:id/numericalFrequencyPicker")
    AndroidElement numericalFrequencyPicker;

    @AndroidFindBy(id = "org.isoron.uhabits:id/reminderTimePicker")
    AndroidElement reminderTimePicker;

    @AndroidFindBy(id = "org.isoron.uhabits:id/boolean_frequency_picker")
    AndroidElement booleanFrequencyPicker;

    public CreateHabitPage(AndroidDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void fillInAllFields(String name){
        wait.until(ExpectedConditions.visibilityOf(nameInput));
        nameInput.click();
        nameInput.sendKeys(name);

    }
}
