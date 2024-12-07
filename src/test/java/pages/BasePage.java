package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static utilities.DriverSetup.getApp;

public class BasePage {

    public WebElement getElement(By locator){
        return getApp().findElement(locator);
    }

    public void writeOnElement(By locator, String text ) {
        getElement(locator).click();
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
//        getApp().hideKeyboard();
    }

    public Boolean displayStatus(By locator){
        try {
            return getElement(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }
    public void swipeUp() {
        // Get screen dimensions
        Dimension size = getApp().manage().window().getSize();

        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8); // 80% from the top
        int endY = (int) (size.height * 0.2);  // 20% from the top

        // Perform swipe
        new TouchAction<>(getApp())
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public void scrollAndClick(String visibleText) {
        getApp().findElement("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
    }
}
}
