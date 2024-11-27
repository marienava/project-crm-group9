package com.project_crm.step_definitions;


import com.project_crm.pages.LoginPage;
import com.project_crm.pages.PollPage;
import com.project_crm.utilities.BrowserUtils;
import com.project_crm.utilities.ConfigurationReader;
import com.project_crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class PollCreationStepDefs {

    PollPage pollPage = new PollPage();
    LoginPage loginPage = new LoginPage();


    @Given("user logged in as {string} username")
    public void userLoggedInAsUsername(String userName) {

        loginPage.login(userName, "UserUser");
    }

    @Given("The user clicks on the Poll module")
    public void userClicksPollButton(){

        pollPage.pollButton.click();

    }
    @When("User enters question to poll under question box")
    public void userEntersToPollUnderQuestionBox() {

        BrowserUtils.sleep(1);
        pollPage.questionBox.sendKeys(ConfigurationReader.getProperty("poll_question"));

    }
    @And("User creates first answer to poll")
    public void userCreatesToPoll() {

        BrowserUtils.sleep(2);
        pollPage.answer1.sendKeys(ConfigurationReader.getProperty("poll_answer"));
        pollPage.messageField.sendKeys("Testing....");
    }

    @And("User creates second answer to poll")
    public void userCreatesSecondAnswerToPoll() {

        BrowserUtils.sleep(2);
        pollPage.answer2.sendKeys(ConfigurationReader.getProperty("poll_answer2"));


    }
    @And("User clicks the Send Poll button")
    public void clickSendButton(){

        pollPage.sendButton.click();
    }





}
