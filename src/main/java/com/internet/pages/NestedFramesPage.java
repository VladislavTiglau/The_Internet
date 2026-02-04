package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NestedFramesPage extends BasePage {

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    public void switchToTopFrame() {
        driver.switchTo().frame("frame-top");
    }

    public void switchToLeftFrame() {
        driver.switchTo().frame("frame-left");
    }

    public void switchToMiddleFrame() {
        driver.switchTo().frame("frame-middle");
    }

    public void switchToRightFrame() {
        driver.switchTo().frame("frame-right");
    }

    public void switchToBottomFrame() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
    }

    public String getFrameText() {
        return driver.findElement(By.tagName("body")).getText();
    }
}