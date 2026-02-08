package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.DragAndDropPage;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DragAndDropTest extends TestBase {

    DragAndDropPage dragAndDropPage;

    @BeforeEach
    public void precondition() {
        HomePage home = new HomePage(driver);
        home.goToDragAndDrop();
        dragAndDropPage = new DragAndDropPage(driver);
    }

    @Test
    public void dragMeTest() {
        dragAndDropPage.dragMe();
    }

}
