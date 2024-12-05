package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public By GREETINGS_TEXT = By.xpath("//android.view.View[@content-desc=\"Hi, Ehsanul Alam Sabbir!\n" +
            "Explore the dashboard\"]");
    public By IN_TIME = By.xpath("//android.widget.ImageView[@content-desc=\"In Time\"]\n");
    public By WHILE_USING_THE_APP = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    public By SUBMIT_BUTTON_ATTENDANCE = By.xpath("//android.view.View[@content-desc='Submit']");

    public By REMARKS_ATTENDENCE = By.xpath("//android.widget.EditText");
}
