package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static utilities.DriverSetup.getApp;

public class BasePage {

    public WebElement getElement(By locator){
        return getApp().findElement(locator);
    }

    public void writeOnElement(By locator, String text ){
        getElement(locator).click();
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
        //getApp().hideKeyboard();
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
}
