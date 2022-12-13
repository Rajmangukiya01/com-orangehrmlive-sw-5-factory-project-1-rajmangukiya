package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ForgotPasswordPage forgotPasswordPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        forgotPasswordPage = new ForgotPasswordPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(dashboardPage.getDashboardText(), "Dashboard", "Dashboard is not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.clickOnForgotPasswordLink();
        Assert.assertEquals(forgotPasswordPage.verifyResetPasswordText(),"Reset Password","Reset Password is not displayed");
    }
}
