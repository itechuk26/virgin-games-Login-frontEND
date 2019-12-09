package com.virgingames.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by : Divyesh Patel
 * since : Thursday  28/11/2019
 * Time  : 11:29
 **/

public class BasePage {

    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
