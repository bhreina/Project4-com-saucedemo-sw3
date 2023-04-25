package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;

public class Utility extends BaseTest {
    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    /**
     * This method will send text to element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    public boolean isTextDisplayed(By by, String expectedText){
        boolean actualText = driver.findElement(by).getText().contains(expectedText);//Find and get actual text
        assert actualText : "Text is not found" + expectedText;
        return true;
    }
    public boolean getNumberFromElement(By by,int expectedNumber){
        int actualNumber = driver.findElements(by).size();
        assert actualNumber == expectedNumber : "Expected Number is not found" + expectedNumber;
        return true;
    }
}
