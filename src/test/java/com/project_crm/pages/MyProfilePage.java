package com.project_crm.pages;

import com.project_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

    public MyProfilePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profileSidebar;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement pageTitle;
}
