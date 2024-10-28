package com.project_crm.step_definitions;

import com.project_crm.pages.LoginPage;
import com.project_crm.pages.UploadPage;
import com.project_crm.utilities.BrowserUtils;
import com.project_crm.utilities.ConfigurationReader;
import io.cucumber.java.en.*;


import static org.junit.Assert.assertTrue;


public class PicFileUploadStepDefs {

    UploadPage uploadPage = new UploadPage();


    @When("user writes new message")
    public void user_writes_new_message() {
        BrowserUtils.sleep(5);

        uploadPage.messageTab.click();

    }


    @And("user selects picture and file from device")
    public void user_selects_picture_file_from_device() {

        uploadPage.uploadTag.click();
        BrowserUtils.sleep(2);

    }
    @And("user selects file and picture from device")
    public void user_selects_file_and_picture_from_device() {
        uploadPage.uploadFileImage.sendKeys(ConfigurationReader.getProperty("file_path"));
        BrowserUtils.sleep(3);
        uploadPage.uploadFileImage.sendKeys(ConfigurationReader.getProperty("picture_path"));
        BrowserUtils.sleep(2);
    }

    @And("user clicks Send button")
    public void user_clicks_button() {

        uploadPage.sendButton.click();
        BrowserUtils.sleep(3);

    }


    @Then("message should be posted with selected picture and file")
    public void message_should_be_posted_with_selected_picture_and_file() {
        System.out.println("File = " + uploadPage.uploadedFile.getAttribute("data-bx-title"));
        System.out.println("Pic = " + uploadPage.uploadedPicture.getAttribute("data-bx-title"));

        assertTrue(uploadPage.uploadedFile.getAttribute("data-bx-title").contains("test file"));
        assertTrue(uploadPage.uploadedPicture.getAttribute("data-bx-title").contains("test picture"));


    }


}
