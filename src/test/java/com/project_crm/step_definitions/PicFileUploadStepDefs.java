package com.project_crm.step_definitions;

import com.project_crm.pages.UploadPage;
import com.project_crm.utilities.BrowserUtils;
import com.project_crm.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;


import static org.junit.Assert.assertTrue;


public class PicFileUploadStepDefs {

    UploadPage uploadPage = new UploadPage();



    @When("user clicks {string}")
    public void userClicks(String text) {

        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath("//span[.='" + text + "']")).click();

    }

    @And("user selects {string}")
    public void userSelects(String text) {

        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath( "//span[@title='" + text + "']")).click();
    }


    @And("user selects file and picture from device")
    public void user_selects_file_and_picture_from_device() {
        String projectPath = System.getProperty("user.dir");

        //the path of the file
        String filePath = "src/test/resources/filesToUpload/testFile.txt";
        String picturePath = "src/test/resources/filesToUpload/samplePic.jpeg";

        //it concatenates the project path and the file path to obtain the full path of the PNG file
        String fullFilePath = projectPath + "/" + filePath;
        String fullPicPath = projectPath + "/" + picturePath;
        BrowserUtils.sleep(2);
        uploadPage.uploadFileImage.sendKeys(fullFilePath);
        BrowserUtils.sleep(2);
        uploadPage.uploadFileImage.sendKeys(fullPicPath);
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

        assertTrue(uploadPage.uploadedFile.getAttribute("data-bx-title").contains("testFile"));
        assertTrue(uploadPage.uploadedPicture.getAttribute("data-bx-title").contains("samplePic"));


    }

    @And("user clicks {string} button")
    public void userClicksButton(String arg0) {
    }
}
