package com.project_crm.pages;

import com.project_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {

    public UploadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Message']")
    //@FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;

    //@FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    //public WebElement iframe;


    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadTag;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFileImage;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//div[@class='feed-com-files diskuf-files-entity']//a")
    public WebElement uploadedFile;

    @FindBy(xpath = "//div[@class='feed-com-files diskuf-files-entity']//img")
    public WebElement uploadedPicture;

}
