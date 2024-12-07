package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ClaimPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class TestClaim extends DriverSetup {
    ClaimPage claimPage = new ClaimPage();
    HomePage homePage = new HomePage();

    @BeforeClass
    public void SetPrecondition()
    {

        claimPage.navigateToClaimPage("ehsanul", "$p1hr*Web*pAs5#");
    }
    @Test
    public void addClaim(){
      claimPage.clickOnElement(claimPage.ADD_CLAIM_BUTTON);
      claimPage.clickOnElement(claimPage.ADVANCE_DATE_OPTION);
      claimPage.clickOnElement(claimPage.DATE_OK_BUTTON);
      getApp().hideKeyboard();
      claimPage.writeOnElement(claimPage.ADVANCE_AMOUNT_INPUT, "50.0");
      claimPage.clickOnElement(claimPage.CLAIM_DATE_OPTION);
      claimPage.clickOnElement(claimPage.DATE_OK_BUTTON);
      getApp().hideKeyboard();
      claimPage.clickOnElement(claimPage.CLAIM_CATEGORY_OPTION);
      claimPage.clickOnElement(claimPage.CLAIM_CATEGORY_BANK);
      claimPage.writeOnElement(claimPage.CLAIM_AMOUNT_INPUT, "50.0");
      claimPage.clickOnElement(claimPage.FROM_DATE_OPTION);
      claimPage.clickOnElement(claimPage.DATE_OK_BUTTON);
      claimPage.clickOnElement(claimPage.TO_DATE_OPTION);
      claimPage.clickOnElement(claimPage.DATE_OK_BUTTON);
      claimPage.writeOnElement(claimPage.DESCRIPTION_INPUT, "Claim details added by appium");
      getApp().hideKeyboard();
      claimPage.clickOnElement(claimPage.ADD_BUTTON);
      claimPage.swipeUp();
      claimPage.clickOnElement(claimPage.CLAIM_SUBMIT_BUTTON);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
