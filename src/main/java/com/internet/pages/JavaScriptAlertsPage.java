package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage extends BasePage {

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement simpleAlertButton;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement confirmAlertButton;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    WebElement promptAlertButton;


    public void clickSimpleAlert() {
        click(simpleAlertButton);
    }

    public void clickConfirmAlert() {
        click(confirmAlertButton);
    }

    public void clickPromptAlert() {
        click(promptAlertButton);
    }

    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void sendTextToAlert(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }
}
