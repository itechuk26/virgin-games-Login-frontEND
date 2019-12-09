package com.virgingames.pages;
import com.virgingames.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by : Divyesh Patel
 * since : Thursday  28/11/2019
 * Time  : 12:11
 **/

public class HomePage extends Util {

    @FindBy (linkText = "Login")
    WebElement _loginLink;

    @FindBy (linkText = "Join Now")
    WebElement _joinNowLink;

    public void clickOnLoginLink()
    {
        clickOnElement(_loginLink);
    }
}
