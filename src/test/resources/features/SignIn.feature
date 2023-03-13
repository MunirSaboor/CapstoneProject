@smokeTest
Feature: Sign in Feature

  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'saboor12@gmail.com' and password 'Tek@1234'
    And User click on login button
    Then User should be logged in into Account

  Scenario: Verify user can create an acount into Retail website
    Given User is on retail website
    When User click on Sign in option
    And User click on create New Account button
    And User fill the signUp information with below data
      | name | email                 | password  | confirmPassword |
      | test | tek.sab57@gmail.com | Tek@12347 | Tek@12347       |
    And User click on SignUp button
    Then User should be logged into account page
