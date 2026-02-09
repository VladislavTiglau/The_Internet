package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.FileUploadPage;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileUploadTest extends TestBase {

    FileUploadPage fileUploadPage;

    @BeforeEach
    public void precondition() {
        HomePage home = new HomePage(driver);
        home.goToFileUpload();
        fileUploadPage = new FileUploadPage(driver);
    }

    @Test
    public void uploadFileTest() {
        fileUploadPage.uploadFile("C:/Tools/PNG_transparency_demonstration_1.png")
                .clickUpload()
                .verifySuccessUpload()
        ;
    }
}
