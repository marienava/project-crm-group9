package com.project_crm.step_definitions;


import com.project_crm.pages.ProfilePage;
import com.project_crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfilePage_StepDefs {

    ProfilePage profilePage = new ProfilePage();

    @When("user clicks on the username")
    public void user_clicks_on_the_username() {
        profilePage.usernameElement.click();
    }
    @When("clicks on my profile tab")
    public void clicks_on_my_profile_tab() {
        profilePage.myProfile.click();
    }
    @Then("the users sees following options on my profile page")
    public void the_users_sees_following_options_on_my_profile_page(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("sees the email address under the General Tab")
    public void sees_the_email_address_under_the_general_tab() {

    }



}
