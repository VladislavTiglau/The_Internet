package com.internet.tests;

import com.internet.pages.HomePage;
import com.internet.core.TestBase;
import com.internet.pages.JavaScriptAlertsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaScriptAlertsTests extends TestBase {

    JavaScriptAlertsPage alerts;


    @BeforeEach
    public void precondition() {
        HomePage home = new HomePage(driver);
        home.goToJavaScriptAlerts();
        alerts = new JavaScriptAlertsPage(driver);
    }

    @Test
    public void simpleAlertTest() {
        alerts.clickSimpleAlert();
        String text = alerts.getAlertText();
        assertEquals("I am a JS Alert", text);
        alerts.acceptAlert();
    }

    @Test
    public void confirmAlertTest() {
        alerts.clickConfirmAlert();
        String text = alerts.getAlertText();
        assertEquals("I am a JS Confirm", text);
        alerts.dismissAlert();
    }

    @Test
    public void promptAlertTest() {
        alerts.clickPromptAlert();
        alerts.sendTextToAlert("Vladislav");
    }
}



