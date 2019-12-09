package com.virgingames.resources;


import com.cucumber.listener.Reporter;
import com.virgingames.basepage.BasePage;
import com.virgingames.browserselector.BrowserSelector;
import com.virgingames.loadproperty.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by : Divyesh Patel
 * since : Thursday  28/11/2019
 * Time  : 13:26
 **/

public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();


    @Before
    public void setUp() {
        browserSelector.selectBrowser(loadProperty.getProperty("browser"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
