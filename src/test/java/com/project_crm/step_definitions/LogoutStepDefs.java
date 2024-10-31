package com.project_crm.step_definitions;

import com.project_crm.pages.LogoutPage;
import com.project_crm.utilities.BrowserUtils;
import com.project_crm.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LogoutStepDefs {
    LogoutPage logout = new LogoutPage();


    @And("verify user sees following modules:")
    public void verifyUserSeesFollowingModules(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<String>();
        for (WebElement each : logout.listOfModules) {
            actualModules.add(each.getText());
        }
        BrowserUtils.sleep(2);
        assertEquals(expectedModules,actualModules);
    }


    @Then("the user should land on log in {string} page")
    public void theUserShouldLandOnLogInPage(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.sleep(2);
        assertEquals(expectedTitle,actualTitle);
    }
}
