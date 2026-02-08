package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SliderPage extends BasePage {

    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='range']")
    WebElement slider;

    public SliderPage moveSliderBy(int xOffset,int yOffset) {
        actions.clickAndHold(slider).moveByOffset(xOffset,yOffset).perform();
        return this;
    }
}
