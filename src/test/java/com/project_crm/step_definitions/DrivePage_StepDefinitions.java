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

    @Given("user clicks on {string} menu")
    public void user_clicks_on_menu(String string) {
        //driveMenu.click();

    }

    @Then("user sees following modules:")
    public void user_sees_following_modules(List<String> dataTable) {
        BrowserUtils.waitFor(2);
//        List<String> actualDriveModules = new ArrayList<>();
//        for (WebElement each : drivePage.driveModules) {
//            actualDriveModules.add(each.getText());
//            Assert.assertTrue(each.isDisplayed());
//        }


    }

}
