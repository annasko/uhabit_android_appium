package tests;

import appObjects.CreateHabitPage;
import appObjects.MainHabitsPage;
import appObjects.WelcomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddHabitTests extends BaseTest{



    @Test
    void shouldOpenHabitApp(){
        WelcomePage welcomePage = openWelcomePage();
        MainHabitsPage mainHabitsPage = welcomePage.goToMainHabitsPage();
        CreateHabitPage createHabitPage = mainHabitsPage.goToCreateHabitPage();
        createHabitPage.fillInAllFields("An");
        Assertions.assertTrue(welcomePage.isWelcomePageDisplayed("Loop Habit Tracker helps you create and maintain good habits."));

    }

}
