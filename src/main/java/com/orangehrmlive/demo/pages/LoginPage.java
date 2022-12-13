package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement username;

    @CacheLookup
    @FindBy(name = "password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@class,'oxd-button')]")
    WebElement loginButton;

    public void enterUsername(String text) {
        Reporter.log("Enter username " + username.toString());
        sendTextToElement(username, text);
    }

    public void enterPassword(String text) {
        Reporter.log("Enter password " + password.toString());
        sendTextToElement(password, text);
    }

    public void clickOnLoginButton() {
        Reporter.log("CLick on login button " + loginButton.toString());
        clickOnElement(loginButton);
    }
}
