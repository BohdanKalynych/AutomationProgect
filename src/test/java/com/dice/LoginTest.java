package com.dice;

import ProfilePage.ProfilePage;
import com.dice.base.BaseTest;
import com.dice.com.dice.pages.LoginPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void positiveLoginTest(){
        LoginPageObject LogInPage = new LoginPageObject(driver);
        String expectedPageTitle = "Seeker Dashboard - Profile";
        String correctProfileName = "Bohdan TestAcc";
        // Open dice login page - http://www.dice.com
        LogInPage.openLoginPage();

        // Fill email and password
        LogInPage.fillUpEmailAndPassword("ainsley6@2viewerl.com","25061995b");

        // Push SIgn In button and wait for profile page to load
        ProfilePage profilePage = LogInPage.pushSignInButton();
        profilePage.waitForProfilePageToLoad();

        // Verifications
        // - Verify title of the page is OK - Seeker Dashboard - Profile
        System.out.println("verifications ");
        String actualTitle = profilePage.getTitle();
        Assert.assertTrue(expectedPageTitle.equals(actualTitle),"Page title is not expected.\nExpected: "+expectedPageTitle + "" + "\nActual: "+actualTitle);

        // - Verify that correct profile is loaded
        Assert.assertTrue(profilePage.isCorrectProfileLoaded(correctProfileName),"Profile name is not expected");
    }
}
