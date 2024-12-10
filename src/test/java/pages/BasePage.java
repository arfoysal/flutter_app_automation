package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Arrays;

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
        int screenHeight = getApp().manage().window().getSize().getHeight();
        int screenWidth = getApp().manage().window().getSize().getWidth();

        // Calculate start and end points for the swipe
        int startX = screenWidth / 2;  // Horizontally center
        int startY = (int) (screenHeight * 0.8); // Near the bottom
        int endY = (int) (screenHeight * 0.2);   // Near the top

        // Create a pointer input for touch gestures
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        // Create the swipe sequence
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Perform the swipe action
        getApp().perform(Arrays.asList(swipe));
    }

}
