package com.project_crm.pages;

import com.project_crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {

   // public By modules;

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employees;


   @FindBy(xpath = "(//*[contains(text(),'Company Structure')])[3]")
   public WebElement employeesStructure;


   @FindBy(xpath = "(//*[contains(text(),'Find Employee')])[2]")
   public WebElement findEmployees;

  @FindBy(xpath = "(//*[contains(text(),'Telephone Directory')])[2]")
   public WebElement telephoneDirectory;


    @FindBy(xpath = "(//*[contains (text(),'Staff Changes')])[2]")
    public WebElement staffChanges;

    @FindBy(xpath = "(//*[contains (text(),'Efficiency Report')])[2]")
    public WebElement efficiencyReport ;

    @FindBy(xpath = "(//*[contains(text(),'Honored Employees')])[2]")
    public WebElement honoredEmployees ;

    @FindBy(xpath = "(//*[contains(text(),'Birthdays')])[2]")
    public WebElement birthday   ;

    @FindBy(xpath = "(//*[contains(text(),'New page')])[1]")
    public WebElement newPage1    ;

    @FindBy(xpath = "(//*[contains(text(),'New page')])[2]")
    public WebElement newPage2    ;
}






