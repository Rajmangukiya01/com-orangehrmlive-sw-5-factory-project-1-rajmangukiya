package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//p[text()='Forgot your password? ']")
    WebElement forgotPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//h6[text()='Reset Password']")
    WebElement resetPasswordText;

    public void clickOnForgotPasswordLink() {
        Reporter.log("Click on forgot password link" + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
    }

    public String verifyResetPasswordText() {
        Reporter.log("Get reset password text " + resetPasswordText.toString());
        return getTextFromElement(resetPasswordText);
    }

}
