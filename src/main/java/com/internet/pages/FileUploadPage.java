package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.function.BooleanSupplier;

public class FileUploadPage extends BasePage {

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement upload;

    public FileUploadPage uploadFile(String path) {
        upload.sendKeys(path);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement submit;

    public FileUploadPage clickUpload() {
        submit.click();
        return this;
    }

    @FindBy(tagName = "h3")
    WebElement uploadedSuccess;

    public FileUploadPage verifySuccessUpload() {
        Assertions.assertTrue(uploadedSuccess.isDisplayed());
        return this;
    }
}
