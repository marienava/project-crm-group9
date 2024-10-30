package com.project_crm.step_definitions;

import com.project_crm.pages.DrivePage;
import com.project_crm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DrivePage_StepDefinitions {

    DrivePage drivePage = new DrivePage();

    @Given("user clicks on Drive menu button")
    public void user_clicks_on_drive_menu_button() {
        drivePage.driveMenuBtn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user sees following modules:")
    public void user_sees_following_modules(List<String> driveMenuList) {
        BrowserUtils.waitFor(2);
        List<String> actualDriveMenuModules = new ArrayList<>();
        for (WebElement each : drivePage.driveMenuList) {
            actualDriveMenuModules.add(each.getText());
            Assert.assertTrue(each.isDisplayed());
        }
        Assert.assertEquals(driveMenuList, actualDriveMenuModules);


    }

}
