package com.project_crm.pages;

import com.project_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollPage {

    public PollPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageField;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement questionBox;

    @FindBy(xpath = "//input[@id='answer_0__0_']")
    public WebElement answer1;

    @FindBy(xpath = "//input[@id='answer_0__1_']")
    public WebElement answer2;

    @FindBy(xpath = "//input[@id='answer_0__2_']")
    public WebElement answer3;

    @FindBy(xpath = "//input[@id='answer_0__3_']")
    public WebElement answer4;

    @FindBy(xpath = "//input[@id='answer_0__4_']")
    public WebElement answer5;

    @FindBy(name = "UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][1][MULTI]")
    public WebElement multipleChoiceCheckbox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(linkText = "All employees")
    public WebElement recipientButton;




}


