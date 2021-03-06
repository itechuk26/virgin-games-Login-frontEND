package com.virgingames.resources;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.Reporter;
import com.virgingames.basepage.BasePage;
import com.virgingames.browserselector.BrowserSelector;
import com.virgingames.loadproperty.LoadProperty;
import com.virgingames.utility.Util;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.io.File;
import java.io.IOException;


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
        public void afterScenario(Scenario scenario) {
            if (scenario.isFailed()) {
                String screenshotName = scenario.getName().replaceAll(" ", "_");
                try {
                   String destinationPath = Util.getScreenshot(driver, "Error");
                   Reporter.addScreenCaptureFromPath(destinationPath);
                } catch (IOException e) {
                }
            }
        driver.quit();
    }

}
