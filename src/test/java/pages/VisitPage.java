package pages;

import org.openqa.selenium.By;

public class VisitPage extends BasePage{
    public By VISIT_APPLICATIONS = By.xpath("//android.widget.ImageView[@content-desc=\"Visit Applications\"]");
    public By ADD_NEW_VISIT = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    public By SELECT_FROM_DATE_TIME = By.xpath("(//android.view.View[@content-desc=\"Select date and time\"])[1]");
    public By DATE_OK_BUTTON = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    public By TIME_OK_BUTTON = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
    public By SELECT_TO_DATE_TIME = By.xpath("//android.view.View[@content-desc=\"Select date and time\"]");
    public By PURPOSE = By.xpath("//android.widget.EditText");
    public By APPLY_FOR_VISIT = By.xpath("//android.widget.Button[@content-desc=\"Apply for Visit\"]");

}
