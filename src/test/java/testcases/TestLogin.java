package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class TestLogin extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @BeforeMethod
    public void preCondition(){
        if(loginPage.displayStatus(loginPage.ALLOW_BUTTON)){
            loginPage.clickOnElement(loginPage.ALLOW_BUTTON);
            loginPage.writeOnElement(loginPage.TYPE_SUBDOMAIN_INPUT, "viva");
            loginPage.clickOnElement(loginPage.GO_TO_LOGIN_BUTTON);
        }

    }

    @Test
    public void testLogin() throws InterruptedException {

        loginPage.writeOnElement(loginPage.USERNAME_INPUT,"ehsanul");
        loginPage.writeOnElement(loginPage.PASSWORD_INPUT,"$p1hr*Web*pAs5#");
        loginPage.clickOnElement(loginPage.GO_TO_DASHBOARD_BUTTON);
        Assert.assertTrue(homePage.displayStatus(homePage.GREETINGS_TEXT));
    }

    @Test
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        loginPage.writeOnElement(loginPage.USERNAME_INPUT,"ehsanul");
        loginPage.writeOnElement(loginPage.PASSWORD_INPUT,"$p1hr*Web*");
        loginPage.clickOnElement(loginPage.GO_TO_DASHBOARD_BUTTON);
        Assert.assertTrue(loginPage.displayStatus(loginPage.WRONG_PASSWORD_TEXT));
    }

    @AfterMethod
    public void logout() throws InterruptedException {
        if (homePage.displayStatus(homePage.GREETINGS_TEXT)){
            homePage.doLogout();
        }
    }
}
