package com.project_crm.step_definitions;

import com.project_crm.utilities.BrowserUtils;
import com.project_crm.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

public class CompanyStepDefs {

    @When("the user clicks {string} link")
    public void the_user_clicks_link(String link) {
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//span[normalize-space(text())='"+link+"']")).click();
    }


    @Then("the user should land on {string} page")
    public void the_user_should_land_on_page(String pageTitle) {
        String actual = Driver.getDriver().getTitle();
        assertTrue(actual.contains(pageTitle));


    }
}
