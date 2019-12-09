$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/virgingames/resources/featurefiles/login.feature");
formatter.feature({
  "line": 2,
  "name": "VirginGames Login Validation",
  "description": "As a Customer\r\nI want login with different credentials\r\nSo that I can validate the login details",
  "id": "virgingames-login-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UI"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Validate login error condition",
  "description": "",
  "id": "virgingames-login-validation;validate-login-error-condition",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "the customer is in Virgin Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the customer click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the customer login with invalid userid - \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter passord - \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on LoginButton",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should get the error message as \"\u003cerrormessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "virgingames-login-validation;validate-login-error-condition;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "errormessage"
      ],
      "line": 17,
      "id": "virgingames-login-validation;validate-login-error-condition;;1"
    },
    {
      "cells": [
        "Test",
        "Password",
        "Please try again, your username/email or password has not been recognised"
      ],
      "line": 18,
      "id": "virgingames-login-validation;validate-login-error-condition;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8674511900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Validate login error condition",
  "description": "",
  "id": "virgingames-login-validation;validate-login-error-condition;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@UI"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the customer is in Virgin Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the customer click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the customer login with invalid userid - \"Test\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter passord - \"Password\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on LoginButton",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should get the error message as \"Please try again, your username/email or password has not been recognised\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theCustomerIsInVirginHomePage()"
});
formatter.result({
  "duration": 212914900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.theCustomerClickOnLoginLink()"
});
formatter.result({
  "duration": 2005084700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 42
    }
  ],
  "location": "MyStepdefs.theCustomerLoginWithInvalidUserid(String)"
});
formatter.result({
  "duration": 208632700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password",
      "offset": 17
    }
  ],
  "location": "MyStepdefs.enterPassord(String)"
});
formatter.result({
  "duration": 181089400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.clickOnLoginButton()"
});
formatter.result({
  "duration": 173223000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please try again, your username/email or password has not been recognised",
      "offset": 35
    }
  ],
  "location": "MyStepdefs.iShouldGetTheErrorMessageAs(String)"
});
formatter.result({
  "duration": 645800500,
  "status": "passed"
});
formatter.after({
  "duration": 846966500,
  "status": "passed"
});
});