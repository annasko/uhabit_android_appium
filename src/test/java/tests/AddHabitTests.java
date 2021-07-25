package tests;

import appObjects.CreateHabitPage;
import appObjects.MainHabitsPage;
import appObjects.WelcomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddHabitTests extends BaseTest{


    @Test
    void shouldAddedHabitYesNo(){
        WelcomePage welcomePage = openWelcomePage();
        MainHabitsPage mainHabitsPage = welcomePage.goToMainHabitsPage();
        CreateHabitPage createHabitPage = mainHabitsPage.goToCreateHabitPageYesNo();
        createHabitPage.fillInAllFieldsYesNoHabit("Exercise", "Did you excercise today?", "5x per day");
        Assertions.assertTrue(mainHabitsPage.isHabitsAddedCorrectly());
    }

}
