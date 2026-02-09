package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href=\"/javascript_alerts\"]")
    WebElement jsAlerts;

    public void goToJavaScriptAlerts() { click(jsAlerts); }

    @FindBy(css = "a[href='/windows']")
    WebElement multipleWindows;

    public void goToMultipleWindows() {
        click(multipleWindows);
    }

    @FindBy(css = "a[href=\"/nested_frames\"]")
    WebElement nestedFrames;

    public void goToNestedFrames() {
        click(nestedFrames);
    }

    @FindBy(linkText = "Dropdown")
    WebElement dropDown;

    public void goToDromdown() {
        click(dropDown);
    }

    @FindBy(css = "a[href='/drag_and_drop']")
    WebElement dragAndDrop;

    public void goToDragAndDrop() {
        click(dragAndDrop);
    }

    @FindBy(css = "a[href='/horizontal_slider']")
    WebElement slider;

    public void goToHorizontalSlider() {
        click(slider);
    }

    @FindBy(css = "a[href='/upload']")
    WebElement fileUpload;

    public void goToFileUpload() {
        click(fileUpload);
    }
}
