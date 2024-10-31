package com.project_crm.pages;

import com.project_crm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {
    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
