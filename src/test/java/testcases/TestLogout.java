package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class TestLogout extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @BeforeClass
    public void SetPrecondition()
    {

        loginPage.doLogin("ehsanul", "$p1hr*Web*pAs5#");
    }
    @Test
    public void testLogout(){
        homePage.clickOnElement(homePage.MENU);
        homePage.clickOnElement(homePage.LOGOUT_BUTTON);
        Assert.assertTrue(loginPage.displayStatus(loginPage.LOGIN_MODAL));
        Assert.assertFalse(homePage.displayStatus(homePage.LOGOUT_BUTTON));
        Assert.assertFalse(homePage.displayStatus(homePage.GREETINGS_TEXT));
    }

}
