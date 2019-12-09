package com.virgingames.resources;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by : Divyesh Patel
 * since : Thursday  28/11/2019
 * Time  : 13:40
 **/

public class MyStepdefs {
    @Given("^the customer is in Virgin Home Page$")
    public void theCustomerIsInVirginHomePage() {
    }

    @When("^the customer click on login link$")
    public void theCustomerClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @And("^the customer login with invalid userid - \"([^\"]*)\"$")
    public void theCustomerLoginWithInvalidUserid(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        new LoginPage().enterUserName(arg0);
    }

    @And("^enter passord - \"([^\"]*)\"$")
    public void enterPassord(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        new LoginPage().enterPassword(arg0);
    }

    @And("^click on LoginButton$")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should get the error message as \"([^\"]*)\"$")
    public void iShouldGetTheErrorMessageAs(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg0, new LoginPage().loginErrorMessage());
    }
}
