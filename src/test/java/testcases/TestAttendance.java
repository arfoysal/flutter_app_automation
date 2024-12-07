package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class TestAttendance extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @BeforeMethod
    public void SetPrecondition()
    {
        loginPage.doLogin("ehsanul", "$p1hr*Web*pAs5#");
    }

    @Test
    public void testAddAttendanceInTime() throws InterruptedException {
        homePage.clickOnElement(homePage.IN_TIME);
        homePage.clickOnElement(homePage.WHILE_USING_THE_APP);
        homePage.writeOnElement(homePage.REMARKS_ATTENDANCE,"In-Time from Appium");
        homePage.clickOnElement(homePage.SUBMIT_BUTTON_ATTENDANCE);
        Assert.assertTrue(homePage.displayStatus(homePage.ATTENDANCE_SUBMIT_SUCCESS_MODAL));
    }

    @Test
    public void testAddAttendanceOutTime() throws InterruptedException {
        homePage.clickOnElement(homePage.OUT_TIME);
        homePage.clickOnElement(homePage.WHILE_USING_THE_APP);
        homePage.writeOnElement(homePage.REMARKS_ATTENDANCE,"Out-Time from Appium");
        homePage.clickOnElement(homePage.SUBMIT_BUTTON_ATTENDANCE);
        Assert.assertTrue(homePage.displayStatus(homePage.ATTENDANCE_SUBMIT_SUCCESS_MODAL));
    }
}
