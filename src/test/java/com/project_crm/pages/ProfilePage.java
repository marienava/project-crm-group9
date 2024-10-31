package com.project_crm.pages;

import com.project_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public ProfilePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    //clicks on the username
    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement usernameElement;

    //clicks on "My Profile"
    @FindBy(className = "menu-popup-item-text")
    public WebElement myProfile;

    //sees following options on my profile page
    @FindBy(xpath = "//div[@id='profile-menu-filter']")
    public WebElement menuBar;

    //sees email address
    @FindBy(className = "user-profile-nowrap")
    public WebElement emailAdd;












}
