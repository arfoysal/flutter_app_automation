package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public By CLAIM_BUTTON = By.xpath("//android.widget.ImageView[@content-desc='Claim']");
    public By LEAVE_BUTTON = By.xpath("//android.widget.ImageView[@content-desc=\"Leave\n" +
            "Tab 3 of 5\"]");
    public By GREETINGS_TEXT = By.xpath("//android.view.View[@content-desc=\"Hi, Ehsanul Alam Sabbir!\n" +
            "Explore the dashboard\"]");
    public By IN_TIME = By.xpath("//android.widget.ImageView[@content-desc=\"In Time\"]\n");
    public By WHILE_USING_THE_APP = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    public By SUBMIT_BUTTON_ATTENDANCE_IN_TIME = By.xpath("//android.view.View[@content-desc='Submit']");
    public By SUBMIT_BUTTON_ATTENDANCE_OUT_TIME = By.xpath("//android.view.View[@content-desc=\"Submit\"]");
    public By ATTENDANCE_SUBMIT_SUCCESS_MODAL = By.xpath("//android.widget.ImageView[@content-desc=\"Success!\n" +
            "your attendance is waiting for approval.\"]");
    public By REMARKS_ATTENDANCE = By.xpath("//android.widget.EditText");
    public By MENU = By.xpath("//android.view.View[@content-desc=\"Hi, Ehsanul Alam Sabbir!\n" +
            "Explore the dashboard\"]/android.widget.ImageView[1]");
    public By LOGOUT_BUTTON = By.xpath("//android.widget.ImageView[@content-desc=\"Log out\"]");
    public By OUT_TIME = By.xpath("//android.widget.ImageView[@content-desc=\"Out Time\"]");

    public void doLogout() throws InterruptedException {
        clickOnElement(MENU);
        clickOnElement(LOGOUT_BUTTON);
        Thread.sleep(1);
    }
}
