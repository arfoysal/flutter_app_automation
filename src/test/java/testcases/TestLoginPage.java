package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginScreen;
import utilities.DriverSetup;

public class TestLoginPage extends DriverSetup {
    LoginScreen loginScreen = new LoginScreen();
    HomePage homePage = new HomePage();
    @Test
    public void testLogin() throws InterruptedException {
        loginScreen.clickOnElement(loginScreen.ALLOW_BUTTON);
        loginScreen.writeOnElement(loginScreen.TYPE_SUBDOMAIN_INPUT, "viva");
        loginScreen.clickOnElement(loginScreen.GO_TO_LOGIN_BUTTON);
        loginScreen.writeOnElement(loginScreen.USERNAME_INPUT,"ehsanul");
        loginScreen.writeOnElement(loginScreen.PASSWORD_INPUT,"$p1hr*Web*pAs5#");
        loginScreen.clickOnElement(loginScreen.GO_TO_DASHBOARD_BUTTON);
        Assert.assertTrue(homePage.displayStatus(homePage.GREETINGS_TEXT));
    }
}
