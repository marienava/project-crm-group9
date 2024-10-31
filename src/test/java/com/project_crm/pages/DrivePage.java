package com.project_crm.pages;

import com.project_crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DrivePage {

    public DrivePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id = 'bx_left_menu_menu_files']//span[@class='menu-item-link-text']")
    public WebElement driveMenuBtn;

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> driveMenuList;
}
