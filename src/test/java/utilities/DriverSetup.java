package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverSetup{
    public static String appName = System.getProperty("app", "3.0.1+1500030-debug.apk");

    File f = new File("src/test/resources");
    public static final ThreadLocal<AndroidDriver> LOCAL_DRIVER = new ThreadLocal<>();

    public static AndroidDriver getApp() {
        return LOCAL_DRIVER.get();
    }

    public static void startApp(AndroidDriver driver) {
        DriverSetup.LOCAL_DRIVER.set(driver);
    }

    public AndroidDriver getDriver(String appName) throws MalformedURLException {
        File apk = new File(f, appName);
        var options = new BaseOptions()
                .amend("platformName", "android")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:deviceName", "local")
                .amend("appium:udid", "emulator-5554")
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true)
//                .amend("appium:app", apk.getAbsoluteFile())
                .amend("appium:appPackage", "com.vivacomsolutions.pihr.client.dev")
                .amend("appium:appActivity", "com.vivacomsolutions.pihr.MainActivity");

        URL remoteURL = new URL("http://192.168.31.91:4723/");
        AndroidDriver driver = new AndroidDriver(remoteURL, options);
        return driver;
    }


    @BeforeMethod
    public void startBrowser() throws MalformedURLException {
        AndroidDriver driver = getDriver(appName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        startApp(driver);
    }


    @AfterMethod
    public void quitBrowser(){
        getApp().quit();
    }
}