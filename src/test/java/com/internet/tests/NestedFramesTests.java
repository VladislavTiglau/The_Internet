package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.NestedFramesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedFramesTests extends TestBase {


    NestedFramesPage frames;

    @BeforeEach
    public void precondition() {
        HomePage home = new HomePage(driver);
        home.goToNestedFrames();
        frames = new NestedFramesPage(driver);
    }

    @Test
    public void checkLeftFrame() {
        frames.switchToTopFrame();
        frames.switchToLeftFrame();

        assertEquals("LEFT", frames.getFrameText());
    }

    @Test
    public void checkMiddleFrame() {
        frames.switchToTopFrame();
        frames.switchToMiddleFrame();

        assertEquals("MIDDLE", frames.getFrameText());
    }

    @Test
    public void checkRightFrame() {
        frames.switchToTopFrame();
        frames.switchToRightFrame();

        assertEquals("RIGHT", frames.getFrameText());
    }
    @Test
    public void checkBottomFrame() {
        frames.switchToTopFrame();
        frames.switchToBottomFrame();

        assertEquals("BOTTOM", frames.getFrameText());
    }
}
