package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.SliderPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SliderTest extends TestBase {

    SliderPage sliderPage;

    @BeforeEach
    public void precondition() {
        HomePage home = new HomePage(driver);
        home.goToHorizontalSlider();
        sliderPage = new SliderPage(driver);
    }

    @Test
    public void testSlider() {
        sliderPage.moveSliderBy(20,0);
    }
}
