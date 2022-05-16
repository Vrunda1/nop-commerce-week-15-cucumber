Feature: Computer Test
  Scenario: User should navigate to Computer page successfully
    Given I am on homepage
    When I click on computer link
    Then I should see the "Computers" computer text


  Scenario: User should navigate to Desktop page successfully
    Given I am on homepage
    When I click on computer link
    When I click on Desktops link
    Then I should see the "Desktops" desktop text

  Scenario Outline:  User should navigate to BuildYouOwnComputer and add them to cart successfully
    Given I am on homepage
    When I click Computer link
    And I click on Desktops link
    And I click on "Build your own computer" Build your own computer
    And I select "<processor>" processor
    And I select "<ram>" ram
    And I select "<hdd>" hdd
    And I select "<os>" os
    And I select "<software>" software
    And I click on add to cart  Button Add To Cart
    Then I should see message "The product has been added to your shopping cart" product has been added to your shopping cart

    Examples:

      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista  Home [+$50.00]   | Total Commander [+$5.00]   |




