
Feature: Register Test

  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I should see the "Register" text

  Scenario: User should navigate to FirstName,LastName,Email,Password and Confirm password fields
    Given I am on homepage
    When I click on register link
    And  I click on register button
    Then  I should see the "First name is required." in firstname
    And  I should see the"Last name is required." in lastname
    And  I should see the "Email is required." in email
    And  I should see the "Password is required." in password
    And I should see the "Password is required." in confirm password

  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And  I select gender "Female"
    And  I enter "Vienaa" in firstname field
    And  I enter "Thaker" in lastname field
  And  I select "10" from day
    And  I select "11" from month
    And  I select "2005" from year
    And  I enter "primetest2214@gmail.com" in email field
    And  I enter "abc123" in password field
    And  I enter "abc123" in confirm password field
  And I click on register button
  Then I should see the"Your registration completed" in regostration completed



