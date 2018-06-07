package ProfilePage;

import com.dice.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePageObject<ProfilePage> {

    private By editprofileButton = By.xpath("//button[@id='editProfile']");
    private By advancedSearchButton = By.xpath("//a[@class='dice-btn-link']");
    private By profileContactNameText = By.xpath("//h1[@class='profile-contact-name']");


    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public void waitForProfilePageToLoad(){
        System.out.println("Waiting for Profile to be loaded");
        waitForVisibilityOf(editprofileButton);
        waitForVisibilityOf(advancedSearchButton, 15);

    }

    public boolean isCorrectProfileLoaded(String correctProfileName){
        if (getText(profileContactNameText).equals(correctProfileName)){
            return true;
        }
        return false;

    }


}
