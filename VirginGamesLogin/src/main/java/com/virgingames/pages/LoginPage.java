package com.virgingames.pages;

import com.virgingames.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by : Divyesh Patel
 * since : Thursday  28/11/2019
 * Time  : 12:17
 **/

public class LoginPage extends Util {

    @FindBy (id = "field-username")
    WebElement _usernameField;

    @FindBy (id = "field-password")
    WebElement _passwordField;

    @FindBy (xpath = "//button[@class='button button-login']")
    WebElement _loginButton;

    @FindBy (xpath = "//div[@class='output']")
    WebElement _loginErrorMessage;

    public void enterUserName(String str)
    {
        sendTextToElement(_usernameField,str);
    }

    public void enterPassword(String str)
    {
        sendTextToElement(_passwordField,str);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(_loginButton);
    }

    public String loginErrorMessage()
    {
        return getTextFromElement(_loginErrorMessage);
    }
}
