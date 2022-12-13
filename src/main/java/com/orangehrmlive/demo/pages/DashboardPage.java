package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DashboardPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h6[contains(@class,'oxd-text')]")
    WebElement dashboard;

    public String getDashboardText() {
        Reporter.log("Get actual message " + dashboard.toString());
        return getTextFromElement(dashboard);
    }
}
