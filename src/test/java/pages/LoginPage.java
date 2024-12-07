package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public By LOGIN_MODAL = By.xpath("//android.view.View[@content-desc='Login']");
    public By WRONG_PASSWORD_TEXT = By.xpath("//android.view.View[@content-desc=\"Invalid username or password.\"]");
    public By ALLOW_BUTTON = By.id("com.android.permissioncontroller:id/permission_allow_button");
    public By TYPE_SUBDOMAIN_INPUT = By.xpath("//android.widget.EditText");
    public By GO_TO_LOGIN_BUTTON = By.xpath("//android.widget.Button[@content-desc='Go To Login']");

    public By USERNAME_INPUT = By.xpath("//android.view.View[@content-desc='Login']/android.widget.EditText[1]");
    public By PASSWORD_INPUT = By.xpath("//android.view.View[@content-desc='Login']/android.widget.EditText[2]");
    public By GO_TO_DASHBOARD_BUTTON = By.xpath("//android.widget.Button[@content-desc='Go To Dashboard']");


    public void doLogin(String username, String password){
        try {
            clickOnElement(ALLOW_BUTTON);
        }catch (Exception e) {
            System.out.println("Allow Button is not available");
        }
        writeOnElement(TYPE_SUBDOMAIN_INPUT, "viva");
        clickOnElement(GO_TO_LOGIN_BUTTON);
        writeOnElement(USERNAME_INPUT,username);
        writeOnElement(PASSWORD_INPUT,password);
        clickOnElement(GO_TO_DASHBOARD_BUTTON);

    }
}
