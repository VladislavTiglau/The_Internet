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





}
