package com.project_crm.step_definitions;

import com.project_crm.pages.MyProfilePage;
import com.project_crm.utilities.BrowserUtils;
import com.project_crm.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;


public class MyProfileStepDefs {

    MyProfilePage profilePage = new MyProfilePage();

    @When("the user clicks profile sidebar")
    public void the_user_clicks_profile_sidebar() {
        BrowserUtils.sleep(2);
        profilePage.profileSidebar.click();

    }


    @When("the user clicks {string} page")
    public void theUserClicksPage(String page) {
        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath("//span[.='"+page+"']")).click();
    }


    @Then("the user should see their profile information")
    public void the_user_should_see_their_profile_information() {

        String expected = profilePage.profileSidebar.getText();
        String actual = profilePage.pageTitle.getText();
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
        BrowserUtils.sleep(2);
        assertEquals(expected,actual);

    }


}
