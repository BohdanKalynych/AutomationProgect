package com.dice.com.dice.pages;

import ProfilePage.ProfilePage;
import com.dice.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePageObject<LoginPageObject> {
    private static final String  URL = "https://www.dice.com/dashboard/login";

    private By emailField = By.xpath("//input[@id='email']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By signInButton = By.xpath("//button[@type='submit']");


    public LoginPageObject(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage(){
        getPage(URL);

    }

    public void fillUpEmailAndPassword(String email, String password){
        System.out.println("Filling up email and password");
        type(email, emailField);
        type(password, passwordField);
    }

    public ProfilePage pushSignInButton(){
        System.out.println("clicking on Sign In button");
        click(signInButton);
        return new ProfilePage(driver);
    }

}
