package pages;

import org.openqa.selenium.By;

public class LeavePage extends BasePage{
    public By MY_LEAVE_APPLICATION = By.xpath("//android.widget.ImageView[@content-desc=\"My Leave Applications\"]");
    public By ADD_NEW_LEAVE_BUTTON = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    public By SELECT_LEAVE_TYPE_DROPDOWN = By.xpath("//android.widget.Button[@content-desc=\"Select an option\"]");
    public By ANNUAL_LEAVE = By.xpath("//android.view.View[@content-desc=\"Annual Leave\"]");
    public By START_DATE = By.xpath("(//android.view.View[@content-desc=\"Select date\"])[1]");
    public By START_DATE_OK_BUTTON = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    public By END_DATE = By.xpath("//android.view.View[@content-desc=\"Select date\"]");
    public By END_DATE_OK_BUTTON = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    public By PURPOSE = By.xpath("//android.widget.EditText");
    public By APPLY_FOR_LEAVE_BUTTON = By.xpath("//android.widget.Button[@content-desc=\"Apply for Leave\"]");

}
