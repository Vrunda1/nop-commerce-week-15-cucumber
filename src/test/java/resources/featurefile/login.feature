Feature: Login Test

  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should see the Welcome message"Welcome, Please Sign In!"

  Scenario: User should see the error message with invalid credenitals
    Given I am on homepage
    When I click on login link
    And I enter email "tiku1@gmail.com"
    And I enter password "abc1223"
    And I click on login button
    Then I should see the login error message Login was unsuccessful

  Scenario: User should logIn successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primetest2214@gmail.com"
    And I enter password "abc123"
    And I click on login button
    Then I should see the logout "Log out" link

  Scenario: User should logOut successfully
    Given I am on homepage
    When I click on login link
    And I enter email "primetest2214@gmail.com"
    And I enter password "abc123"
    And I click on login button
    And I click on logOut link
    Then I should see the "Log in" link on top menu






