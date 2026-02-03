package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.MultipleWindowsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleWindowsTests extends TestBase {

    MultipleWindowsPage windowsPage;

    @BeforeEach
    public void precondition() {
        HomePage home = new HomePage(driver);
        home.goToMultipleWindows();
        windowsPage = new MultipleWindowsPage(driver);
    }

    @Test
    public void clickHereOpensNewWindowTest() {
        windowsPage.clickHere();
        windowsPage.switchToNewWindow();

        String title = windowsPage.getPageTitle();
        assertEquals("New Window", title);
    }
}
