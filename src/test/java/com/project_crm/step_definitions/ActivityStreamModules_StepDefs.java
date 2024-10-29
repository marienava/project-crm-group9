package com.project_crm.step_definitions;

import com.project_crm.pages.ActivityStreamPage;
import com.project_crm.pages.LoginPage;
import com.project_crm.utilities.BrowserUtils;
import com.project_crm.utilities.ConfigurationReader;
import com.project_crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ActivityStreamModules_StepDefs {

    LoginPage login = new LoginPage();
    ActivityStreamPage activity = new ActivityStreamPage();


    @Given("I'm logged in as user")
    public void theUserLoggedInAsUser(List<String> users) {
        for (String each : users) {
            //    BrowserUtils.waitFor(1);
            login.login(ConfigurationReader.getProperty(each + "_username"), ConfigurationReader.getProperty("password"));
            login.userName.clear();
        }
    }

    @Then("user sees given modules:")
    public void user_sees_given_modules(List<String> dataTable) {
        BrowserUtils.waitFor(2);
        List<String> actualModules = new ArrayList<String>();
        for (WebElement each : activity.activitiesTabs) {
            actualModules.add(each.getText());
            Assert.assertTrue(each.isDisplayed());
        }
        Assert.assertEquals(dataTable, actualModules);
    }


    @Given("the I'm logged in as a {string}:")
    public void theIMLoggedInAsA(String user) {
        login.userName.sendKeys(ConfigurationReader.getProperty(user + "_username"));
        login.password.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);

    }

    @Then("when user clicks on More tab")
    public void when_user_clicks_on_more_tab() {
        BrowserUtils.waitForClickablility(activity.moreModule, 2);
        activity.moreModule.click();
    }

    @Then("user sees dropdown options:")
    public void user_sees_dropdown_options(List<String> dopdownList) {
        List<String> moreTabStrings = new ArrayList<>();
        for (WebElement each : activity.moreDropdownList) {
            moreTabStrings.add(each.getText());
            Assert.assertTrue(each.isDisplayed());
        }
        Assert.assertEquals(moreTabStrings, dopdownList);

    }


    @Given("the I'm logged in as an hr")
    public void the_i_m_logged_in_as_an_hr() {
        login.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("password"));
    }

    @When("I click on More tab")
    public void i_click_on_more_tab() {
        if(Driver.getDriver().getTitle().contains("EULA")) {
            activity.leftSideMenu.get(0).click();
        } else
        activity.moreModule.click();
    }

    @When("select File option")
    public void select_File_option() {
        activity.fileDropdown.click();

    }

    @When("click on Upload file")
    public void click_on_upload_file() {
        // activity.fileUpload.click();
    }

    @When("choose file")
    public void choose_file() {
        BrowserUtils.waitFor(3);
        // File upload = new File("sampleFile.jpeg");
        activity.UploadFilesAndImages.sendKeys(ConfigurationReader.getProperty("filePath"));
    }

    @When("click send")
    public void click_send() {
        activity.sendButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("I should se the file on top of the feed")
    public void i_should_se_the_file_on_top_of_the_feed() {
       // System.out.println(" message "+ activity.topMessage.getText());
       // System.out.println("message2 "+ activity.topMessage2.getText());
        BrowserUtils.waitForVisibility(activity.topMessage,5);
  Assert.assertTrue(activity.topMessage.getText().contains(ConfigurationReader.getProperty("fileName")));
    }


    @Then("I should see the top message")
    public void i_Should_See_top_Message() {
        Assert.assertTrue(activity.topMessage.getText().contains(ConfigurationReader.getProperty("fileName")));

    }
}
