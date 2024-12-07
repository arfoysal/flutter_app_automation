package pages;

import org.openqa.selenium.By;

public class ClaimPage extends BasePage{

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    public By MY_CLAIMS_TAB = By.xpath("//android.view.View[@content-desc='My Claims']");
    public By CLAIM_REQUESTS_TAB = By.xpath("//android.view.View[@content-desc='Claim Requests']");
    public By ADD_CLAIM_BUTTON= By.xpath("(//android.widget.Button)[last()]");
    public By ADVANCE_DATE_OPTION = By.xpath("//android.view.View[@content-desc=\"Advance Amount\"]/following-sibling::android.view.View[1]");
    public By ADVANCE_AMOUNT_INPUT = By.xpath("//android.view.View[@content-desc=\"Advance Amount\"]/following-sibling::android.widget.EditText[1]");
    public By CLAIM_DATE_OPTION = By.xpath("//android.view.View[@content-desc=\"Claim Date*\"]/following-sibling::android.view.View[1]");
    public By DATE_OK_BUTTON = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    public By CLAIM_CATEGORY_OPTION = By.xpath("//android.view.View[@content-desc=\"Claim Category*\"]/following-sibling::android.widget.Button[1]");
    public By CLAIM_CATEGORY_BANK = By.xpath("//android.view.View[@content-desc=\"Bank\"]");
    public By CLAIM_SUBMIT_BUTTON= By.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    public By CLAIM_AMOUNT_INPUT =By.xpath("//android.view.View[@content-desc='Claim Amount*']/following-sibling::android.widget.EditText[1]");
    public By ADVANCE_AMOUNT_OPTION = By.xpath("//android.view.View[@content-desc=\"Advance Amount\"]/following-sibling::android.widget.EditText[1]");
    public By FROM_DATE_OPTION = By.xpath("//android.view.View[@content-desc=\"To Date*\"]/following-sibling::android.view.View[1]");
    public By TO_DATE_OPTION = By.xpath("//android.view.View[@content-desc=\"To Date*\"]/following-sibling::android.view.View[2]");
    public By DESCRIPTION_INPUT = By.xpath("//android.view.View[@content-desc=\"Description*\"]/following-sibling::android.widget.EditText[1]");
    public By ADD_BUTTON = By.xpath("//android.widget.Button[@content-desc=\"Add\"]");

    public void navigateToClaimPage(String username, String password){
        loginPage.doLogin(username, password);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.clickOnElement(homePage.CLAIM_BUTTON);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
