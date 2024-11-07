package com.project_crm.step_definitions;

import com.project_crm.pages.LoginPage;
import com.project_crm.pages.PollPage;
import com.project_crm.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PollCreationStepDefs {

    PollPage pollPage = new PollPage();
    LoginPage loginPage = new LoginPage();



    @Given("The user clicks on the Poll module")
    public void userClicksPollButton(){

        pollPage.pollButton.click();

    }

    @When("User enters question to poll under question box")
    public void questionPoll(){

        pollPage.questionBox.sendKeys(ConfigurationReader.getProperty("poll_question"));
    }
    @And("User creates first answer to poll")
    public void answer1(){

        pollPage.answer1.sendKeys(ConfigurationReader.getProperty("poll_choice1"));
    }
    @And("User creates second answer to poll")
    public void answer2(){

        pollPage.answer2.sendKeys(ConfigurationReader.getProperty("poll_choice2"));
    }
    @And("User creates third answer to poll - if needed")
    public void answer3(){

        pollPage.answer3.sendKeys(ConfigurationReader.getProperty("poll_choice3"));
    }
    @And("User creates fourth answer to poll - if needed")
    public void answer4(){

        pollPage.answer4.sendKeys(ConfigurationReader.getProperty("poll_choice4"));
    }
    @And("User creates the fifth answer to poll - if needed")
    public void answer5(){

        pollPage.answer5.sendKeys(ConfigurationReader.getProperty("poll_choice5"));
    }
    @And("User clicks the Send Poll button")
    public void clickSendButton(){

        pollPage.sendButton.click();
    }


}
