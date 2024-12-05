package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginScreen;
import utilities.DriverSetup;

public class TestAttendance extends DriverSetup {
    LoginScreen loginScreen = new LoginScreen();
    HomePage homePage = new HomePage();
    @BeforeClass
    public void SetPrecondition()
    {
        loginScreen.doLogin("ehsanul", "$p1hr*Web*pAs5#");
    }

    @Test
    public void testAddAttendance() throws InterruptedException {
        homePage.clickOnElement(homePage.IN_TIME);
        homePage.clickOnElement(homePage.WHILE_USING_THE_APP);
        homePage.writeOnElement(homePage.REMARKS_ATTENDENCE,"Attendance from Appium");
        homePage.clickOnElement(homePage.SUBMIT_BUTTON_ATTENDANCE);
        Thread.sleep(5000);

    }
}
