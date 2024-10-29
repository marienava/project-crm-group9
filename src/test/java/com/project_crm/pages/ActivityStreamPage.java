package com.project_crm.pages;

import com.project_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {

    public ActivityStreamPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='bx_left_menu_menu_live_feed']/a")
    public WebElement activityStreamModule;

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']/span")
    public List<WebElement> activitiesTabs;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span")
    public List<WebElement> moreDropdownList;

    @FindBy(id = "feed-add-post-form-link-more")
    public WebElement moreModule;

    @FindBy(xpath = "//ul[@id='left-menu-list']/li/a")
    public List<WebElement> leftSideMenu;

    @FindBy(xpath = "//*[starts-with(@id, 'diskuf-selectdialog-')]/div[2]/table/tbody/tr[1]/td[1]")
    public WebElement fileUpload;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[1]")
    public WebElement fileDropdown;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;


    @FindBy(xpath = "//input[@name='bxu_files[]']")//(//div[@class='diskuf-uploader'])[1]
    //(//span[@class='wd-fa-add-file-light-title'])[1]
    public WebElement UploadFilesAndImages;

    @FindBy(id = "check-in-text-n3931")
    public WebElement insertTextButton;

    @FindBy(xpath = "//a[.='Uploaded files']")
    public WebElement uploadedFilesFolder;

    @FindBy(xpath = "//span[.='Sales and marketing']")
    public WebElement salesAndMarketingTab;

    @FindBy(xpath = "//a[.='Marketing and advertising']")
    public WebElement marketingAndAdvertisingTab;

    @FindBy(xpath = "//a[.='Quotes']")
    public WebElement quotesTab;

    @FindBy(xpath = "//span[.='Select current folder']")
    public WebElement selectCurrentFolderButton;

    @FindBy(xpath = "//div[@class='popup-window-buttons']/span[2]")
    public WebElement popupFolderCancel;

    @FindBy(xpath = "//span[.='My Drive']")
    public WebElement myDriveFolder;

    @FindBy(xpath = "//span[@class='files-text']")
    public WebElement fileNameEdit;

    @FindBy(className = "del-but")
    public WebElement fileCancel_X;

    @FindBy(id = "LIVEFEED_search")
    public WebElement filterAndSearchWindow;

    @FindBy(xpath = "//*[@id=\"disk-attach-390\"]")
    public WebElement topMessage;
    //just the file name

    @FindBy(xpath = "//div[@id='log_internal_container']/div[2]/div[1]")
    public WebElement topMessage2;
    //all info about message

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement fileErrorMessage;
}
