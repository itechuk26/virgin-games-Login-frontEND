package com.virgingames.resources;
import cucumber.api.CucumberOptions;
import com.cucumber.listener.Reporter;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;


/**
 * Created by : Divyesh Patel
 * since : Thursday  28/11/2019
 * Time  : 13:27
 **/

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        dryRun = false,
        monochrome = false
)

public class TestRunner {

    @AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("src\\test\\java\\com\\virgingames\\resources\\propertiesfiles\\Extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 10");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
