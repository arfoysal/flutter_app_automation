package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginScreen;
import utilities.DriverSetup;

public class TestAttendance extends DriverSetup {
    LoginScreen loginScreen = new LoginScreen();
    @BeforeClass
    public void SetPrecondition()
    {
        loginScreen.doLogin("ehsanul", "$p1hr*Web*pAs5#");
    }

    @Test
    public void testAddAttendance(){

    }
}
