@UI
Feature: VirginGames Login Validation
  As a Customer
  I want to login with different credentials
  So that I can validate the login details


  Scenario Outline: Validate login error condition
    Given the customer is in Virgin Home Page
    When the customer click on login link
    And the customer login with invalid userid - "<username>"
    And enter passord - "<password>"
    And click on LoginButton
    Then I should get the error message as "<errormessage>"

    Examples:
      | username          | password | errormessage                                                              |
      | Test              | Password | Please try again, your username/email or password has not been recognised |
      | abc               | test     | Your username/email must be 4 to 60 characters long                       |
      | u                 | password | Your username/email must be 4 to 60 characters long                       |
      | user              |          | Both your username and password are required                              |
      |                   | password | Both your username and password are required                              |
      | Test123@gmail.com | password | Please try again, your username/email or password has not been recognised |