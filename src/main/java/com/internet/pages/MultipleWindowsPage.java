package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class MultipleWindowsPage extends BasePage {

    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/windows/new']")
    WebElement clickHereButton;

    public void clickHere() {
        click(clickHereButton);
    }

    public void switchToNewWindow() {
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
