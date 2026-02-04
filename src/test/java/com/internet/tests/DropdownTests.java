package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.DropdownPage;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropdownTests extends TestBase {

    DropdownPage dropdownPage;

    @BeforeEach
    public void precondition() {
        HomePage home = new HomePage(driver);
        home.goToDromdown();
        dropdownPage = new DropdownPage(driver);
    }

    @Test
    public void selectOption1() {
        dropdownPage.selectOptionByVisibleText("Option 1");
        assertEquals("Option 1", dropdownPage.getSelectedOption());
    }

    @Test
    public void selectOption2() {
        dropdownPage.selectOptionByVisibleText("Option 2");
        assertEquals("Option 2", dropdownPage.getSelectedOption());
    }
}
